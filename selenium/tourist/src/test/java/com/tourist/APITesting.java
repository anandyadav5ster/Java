package com.tourist;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class APITesting {

	
	public static void main(String[] args) {
		//--setup html report
	String reportPath = System.getProperty("user.dir")+"\\selenium\\Reports\\"+"extentReport.html";
	System.out.println(reportPath);
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
	ExtentReports extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
	 ExtentTest test = null;

		Response response = null;
		RequestSpecification request;
		String systemId = null;
		try{
		RestAssured.baseURI = "http://localhost:3001";

		request = RestAssured.given();

		// Create a test entry in the report
        test = extent.createTest("Get Employees", "Verify employee by business ID");
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
			test.log(Status.INFO, "Verify put request");
			Map<String, Object> newBook = new HashMap<>();

			newBook.put("empId", "EMP04");
			newBook.put("firstName", "Testing");
			newBook.put("lastName", "Automation");
			newBook.put("jobTitle", "QA");
			response = request.contentType(ContentType.JSON).body(newBook).put("employees/"+systemId);
			System.out.println("Status code "+response.statusCode());
			System.out.println(" Check the existing employees "+statusCode+" "+response.asPrettyString());

			// patch request
			test.log(Status.INFO, "Verify patch request");
			newBook.put("jobTitle", "QA Testing");
			response = request.contentType(ContentType.JSON).body(newBook).patch("employees/"+systemId);
			System.out.println("Status code "+response.statusCode());
			System.out.println("Patch request "+statusCode+" "+response.asPrettyString());

            // Perform the delete using the systemId
			// Create a test entry in the report
        	test.log(Status.INFO,"Delete Employee EMP03 and Verify deletion of employee by business ID");
            response = request.delete("employees/" + systemId);
            
            System.out.println("Deleted EMP04 (System ID: " + systemId + ") - Status: " + response.statusCode());
        
		
		}
    }
} else {
    System.out.println("No employees found or list is null.");
}

		// check again after delete the employees
		test.log(Status.INFO, "Verify get request");
		response = request.get("/employees");
		System.out.println(" Check the existing employees "+statusCode+" "+response.asPrettyString());

		// add new book

		test.log(Status.INFO, "Verify post request");
	Map<String, Object> newBook = new HashMap<>();
    newBook.put("empId", "EMP04");
    newBook.put("firstName", "Test");
    newBook.put("lastName", "Automation");
    newBook.put("jobTitle", "QA");
	response = request.contentType(ContentType.JSON).body(newBook).post("/employees");
	System.out.println("New employee created "+newBook);
	System.out.println(response.statusCode());

	
	}

catch (Exception e) {
            test.log(Status.FAIL, "An error occurred: " + e.getMessage());
        } finally {
            // --- 4. Save/Flush the report ---
            extent.flush(); 
            System.out.println("Report generated: extentReport.html");
        }
	}
}	


