package runningfileorangehrm;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions( 
		features= {"src/test/resources/feature"},
		dryRun= !true,
		glue="oranghrmcode",
		snippets=SnippetType.CAMELCASE,
		monochrome=true 
)
public class runningoranghrm  extends AbstractTestNGCucumberTests{

}
