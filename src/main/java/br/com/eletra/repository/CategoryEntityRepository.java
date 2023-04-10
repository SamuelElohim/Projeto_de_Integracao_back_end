package br.com.eletra.repository;

import br.com.eletra.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, String> {
    List<CategoryEntity> findCategoriesByLineNameIgnoreCase(String lineName);
}