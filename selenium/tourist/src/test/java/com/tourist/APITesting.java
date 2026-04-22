package com.tourist;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APITesting {

	public static void main(String[] args) {
		Response response = null;
		RequestSpecification request;
		String systemId = null;
		RestAssured.baseURI = "http://localhost:3001";

		request = RestAssured.given();
		response = request.get("/employees");
		int statusCode = response.statusCode();
		System.out.println(" Check the existing employees "+statusCode+" "+response.asPrettyString());

		JsonPath jp = response.jsonPath();
		
		List<Map<String, Object>> allEmployees = jp.getList("$"); 

if (allEmployees != null && !allEmployees.isEmpty()) {
    
    for (Map<String, Object> employee : allEmployees) {
        // Extract the business ID (empId) to check the condition
        String currentEmpId = employee.get("empId").toString();
        
        if (currentEmpId.equals("EMP04")) {
            // Extract the system ID (id) needed for the URL
            systemId = employee.get("id").toString();

			// create payload, put request
			Map<String, Object> newBook = new HashMap<>();

			newBook.put("empId", "EMP04");
			newBook.put("firstName", "Testing");
			newBook.put("lastName", "Automation");
			newBook.put("jobTitle", "QA");
			response = request.contentType(ContentType.JSON).body(newBook).put("employees/"+systemId);
			System.out.println("Status code "+response.statusCode());
			System.out.println(" Check the existing employees "+statusCode+" "+response.asPrettyString());

			// patch request
			newBook.put("jobTitle", "QA Testing");
			response = request.contentType(ContentType.JSON).body(newBook).patch("employees/"+systemId);
			System.out.println("Status code "+response.statusCode());
			System.out.println("Patch request "+statusCode+" "+response.asPrettyString());

            // Perform the delete using the systemId
            response = request.delete("employees/" + systemId);
            
            System.out.println("Deleted EMP04 (System ID: " + systemId + ") - Status: " + response.statusCode());
        
		
		}
    }
} else {
    System.out.println("No employees found or list is null.");
}

		// check again after delete the employees
		response = request.get("/employees");
		System.out.println(" Check the existing employees "+statusCode+" "+response.asPrettyString());

		// add new book
	Map<String, Object> newBook = new HashMap<>();
    newBook.put("empId", "EMP04");
    newBook.put("firstName", "Test");
    newBook.put("lastName", "Automation");
    newBook.put("jobTitle", "QA");
	response = request.contentType(ContentType.JSON).body(newBook).post("/employees");
	System.out.println("New employee created "+newBook);
	System.out.println(response.statusCode());

	
	}
	
}	


