package sanesean.springframework.sfgpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sanesean.springframework.sfgpetclinic.services.map.VetServiceMap;

@RequestMapping({"vets", "/vets.html"})
@Controller
public class VetController {
    private final VetServiceMap vetServiceMap;

    @Autowired
    public VetController(VetServiceMap vetServiceMap) {
        this.vetServiceMap = vetServiceMap;
    }

    @RequestMapping({"", "/index"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetServiceMap.findAll());
        return "vets/index";
    }
}
