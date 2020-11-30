package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CidenetHome {

    public static final Target NOSOTROS = Target.the("nosotros").located(By.xpath("//*[@id=\"cidenet-menu-bar\"]/div/ul/li[1]/a"));
    public static final Target NUEVOPRODUC = Target.the("nuevoproducto").located(By.xpath("//*[@id=\"cidenet-menu-bar\"]/div/ul/li[2]/a"));
    public static final Target SERVICIOS = Target.the("servicios").located(By.xpath("//*[@id=\"cidenet-menu-bar\"]/div/ul/li[3]/a"));
    public static final Target EQUIPO = Target.the("equipo").located(By.xpath("//*[@id=\"cidenet-menu-bar\"]/div/ul/li[5]/a"));
    public static final Target TRABAJACONNOSO = Target.the("trabajaconnosotros").located(By.xpath("//*[@id=\"cidenet-menu-bar\"]/div/ul/li[6]/a"));
    public static final Target BLOG = Target.the("blog").located(By.xpath("//*[@id=\"cidenet-menu-bar\"]/div/ul/li[7]/a"));
    public static final Target CONTACTENOS = Target.the("contactenos").located(By.xpath("//*[@id=\"cidenet-menu-bar\"]/div/ul/li[8]/a"));
    public static final Target HOME = Target.the("home").located(By.xpath("//*[@id=\"cidenet-logo-top\"]"));

}
