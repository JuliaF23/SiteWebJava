package br.com.fiap.DramaWorld.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.DramaWorld.Model.Autenticacao;

@Controller
public class AutenticacaoController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<Autenticacao> repository = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, path = "/autenticacao")
    @ResponseBody
    public List<Autenticacao> index(){
        return repository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/autenticacao" )
    @ResponseBody
    public ResponseEntity<Autenticacao> create(@RequestBody Autenticacao autenticacao){
        log.info("cadastrando pessoa: {}", autenticacao);
        repository.add(autenticacao);
        return ResponseEntity.status(201).body(autenticacao);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/autenticacao/{id}")
    @ResponseBody
    public ResponseEntity<Autenticacao> get(@PathVariable Long id){
        log.info("buscando cadastro com id {}", id);

        var autenticacao = repository
                            .stream()
                            .filter(c -> c.id().equals(id))
                            .findFirst();

        if (autenticacao.isEmpty()){
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).body(autenticacao.get());

    }

}
