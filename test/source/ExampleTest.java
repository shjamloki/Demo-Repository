package source;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;



public class ExampleTest {

	@Test
	public void printMessageTest() {
		AssertJUnit.assertTrue("Hello World".equals(new Example().printMessage("Hello World")));
	}

}
