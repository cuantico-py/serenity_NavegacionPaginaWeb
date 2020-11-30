package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.CidenetHome.*;

public class Navegar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NOSOTROS));
        actor.attemptsTo(Click.on(NUEVOPRODUC));
        actor.attemptsTo(Click.on(SERVICIOS));
        actor.attemptsTo(Click.on(EQUIPO));
        actor.attemptsTo(Click.on(TRABAJACONNOSO));
        actor.attemptsTo(Click.on(BLOG));
        actor.attemptsTo(Click.on(CONTACTENOS));
       // actor.attemptsTo(Click.on(HOME));

    }
    public static Navegar porlapaginadecidenet(){
        return new Navegar();
    }

}
