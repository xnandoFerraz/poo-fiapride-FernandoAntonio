package br.com.fiapride.model;

public class CachorroPastorAlemao extends Cachorro {

    private String militar;

    public CachorroPastorAlemao(
            String nome,
            String cor,
            int peso,
            int tamanho,
            int energia,
            Dono dono,
            String militar
    ) {

        super(nome, cor, peso, tamanho, energia, dono);

        this.militar = militar;
    }

    public String getMissao() {
        return militar;
    }

    public void setMissao(String militar) {
        this.militar = militar;
    }

	@Override
	public String fazerSom() {
	
	    return "AU AU! O Pastor Alemão está protegendo a área.";
	}
}