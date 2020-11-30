package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.CidenetHome.*;


public class Home  implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HOME));
    }

    public static Home irahome(){
        return new Home();
    }
}
