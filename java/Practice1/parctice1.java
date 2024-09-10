public class practice1{
	
	
	public static void main(String[] args){
		// reverseString();
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

	static void checkBrokenLinks(){

		List<WebElement> links = driver.findElements(By.tagname("a"));
		for(WebElement link : links){
			String url = link.getAttribute("href");
			verify(url);
		}
	}
	static void verify(String url){

		URL link = new URL(url);
		HttpConnection connection = new (HttpConnection)link.openConnection();
		connection.setConnectionTimeOut(3000);
		int statuscode = connection.connect();
		if(statuscode==200){
			System.out.println("URL is valid");
		}
		else{
			System.out.println("URl is not valid");
		}
	}
	static void takescreenshot(){
		TakeScreenshot srcshot = ((TakeScreenshot)driver);
		File src = srcshot.getScreenshotAs(Output.File);
		FileUtils.copyFile(src, new File("path to save"));
	}

	static void windowHandle(){
		String pw= driver.getWindowHandle();
		Set<String> allwin = driver.getWindowhandles();
		Iterator<String> it = allwin.iterator();
		while(it.hasNext()){
			String cw = it.next();
			if(!cw.equalIgnoreCase(pw)){
				driver.switchTo.Window(cw);
			}
		}
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