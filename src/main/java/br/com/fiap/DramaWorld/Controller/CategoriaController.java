package br.com.fiap.DramaWorld.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.DramaWorld.Model.Categoria;

@Controller
public class CategoriaController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<Categoria> repository = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, path = "/categoria/doramascoreanos")
    @ResponseBody
    public List<Categoria> getDoramasCoreanos(){
        return getCategorias("Doramas Coreanos");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/categoria/doramasjaponeses")
    @ResponseBody
    public List<Categoria> getDoramasJaponeses(){
        return getCategorias("Doramas Japoneses");
    } 

    @RequestMapping(method = RequestMethod.GET, path = "/categoria/filmescoreanos")
    @ResponseBody
    public List<Categoria> getFilmesCoreanos(){
        return getCategorias("Filmes Coreanos");
    } 

    @RequestMapping(method = RequestMethod.GET, path = "/categoria/filmesjaponeses")
    @ResponseBody
    public List<Categoria> getFilmesJaponeses(){
        return getCategorias("Filmes Japoneses");
    } 

    @RequestMapping(method = RequestMethod.POST, path = "/categoria" )
    @ResponseBody
    public void create(@RequestBody Categoria categoria){
        log.info("Cadastrando categoria: {}", categoria);
        repository.add(categoria);
    }

    // Método para obter categorias por nome
    private List<Categoria> getCategorias(String categoryName) {
        List<Categoria> categorias = new ArrayList<>();
        for (Categoria categoria : repository) {
            if (categoria.nome().equals(categoryName)) {
                categorias.add(categoria);
            }
        }
        return categorias;
    }
}