package com.exemplo;

import com.exemplo.model.Fornecedor;
import com.exemplo.repository.FornecedorRepository;
import com.exemplo.service.FornecedorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
public class FornecedorServiceTest {

    @InjectMocks
    private FornecedorService fornecedorService;

    @Mock
    private FornecedorRepository fornecedorRepository;

    public FornecedorServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        when(fornecedorRepository.save(fornecedor)).thenReturn(fornecedor);
        fornecedorService.salvarFornecedor(fornecedor);
        verify(fornecedorRepository, times(1)).save(fornecedor);
    }
}
