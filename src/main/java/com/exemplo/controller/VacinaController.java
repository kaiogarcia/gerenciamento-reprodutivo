package com.exemplo.controller;

import com.exemplo.model.Vacina;
import com.exemplo.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @PostMapping
    public Vacina adicionarVacina(@RequestBody Vacina vacina) {
        return vacinaService.salvarVacina(vacina);
    }

    @GetMapping
    public List<Vacina> listarVacinas() {
        return vacinaService.listarVacinas();
    }

    @GetMapping("/{id}")
    public Vacina buscarVacinaPorId(@PathVariable Long id) {
        return vacinaService.buscarVacinaPorId(id);
    }
}
