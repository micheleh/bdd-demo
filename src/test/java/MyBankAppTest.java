import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags="not @exclude")
//@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results\\TestMyBankApp_OctaneGherkinResults.xml",
//tags="not @exclude")
//@CucumberOptions(plugin = "junit:target/cucumber-reports/cucumber-junit.xml")
public class MyBankAppTest {
}
