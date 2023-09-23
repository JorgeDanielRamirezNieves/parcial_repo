package com.usta.parcial1.Controller;

import com.usta.parcial1.DTO.NameDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/name")
public class PersonaController {

    NameDTO persona = new NameDTO("Jorge", "Ramírez");

    @GetMapping("/nombre")
    public String presentacion(){
        return persona.presentarPersona();
    }
}
