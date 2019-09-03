package NyTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTest {

	//@Test(retryAnalyzer=Analyzar.ReTryAnalyzer.class)
	@Test
	public void Test1() {
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void Test2() {
		Assert.assertEquals(false, true);
	}
	
}
