package sanesean.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sanesean.springframework.sfgpetclinic.model.Owner;
import sanesean.springframework.sfgpetclinic.services.map.OwnerMapService;

import java.util.Set;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerMapService ownerServiceMap;

    public OwnerController(OwnerMapService ownerServiceMap) {
        this.ownerServiceMap = ownerServiceMap;
    }

    @RequestMapping("/")
    public String getOwners(Model model) {
        Set<Owner> ownerSets = ownerServiceMap.findAll();
        model.addAttribute("owners", ownerSets);
        return "/owners/index";
    }
    @RequestMapping("/find")
    public String findOwners() {
        return "notimplemented";
    }
}
