package br.com.fiap.DramaWorld.Model;

import java.util.Random;

public record Categoria(Long id, String nome) {

    public Categoria(Long id, String nome){
        var key = (id != null) ? id : Math.abs(new Random().nextLong());
        this.id = key;
        this.nome = nome;
    }    

}