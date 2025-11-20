package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.FillField;
import co.com.screenplay.project.model.TextBoxData;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.TextBoxLocatorsUI.*;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

@AllArgsConstructor
public class FormElementTextBoxTask implements Task {

    private final TextBoxData data;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember("formData", data);

        actor.attemptsTo(
                FillField.with(FULL_NAME_TEXT_BOX, data.getUserName()),
                FillField.with(EMAIL_TEXT_BOX, data.getUserEmail()),
                FillField.with(CURRENT_ADDRESS_TEXT_BOX, data.getCurrentAddress()),
                FillField.with(PERMANENT_ADDRESS_TEXT_BOX, data.getPermanentAddress()),
                Scroll.to(BTN_SUBMIT_TEXT_BOX),
                WaitUntil.the(BTN_SUBMIT_TEXT_BOX, isClickable()),
                Click.on(BTN_SUBMIT_TEXT_BOX)
        );
        waiting(TIME_SHORT);
    }

    public static FormElementTextBoxTask withData(TextBoxData data) {
        return new FormElementTextBoxTask(data);
    }

}
