package cucmberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefination")

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	private void GitDem() {
		// TODO Auto-generated method stub
		System.out.println("Edited by UserB for GitDemo");
		System.out.println("Edited by UserA for GitDemo");
		System.out.println("Edited by UserA1 for GitDemo");
		System.out.println("Edited by UserA2 for GitDemo");



	}
	

}
