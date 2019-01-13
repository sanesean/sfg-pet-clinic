package sanesean.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OwnerController {
    @RequestMapping("/owners")
    public String getOwners(Model model) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("evd");
        model.addAttribute("owners", list);
        return "/owners/index";
    }
}
