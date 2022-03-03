package qa.runner;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/features/",
                    glue = {"qa.stepDefinition","qa.setup"},
                   /* tags = "@test",*/
                    monochrome=true,
                    plugin = {"pretty", "summary","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, snippets = CAMELCASE)

public class TestRunner {

}
