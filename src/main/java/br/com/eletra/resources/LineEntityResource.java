package br.com.eletra.resources;

import br.com.eletra.model.LineEntity;
import br.com.eletra.repository.LineEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LineEntityResource {

    @Autowired
    LineEntityRepository lineEntityRepository;

    @GetMapping("/linhas")
    public List<LineEntity> getList() {
        return lineEntityRepository.findAll();
    }

}
