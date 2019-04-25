package cases;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:src/cucumber-reports"},
features = {"src/test/resources/cases/alex.feature"},monochrome = true,dryRun = false)
public class RuncaseStudy {

}
