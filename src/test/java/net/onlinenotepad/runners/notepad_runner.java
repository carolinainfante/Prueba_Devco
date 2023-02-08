package net.onlinenotepad.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/my-devco-feature.feature",
        glue = "net.onlinenotepad.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class notepad_runner {
        
        private WebDriver https://www.online-notepad.net/es/bloc-de-notas-onlinerowser;
        private Actor nota = Actor.named("es una nota");

public void setUp(){
        nota.can(BrowseTheWeb.with)
}     
      
}
 


