package co.com.screenplay.project.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FillField implements Interaction {

    private final Target target;
    private final String value;

    public FillField(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    public static FillField with(Target target, String value) {
        return new FillField(target, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(target),
                WaitUntil.the(target, isEnabled()),
                ClearField.of(target),
                Enter.theValue(value).into(target).thenHit(Keys.TAB)
        );
    }

}

