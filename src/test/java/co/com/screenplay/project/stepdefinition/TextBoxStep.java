package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.model.TextBoxData;
import co.com.screenplay.project.questions.ValidateOutputTextBoxQuestion;
import co.com.screenplay.project.tasks.ChooseElementComponentTask;
import co.com.screenplay.project.tasks.FormElementTextBoxTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


@Slf4j
public class TextBoxStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("selecciona el componente Text Box")
    public void selectTextBoxComponent() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ChooseElementComponentTask.withOutOption()
        );
    }

    @And("diligencia el formulario con información válida")
    public void FormWithValidInformation(){

        TextBoxData data = new TextBoxData(); //datos de prueba

        OnStage.theActorInTheSpotlight().attemptsTo(
                FormElementTextBoxTask.withData(data)
        );
    }

    @Then("debera visualizar en el panel de resultados con los datos ingresados")
    public void resultsPanelDataEntered(){
        theActorInTheSpotlight().should(seeThat(
                ValidateOutputTextBoxQuestion.isCorrect())
        );
    }

}
