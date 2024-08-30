package com.exemplo.controller;

import com.exemplo.model.Animal;
import com.exemplo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public Animal adicionarAnimal(@RequestBody Animal animal) {
        return animalService.salvarAnimal(animal);
    }

    @GetMapping
    public List<Animal> listarAnimais() {
        return animalService.listarAnimais();
    }

    @GetMapping("/{id}")
    public Animal buscarAnimalPorId(@PathVariable Long id) {
        return animalService.buscarAnimalPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAnimal(@PathVariable Long id) {
        animalService.deletarAnimal(id);
    }
}
