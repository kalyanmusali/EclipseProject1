package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvides {
	
	@Test(dataProvider = "getData")
	public void testCaseData(String greating,String communication,int id) {
		System.out.println(greating+communication+id);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//we can use "Object" because of we can pass string and integers 
	Object[][] data= {{"kalya","hi",1},{"vicky","hello",2},{"nithin","bye",3}};
	return data;
	
	
	
	
	
	
	}
	

}
