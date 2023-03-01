package br.com.eletra.resources;

import br.com.eletra.model.CategoryEntity;
import br.com.eletra.model.LineEntity;
import br.com.eletra.model.ModelEntity;
import br.com.eletra.repository.LineEntityRepository;
import br.com.eletra.repository.ModelEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ModelEntityResource {

    @Autowired
    ModelEntityRepository modelEntityRepository;

    @GetMapping("/modelos")
    public List<ModelEntity> getList() {
        return modelEntityRepository.findAll();
    }

    @GetMapping("/modelos/{categoryName}")
    public List<ModelEntity> getfilteredList(@PathVariable(value = "categoryName") String categoryName){

        return modelEntityRepository.findModelsByCategoryNameIgnoreCase(categoryName);
    }
}
