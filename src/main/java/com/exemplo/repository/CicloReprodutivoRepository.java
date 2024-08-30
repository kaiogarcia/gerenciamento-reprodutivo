package com.exemplo.repository;

import com.exemplo.model.CicloReprodutivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CicloReprodutivoRepository extends JpaRepository<CicloReprodutivo, Long> {
}
