package testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Grouping {
  @Test(groups = "Travel")
  public void eat() {
	  System.out.println("I in eat");
  }
  @Test(groups = "Travel")
  public void travelling() {
	  System.out.println("I in travelling");
  }
  @Test(groups = "Study" )
  public void College() {
	  System.out.println("I in College");
	  int c=10/0;
  }
  @Test(groups = "Study",dependsOnMethods = "College")
  public void Library() {
	  System.out.println("I in Library");
  }
  @Test(groups = "Common")
  public void Temple() {
	  System.out.println("I in temple");
  }
  
}
