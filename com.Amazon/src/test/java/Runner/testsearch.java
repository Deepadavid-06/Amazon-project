package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features= {"src/test/java/feature/search.feature"},
glue="searchstep",
dryRun=false
)
public class testsearch extends AbstractTestNGCucumberTests {

}
