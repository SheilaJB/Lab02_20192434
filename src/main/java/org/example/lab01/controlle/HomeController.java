package org.example.lab01.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {return "home";}

    @PostMapping("/formulario")
    public String formulario(
            @RequestParam("longitud") int longitud,
            @RequestParam("nummax") int nummax,
            @RequestParam("tema") String tema
    )
    {
        return "Home";}
}

