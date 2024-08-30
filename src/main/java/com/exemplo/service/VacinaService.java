package com.exemplo.service;

import com.exemplo.model.Vacina;
import com.exemplo.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    public Vacina salvarVacina(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    public List<Vacina> listarVacinas() {
        return vacinaRepository.findAll();
    }
}
