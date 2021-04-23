package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final List<Vizitka> listVizitek;

  public VizitkaController() {
    listVizitek = Arrays.asList(
            new Vizitka("Panenka", "Maková", "Zahradní", "Mákovice 12300", "makovaPanenka@email.cz", "100 100 100", "null"),
            new Vizitka("Emanuel", "Motýl","Květinková", "Luční Bouda 10022", "motylEmanuel@email.cz", "123 123 123", "https://www.albatros.cz/tituly/20660/makova-panenka-a-motyl-emanuel/"),
            new Vizitka("Čarodějnice", "Malá","Začarovaná", "Chaloupka 12345", "babaJaga@email.cz", "null", "www.carodejnice-babice.cz"),
            new Vizitka("Amálka", "Víla","Krásná", "11122", "vilaAmalka@email.cz", "111 222 333", "null"),
            new Vizitka("Vševěd", "Rákosníček","Mokrá", "rybníček Brčálník 10101", "rakosak@email.cz", "null", "null")
    );;
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("vizitka/seznam");
    modelAndView.addObject("vizitka",listVizitek);
    return modelAndView;
  }

  @GetMapping("/detail")
  public String detail() {
    return "detail";
  }
}
