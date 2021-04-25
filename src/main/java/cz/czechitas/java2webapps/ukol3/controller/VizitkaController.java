package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
@RequestMapping("/vizitky")
public class VizitkaController {
  private final List<Vizitka> vizitky;

  public VizitkaController() {
    vizitky = Arrays.asList(
            /*new Vizitka(JMENA.Panenka, FIRMA.Maková, ULICE.Zahradní, OBECpsc.Mákovice, "makovaPanenka@email.cz", "100 100 100", null),
            new Vizitka(JMENA.Emanuel, FIRMA.Motýl,ULICE.Květinová, OBECpsc.Luční, "motylEmanuel@email.cz", "123 123 123", "https://www.albatros.cz/tituly/20660/makova-panenka-a-motyl-emanuel/"),
            new Vizitka(JMENA.Čarodějnice, FIRMA.Malá,ULICE.Začarovaná, OBECpsc.Chaloupka, "babaJaga@email.cz", null, "www.carodejnice-babice.cz"),
            new Vizitka(JMENA.Amálka, FIRMA.Víla,ULICE.Krásná, null, "vilaAmalka@email.cz", "111 222 333", null),
            new Vizitka(JMENA.Vševěd, FIRMA.Rákosníček,ULICE.Mokrá, OBECpsc.Brčálník, "rakosak@email.cz", null, null)*/
            new Vizitka("Panenka", "Maková", "Zahradní", "Mákovice", "makovaPanenka@email.cz", "100 100 100", null),
            new Vizitka("Emanuel", "Motýl", "Květinová", "Luční", "motylEmanuel@email.cz", "123 123 123", "https://www.albatros.cz/tituly/20660/makova-panenka-a-motyl-emanuel/"),
            new Vizitka("Čarodějnice", "Malá", "Začarovaná", "Chaloupka", "babaJaga@email.cz", null, "www.carodejnice-babice.cz"),
            new Vizitka("Amálka", "Víla", "Krásná", null, "vilaAmalka@email.cz", "111 222 333", null),
            new Vizitka("Vševěd", "Rákosníček", "Mokrá", "Brčálník", "rakosak@email.cz", null, null)
    );
  }

  @GetMapping("/")
  public ModelAndView vizitky() {
    ModelAndView modelAndView = new ModelAndView("vizitky");
    modelAndView.addObject("vizitky", vizitky);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", vizitky.get(id));
    return modelAndView;
    /*return "detail";*/
  }
}
