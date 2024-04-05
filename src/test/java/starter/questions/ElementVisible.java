package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ElementVisible implements Question<Boolean> {
    private Target value;

    public ElementVisible(Target value) {
        this.value = value;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return actor.asksFor(Visibility.of(value));
    }

    public static ElementVisible withLocator(Target value) {
        return new ElementVisible(value);
    }
}

