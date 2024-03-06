package br.com.fiap.DramaWorld.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.DramaWorld.Model.Critica;

@Controller
public class DramaReviewController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    List<Critica> repository = new ArrayList<>();

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/doramas/coreanos/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaDoramaCoreano(@PathVariable("nomeDoDorama") String nomeDoDorama){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o dorama coreano: " + nomeDoDorama;
        return ResponseEntity.ok(mensagem);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/doramas/japoneses/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaDoramaJaponeses(@PathVariable("nomeDoDorama") String nomeDoDorama){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o dorama japonês: " + nomeDoDorama;
        return ResponseEntity.ok(mensagem);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/filmes/coreanos/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaFilmeCoreano(@PathVariable("nomeDoFilme") String nomeDoFilme){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o filme coreano: " + nomeDoFilme;
        return ResponseEntity.ok(mensagem);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/filmes/japoneses/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaFilmeJaponeses(@PathVariable("nomeDoFilme") String nomeDoFilme){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o filme japonês: " + nomeDoFilme;
        return ResponseEntity.ok(mensagem);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/dramareview/{id}")
    @ResponseBody
    public ResponseEntity<Critica> get(@PathVariable Long id){
        log.info("buscando criticas com id {}", id);

        var critica = repository
                            .stream()
                            .filter(c -> c.id().equals(id))
                            .findFirst();

        if (critica.isEmpty()){
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).body(critica.get());   
    }
    
}
