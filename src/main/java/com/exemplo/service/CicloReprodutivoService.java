package com.exemplo.service;

import com.exemplo.model.CicloReprodutivo;
import com.exemplo.repository.CicloReprodutivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloReprodutivoService {

    @Autowired
    private CicloReprodutivoRepository cicloReprodutivoRepository;

    public CicloReprodutivo salvarCicloReprodutivo(CicloReprodutivo cicloReprodutivo) {
        return cicloReprodutivoRepository.save(cicloReprodutivo);
    }

    public List<CicloReprodutivo> listarCiclosReprodutivos() {
        return cicloReprodutivoRepository.findAll();
    }

    public CicloReprodutivo buscarCicloReprodutivoPorId(Long id) {
        return cicloReprodutivoRepository.findById(id).orElse(null);
    }

    public void deletarCicloReprodutivo(Long id) {
        cicloReprodutivoRepository.deleteById(id);
    }
}
