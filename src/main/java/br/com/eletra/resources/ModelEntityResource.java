package br.com.eletra.resources;

import br.com.eletra.model.CategoryEntity;
import br.com.eletra.model.LineEntity;
import br.com.eletra.model.ModelEntity;
import br.com.eletra.repository.LineEntityRepository;
import br.com.eletra.repository.ModelEntityRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Modelos")
@CrossOrigin(origins = "*")
public class ModelEntityResource {

    @Autowired
    ModelEntityRepository modelEntityRepository;

    @GetMapping("/modelos")
    @ApiOperation(value = "Retorna uma lista com todas os modelos de medidores")
    public List<ModelEntity> getList() {
        return modelEntityRepository.findAll();
    }

    @GetMapping("/modelos/{categoryName}")
    @ApiOperation(value = "Retorna uma lista de modelos de medidores uma única categoria")
    public List<ModelEntity> getfilteredList(@PathVariable(value = "categoryName") String categoryName){
        return modelEntityRepository.findModelsByCategoryNameIgnoreCase(categoryName);
    }

    @PostMapping("/modelo")
    @ApiOperation(value = "Salva uma única categoria")
    public ModelEntity saveEntity(@RequestBody ModelEntity modelEntity) {
        return modelEntityRepository.save(modelEntity);
    }

    @PutMapping("/modelo")
    @ApiOperation(value = "Atualiza uma única categoria")
    public ModelEntity updateEntity(@RequestBody ModelEntity modelEntity) {
        return modelEntityRepository.save(modelEntity);
    }

    @DeleteMapping("/modelo")
    @ApiOperation(value = "Deleta uma único modelo")
    public void deleteEntity(@RequestBody ModelEntity modelEntity) {
        modelEntityRepository.delete(modelEntity);
    }
}