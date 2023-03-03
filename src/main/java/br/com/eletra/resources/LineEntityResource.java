package br.com.eletra.resources;

import br.com.eletra.model.LineEntity;
import br.com.eletra.repository.LineEntityRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Linhas")
@CrossOrigin(origins = "*")
public class LineEntityResource {

    @Autowired
    LineEntityRepository lineEntityRepository;

    @GetMapping("/linhas")
    @ApiOperation(value = "Retorna uma lista com todas as linhas de medidores")
    public List<LineEntity> getList() {
        return lineEntityRepository.findAll();
    }

    @PostMapping("/linha")
    @ApiOperation(value = "Salva uma única linha")
    public LineEntity saveEntity(@RequestBody LineEntity lineEntity) {
        return lineEntityRepository.save(lineEntity);
    }

    @PutMapping("/linha")
    @ApiOperation(value = "Atualiza uma única linha")
    public LineEntity updateEntity(@RequestBody LineEntity lineEntity) {
        return lineEntityRepository.save(lineEntity);
    }

    @DeleteMapping("/linha")
    @ApiOperation(value = "Deleta uma única linha")
    public void deleteEntity(@RequestBody LineEntity lineEntity) {
        lineEntityRepository.delete(lineEntity);
    }




}
