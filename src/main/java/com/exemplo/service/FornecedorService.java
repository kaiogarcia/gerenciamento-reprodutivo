package com.exemplo.service;

import com.exemplo.model.Fornecedor;
import com.exemplo.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor buscarFornecedorPorId(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public void deletarFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
