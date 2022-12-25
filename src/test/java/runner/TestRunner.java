package runner;

import Deepdive.QardyTestCasesT1.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = {"steps"}, 
plugin = {"pretty","html:target/cucumberr-html.html"})
public class TestRunner extends TestBase  {

}
