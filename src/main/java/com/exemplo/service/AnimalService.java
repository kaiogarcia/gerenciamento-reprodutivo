package com.exemplo.service;

import com.exemplo.model.Animal;
import com.exemplo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal salvarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> listarAnimais() {
        return animalRepository.findAll();
    }

    public Animal buscarAnimalPorId(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    public void deletarAnimal(Long id) {
        animalRepository.deleteById(id);
    }
}
