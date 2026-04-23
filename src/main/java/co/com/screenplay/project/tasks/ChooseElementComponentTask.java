package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.TextBoxLocatorsUI.HEADER_TEXT_BOX;
import static co.com.screenplay.project.ui.TextBoxLocatorsUI.ITEM_TEXT_BOX;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChooseElementComponentTask implements Task {

    public ChooseElementComponentTask() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ITEM_TEXT_BOX, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(ITEM_TEXT_BOX),
                Click.on(ITEM_TEXT_BOX),
                WaitUntil.the(HEADER_TEXT_BOX, isVisible()).forNoMoreThan(5).seconds()
                );
    }

    public static ChooseElementComponentTask withOutOption() {
        return new ChooseElementComponentTask();
    }
}
