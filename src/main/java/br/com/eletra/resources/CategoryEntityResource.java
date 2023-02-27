package br.com.eletra.resources;

import br.com.eletra.model.CategoryEntity;
import br.com.eletra.model.ModelEntity;
import br.com.eletra.repository.CategoryEntityRepository;
import br.com.eletra.repository.ModelEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CategoryEntityResource {

    @Autowired
    CategoryEntityRepository categoryEntityRepository;

    @GetMapping("/categorias")
    public List<CategoryEntity> getList() {
        return categoryEntityRepository.findAll();
    }

    @GetMapping("/categorias/{lineName}")
    public List<CategoryEntity> getfilteredList(@PathVariable(value = "lineName") String lineName){

        return categoryEntityRepository.findCategoriesByLineNameIgnoreCase(lineName);
    }
}
