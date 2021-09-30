package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/java/api/cucumber/features"},glue={"api.cucumber.steps"},dryRun = false)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/postsWithParameter.feature"},glue={"api.cucumber.steps"},dryRun = false)
public class PostRunner {
}
