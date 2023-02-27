package br.com.eletra.repository;

import br.com.eletra.model.CategoryEntity;
import br.com.eletra.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ModelEntityRepository extends JpaRepository<ModelEntity, String> {
    List<ModelEntity> findModelsByCategoryNameIgnoreCase(String categoryName);
}