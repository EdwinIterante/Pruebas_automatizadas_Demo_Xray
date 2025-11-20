package co.com.screenplay.project.questions;

import co.com.screenplay.project.model.TextBoxData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.screenplay.project.ui.TextBoxLocatorsUI.*;

@AllArgsConstructor
@Slf4j
public class ValidateOutputTextBoxQuestion implements Question<Boolean> {

    @Override
    @Subject("{0} realiza validacion del output de Text Box ")
    public Boolean answeredBy(Actor actor) {

        TextBoxData data = actor.recall("formData");

        // Datos del output
        String nameOutput = OUTPUT_NAME.resolveFor(actor).getText().replace("Name:", "").trim();
        String emailOutput = OUTPUT_EMAIL.resolveFor(actor).getText().replace("Email:", "").trim();
        String currentAddressOutput = OUTPUT_CURRENT_ADREESS.resolveFor(actor).getText().replace("Current Address :", "").trim();
        String permanentAddressOutput = OUTPUT_PERMANENT_ADREESS.resolveFor(actor).getText().replace("Permananet Address :", "").trim();

        log.info("Expected Name: {}", data.getUserName());
        log.info("Actual Name:   {}", nameOutput);

        boolean nameValid = nameOutput.equals(data.getUserName());
        boolean emailValid = emailOutput.equals(data.getUserEmail());
        boolean currentValid = currentAddressOutput.equals(data.getCurrentAddress());
        boolean permanentValid = permanentAddressOutput.equals(data.getPermanentAddress());

        boolean result = nameValid && emailValid && currentValid && permanentValid;

        log.info("Validation result = {}", result);

        return result;
    }

    public static ValidateOutputTextBoxQuestion isCorrect() {
        return new ValidateOutputTextBoxQuestion();
    }

}
