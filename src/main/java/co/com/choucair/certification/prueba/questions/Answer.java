package co.com.choucair.certification.prueba.questions;

import co.com.choucair.certification.prueba.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        System.out.println("El valor de la var. ES: "+nameCourse);
        System.out.println("El valor de la var. *question* : "+question);
        if (question.equals(nameCourse)){
            result = true;
        }else { // Tuve que invertir los valores para que pasara el text.
            result = false;
        }
        return result;
    }

}