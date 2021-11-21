package co.com.choucair.certification.prueba.stepdefinitions;

import co.com.choucair.certification.prueba.model.AcademyChoucairData;
import co.com.choucair.certification.prueba.questions.Answer;
import co.com.choucair.certification.prueba.tasks.Login;
import co.com.choucair.certification.prueba.tasks.OpenUp;
import co.com.choucair.certification.prueba.tasks.Search;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^que Brandon quiere aprender automatizacion en la academia Choucair$")
    public void queBrandonQuiereAprenderAutomatizacionEnLaAcademiaChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }


    @When("^el busca un curso en la plataforma de la academia choucair$")
    public void unaBusquedaDelCursoRecursosAutomatizacionBancolombiaEnLaPlataformaDeLaAcademiaChoucair(List<AcademyChoucairData> academyChoucairData)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^encuentra el curso llamado$")
    public void encuentraElCursoLlamadoRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
