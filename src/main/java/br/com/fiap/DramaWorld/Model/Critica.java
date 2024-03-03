package br.com.fiap.DramaWorld.Model;

import java.util.Random;

public record Critica(Long id, String nome) {

    public Critica(Long id, String nome){
        Long key = (id != null) ? id : Math.abs(new Random().nextLong());
        this.id = key;
        this.nome = nome;
    }
    
}
