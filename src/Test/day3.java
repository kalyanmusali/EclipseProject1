package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@AfterClass
	public void aff() {
		System.out.println("iam a after class");
	}

	@BeforeClass
	public void clss() {
		System.out.println("iam a before class");
	}

	@AfterMethod
	public void m() {
		System.out.println("iam a after method");
	}

	@Parameters({ "URL" })
	@Test
	public void day3is1(String urlname) {
		System.out.println("day3is1");
		System.out.println(urlname);

	}

	@BeforeSuite
	public void bee() {
		System.out.println("iam before suite");
	}

	@Test(dependsOnMethods = { "day3is1" })
	public void day3is2() {
		System.out.println("day3is2");
	}

	@AfterSuite
	public void aa() {
		System.out.println("iam after suite");
	}

	@Test(groups = { "smoke" })
	public void day3is3() {
		System.out.println("day3is3");
	}

	@Test(dataProvider = "getData")
	public void dataprovider(String username, String password) {
		System.out.println("data provider successfully done");
		System.out.println(username);
		System.out.println(password);
	}

	@Test()
	public void Listeners() {
		System.out.println("iam a listeners");
		Assert.assertTrue(false);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		// 1st set

		data[0][0] = "firstsetusername";
		data[0][1] = "first password";

		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "second password";

		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "third password";
		return data;
	}

}
