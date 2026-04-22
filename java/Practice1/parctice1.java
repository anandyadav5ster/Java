package Practice1;

public class parctice1{
	
	
	public static void main(String[] args){
		 reverseString();
	}
	// Reverse string
	
	static void reverseString(){
		
		String s = "Bangalore";
		
		String res = "";
		for(int i=0;i<s.length();i++){
			res = s.charAt(i)+res;
		}
		System.out.println(res);
	}


	// DatProvider
	/*@DataProvider(name="data_provider")
	pubic Object[][] dpMethod(){

		return new Object[][]{
			"val1",
			"val2"
		}
	}

	@Test(dataProvider="data_provider")
	public void myTest(String val){
		System.out.println(val);
	}
	*/
}