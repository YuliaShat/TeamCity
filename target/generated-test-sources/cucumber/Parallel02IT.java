import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/user/IdeaProjects/TeamCity/src/test/resources/Tests/ChangeInfoAboutPet.feature"},
        plugin = {"json:C:/Users/user/IdeaProjects/TeamCity/target/cucumber-parallel/2.json"},
        monochrome = false,
        tags = {"@petsTests"},
        glue = {"Steps"})
public class Parallel02IT {
}
