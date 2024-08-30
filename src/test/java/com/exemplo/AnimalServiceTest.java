package com.exemplo;

import com.exemplo.model.Animal;
import com.exemplo.repository.AnimalRepository;
import com.exemplo.service.AnimalService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
public class AnimalServiceTest {

    @InjectMocks
    private AnimalService animalService;

    @Mock
    private AnimalRepository animalRepository;

    public AnimalServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarAnimal() {
        Animal animal = new Animal();
        when(animalRepository.save(animal)).thenReturn(animal);
        animalService.salvarAnimal(animal);
        verify(animalRepository, times(1)).save(animal);
    }
}
