package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenplayActors {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }




}
