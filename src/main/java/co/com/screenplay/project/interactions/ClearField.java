package co.com.screenplay.project.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class ClearField implements Interaction {

    private final Target target;

    private ClearField(Target target) {
        this.target = target;
    }

    public static ClearField of(Target target) {
        return new ClearField(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).clear();
    }
}
