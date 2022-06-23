
package com.practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.practica01.service.EstadoService;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private EstadoService EstadoService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");

        
        var estados = EstadoService.getEstados();

        model.addAttribute("estados", estados);

        return "index";
    
}
}
