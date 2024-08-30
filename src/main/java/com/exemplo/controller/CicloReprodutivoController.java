package com.exemplo.controller;

import com.exemplo.model.CicloReprodutivo;
import com.exemplo.service.CicloReprodutivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciclos-reprodutivos")
public class CicloReprodutivoController {

    @Autowired
    private CicloReprodutivoService cicloReprodutivoService;

    @PostMapping
    public CicloReprodutivo adicionarCicloReprodutivo(@RequestBody CicloReprodutivo cicloReprodutivo) {
        return cicloReprodutivoService.salvarCicloReprodutivo(cicloReprodutivo);
    }

    @GetMapping
    public List<CicloReprodutivo> listarCiclosReprodutivos() {
        return cicloReprodutivoService.listarCiclosReprodutivos();
    }

    @GetMapping("/{id}")
    public CicloReprodutivo buscarCicloReprodutivoPorId(@PathVariable Long id) {
        return cicloReprodutivoService.buscarCicloReprodutivoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarCicloReprodutivo(@PathVariable Long id) {
        cicloReprodutivoService.deletarCicloReprodutivo(id);
    }
}
