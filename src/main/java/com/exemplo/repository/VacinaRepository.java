package com.exemplo.repository;

import com.exemplo.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
