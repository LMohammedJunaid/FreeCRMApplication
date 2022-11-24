package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FreeCRMApplication",
                      glue = "stepDefination",
                      monochrome = true
                      )
public class TestRunner {

}
