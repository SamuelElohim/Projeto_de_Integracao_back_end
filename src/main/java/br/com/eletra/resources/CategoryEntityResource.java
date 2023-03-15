package br.com.eletra.resources;

import br.com.eletra.model.CategoryEntity;
import br.com.eletra.model.LineEntity;
import br.com.eletra.model.ModelEntity;
import br.com.eletra.repository.CategoryEntityRepository;
import br.com.eletra.repository.ModelEntityRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Categorias")
@CrossOrigin(origins = "*")
public class CategoryEntityResource {

    @Autowired
    CategoryEntityRepository categoryEntityRepository;

    @GetMapping("/categorias")
    @ApiOperation(value = "Retorna uma lista com todas as categorias de medidores")
    public List<CategoryEntity> getList() {
        return categoryEntityRepository.findAll();
    }

    @GetMapping("/categorias/{lineName}")
    @ApiOperation(value = "Retorna uma lista de categorias de medidores de uma única linha")
    public List<CategoryEntity> getfilteredList(@PathVariable(value = "lineName") String lineName){

        return categoryEntityRepository.findCategoriesByLineNameIgnoreCase(lineName);
    }

    @PostMapping("/categoria")
    @ApiOperation(value = "Salva uma única categoria")
    public CategoryEntity saveEntity(@RequestBody CategoryEntity categoryEntity) {
        return categoryEntityRepository.save(categoryEntity);
    }

    @PutMapping("/categoria")
    @ApiOperation(value = "Atualiza uma única categoria")
    public CategoryEntity updateEntity(@RequestBody CategoryEntity categoryEntity) {
        return categoryEntityRepository.save(categoryEntity);
    }

    @DeleteMapping("/categoria")
    @ApiOperation(value = "Deleta uma única categoria")
    public void deleteEntity(@RequestBody CategoryEntity categoryEntity) {
        categoryEntityRepository.delete(categoryEntity);
    }
}