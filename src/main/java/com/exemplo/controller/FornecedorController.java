package com.exemplo.controller;

import com.exemplo.model.Fornecedor;
import com.exemplo.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public Fornecedor adicionarFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.salvarFornecedor(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return fornecedorService.listarFornecedores();
    }

    @GetMapping("/{id}")
    public Fornecedor buscarFornecedorPorId(@PathVariable Long id) {
        return fornecedorService.buscarFornecedorPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable Long id) {
        fornecedorService.deletarFornecedor(id);
    }
}
