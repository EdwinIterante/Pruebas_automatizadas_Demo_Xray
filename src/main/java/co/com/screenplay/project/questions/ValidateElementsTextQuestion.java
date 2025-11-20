package co.com.screenplay.project.questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.screenplay.project.ui.HomeLocatorsUI.TXT_RANDOM_NAME_BTN;

@AllArgsConstructor
@Slf4j
public class ValidateElementsTextQuestion implements Question<Boolean> {

    private String validTextSubElementBtn;

    @Override
    @Subject("{0} realiza validación del elemento capturado en header con dicho parametro #validTextSubElementBtn")
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String validTextBtnHeader = TXT_RANDOM_NAME_BTN.resolveFor(actor).getText();

        if (validTextBtnHeader != null && validTextSubElementBtn.equals(validTextBtnHeader)) {
            log.info(validTextBtnHeader);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static ValidateElementsTextQuestion withParams(String validTextSubElementBtn) {
        return new ValidateElementsTextQuestion(validTextSubElementBtn);
    }

}
