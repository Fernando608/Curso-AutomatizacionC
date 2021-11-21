package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private ChoucairAcademyPage choucairAcademyPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
