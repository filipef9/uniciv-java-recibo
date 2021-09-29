package br.edu.uniciv.model;

import java.util.*;

public class Servicos {
    
    private List<String> servicos = new ArrayList<>();

    public void addServico(String novoServico) {
        servicos.add(novoServico);
    }

    public List<String> getServicos() {
        return servicos;
    }

}
