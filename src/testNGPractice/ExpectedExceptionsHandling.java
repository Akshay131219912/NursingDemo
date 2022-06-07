package testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExpectedExceptionsHandling {
  @Test(expectedExceptions = NumberFormatException.class)
  public void test() {
	  //Exception is handled with above condition without try and catch block
	  String s = "100A";
	  Integer.parseInt(s);
  }
}
