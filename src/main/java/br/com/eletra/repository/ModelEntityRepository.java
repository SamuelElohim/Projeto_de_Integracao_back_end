package br.com.eletra.repository;

import br.com.eletra.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ModelEntityRepository extends JpaRepository<ModelEntity, String> {
    List<ModelEntity> findModelsByCategoryNameIgnoreCase(String categoryName);
}