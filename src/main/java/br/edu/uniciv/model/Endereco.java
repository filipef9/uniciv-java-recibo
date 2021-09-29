package br.edu.uniciv.model;

public class Endereco {

    private TipoLogradouro tipoLogradouro; 
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private Cidade cidade;

    public Uf getEstadoDaCidade() {
        return cidade.getUf();
    }
       
}
