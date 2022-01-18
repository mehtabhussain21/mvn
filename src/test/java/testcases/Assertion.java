package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends BaseTest{

	@Test(groups="DVT")
	public void Validation() {
		
		String expected_result = "Mehtab";
		String actual_result = "Hussain";
		SoftAssert softassert = new SoftAssert();
		System.out.println("TC is failed");
		softassert.assertEquals(actual_result, expected_result);
		//Assert.fail();  // for failing the tc forcefully
		System.out.println("Validating title");
		softassert.assertEquals(true, false, "Validating title");
		softassert.assertAll(); // for reporting failure
	}
	
}
