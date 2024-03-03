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

import br.com.fiap.DramaWorld.Model.Categoria;

@Controller
public class DramaReviewController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    List<Categoria> repository = new ArrayList<>();

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/doramascoreanos/{nomeDoDorama}/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaDoramaCoreano(@PathVariable("nomeDoDorama") String nomeDoDorama){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o dorama coreano: " + nomeDoDorama;
        return ResponseEntity.ok(mensagem);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/doramasjaponeses/{nomeDoDorama}/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaDoramaJaponeses(@PathVariable("nomeDoDorama") String nomeDoDorama){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o dorama japonês: " + nomeDoDorama;
        return ResponseEntity.ok(mensagem);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/filmescoreanos/{nomeDoFilme}/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaFilmeCoreano(@PathVariable("nomeDoFilme") String nomeDoFilme){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o filme coreano: " + nomeDoFilme;
        return ResponseEntity.ok(mensagem);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/dramareview/filmesjaponeses/{nomeDoDorama}/criticas")
    @ResponseBody
    public ResponseEntity<String> verCriticaFilmeJaponeses(@PathVariable("nomeDoFilme") String nomeDoFilme){
        //Por enquanto vamos retornara apenas uma mensagem
        String mensagem = "Visualizando críticas para o dorama coreano: " + nomeDoFilme;
        return ResponseEntity.ok(mensagem);
    }
    
}
