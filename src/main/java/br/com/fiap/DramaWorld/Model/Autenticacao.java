package br.com.fiap.DramaWorld.Model;

import java.util.Random;

public record Autenticacao(Long id, String nome) {

    public Autenticacao(Long id, String nome){
        var key = (id != null) ? id : Math.abs(new Random().nextLong());
        this.id = key;
        this.nome = nome;
    } 
    
}
