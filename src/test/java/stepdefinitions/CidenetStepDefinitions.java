package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.DriverChrome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import task.Home;
import task.Navegar;

public class CidenetStepDefinitions {

    private Actor actor = Actor.named("actor");
    private DriverChrome driverChrome = new DriverChrome();

    @Given("^dado que el usuario  esta en la pag de cidenet$")
    public void dadoQueElUsuarioEstaEnLaPagDeCidenet() {

        actor.can(BrowseTheWeb.with(driverChrome.setupDriver()));
        actor.wasAbleTo(Open.url("https://cidenet.com.co"));



    }

    @When("^cuando el usuario seleccione las pestanas Nosotros, Nuevo proyecto, Servicios, Equipo, Trabaja con Nosotros, Blog, Contactanos$")
    public void cuandoElUsuarioSeleccioneLasPestanasNosotrosNuevoProyectoServiciosEquipoTrabajaConNosotrosBlogContactanos() {
        // Write code here that turns the phrase above into concrete actions
        //mapeo los elementos
        actor.attemptsTo(Navegar.porlapaginadecidenet());

    }

    @When("^el usuario  va al Home$")
    public void elUsuarioVaAlHome() {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(Home.irahome());
    }

    @Then("^el usuario ve la pantalla del Home$")
    public void elUsuarioVeLaPantallaDelHome() {
        // Write code here that turns the phrase above into concrete actions

    }
@After
    public void cerrarDriver(){
        driverChrome.closeDriver();

}



}
