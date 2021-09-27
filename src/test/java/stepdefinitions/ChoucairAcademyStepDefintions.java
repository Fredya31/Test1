package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import userinterface.Buscar;

import java.util.List;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than JohnF wants to learn automation at the academy Choucair$")
    public void thanJohnFWantsToLearAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorCalled("JohnF").wasAbleTo(OpenUp.thePage(), (Login.OnThePage(
                academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword())));
    }


    @When("^he search for the course (.*) the Choucair academy platform$")
    public void heSearchForTheRecursosAutomatizacionBacolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he fonds the called resources Recursos Automatización Bacolombia$")
    public void heFondsTheCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }
}
