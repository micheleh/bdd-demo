import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results\\TestMyBankApp_OctaneGherkinResults.xml",
tags="not @exclude")
public class MyBankAppTest {
}
