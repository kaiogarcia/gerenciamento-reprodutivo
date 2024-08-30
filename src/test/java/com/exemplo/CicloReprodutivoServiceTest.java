package com.exemplo;

import com.exemplo.model.CicloReprodutivo;
import com.exemplo.repository.CicloReprodutivoRepository;
import com.exemplo.service.CicloReprodutivoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
public class CicloReprodutivoServiceTest {

    @InjectMocks
    private CicloReprodutivoService cicloReprodutivoService;

    @Mock
    private CicloReprodutivoRepository cicloReprodutivoRepository;

    public CicloReprodutivoServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarCicloReprodutivo() {
        CicloReprodutivo cicloReprodutivo = new CicloReprodutivo();
        when(cicloReprodutivoRepository.save(cicloReprodutivo)).thenReturn(cicloReprodutivo);
        cicloReprodutivoService.salvarCicloReprodutivo(cicloReprodutivo);
        verify(cicloReprodutivoRepository, times(1)).save(cicloReprodutivo);
    }
}
