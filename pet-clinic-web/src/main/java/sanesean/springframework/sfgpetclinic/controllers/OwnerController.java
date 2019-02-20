package sanesean.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sanesean.springframework.sfgpetclinic.model.Owner;
import sanesean.springframework.sfgpetclinic.services.OwnerService;

import java.util.Set;

@RequestMapping("owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/index"})
    public String getOwners(Model model) {
        Set<Owner> ownerSets = ownerService.findAll();
        model.addAttribute("owners", ownerSets);
        return "owners/index";
    }
    @RequestMapping("/find")
    public String findOwners() {
        return "notimplemented";
    }
}
