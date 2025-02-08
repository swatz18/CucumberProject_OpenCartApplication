package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/login.feature",
				  glue={"stepDefinitions","hooks"},
				  publish=true)
public class TestRunner {

}
