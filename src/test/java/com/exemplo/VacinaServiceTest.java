package com.exemplo;

import com.exemplo.model.Vacina;
import com.exemplo.repository.VacinaRepository;
import com.exemplo.service.VacinaService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
public class VacinaServiceTest {

    @InjectMocks
    private VacinaService vacinaService;

    @Mock
    private VacinaRepository vacinaRepository;

    public VacinaServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarVacina() {
        Vacina vacina = new Vacina();
        when(vacinaRepository.save(vacina)).thenReturn(vacina);
        vacinaService.salvarVacina(vacina);
        verify(vacinaRepository, times(1)).save(vacina);
    }
}
