package br.com.eletra.repository;

import br.com.eletra.model.LineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineEntityRepository extends JpaRepository<LineEntity, String> {
}