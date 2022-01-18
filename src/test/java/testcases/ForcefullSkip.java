package testcases;

import org.testng.SkipException;

public class ForcefullSkip {
	
	public void Skipping() {
		
		throw new SkipException("Condition is not met so skipping the tc");
	}

}
