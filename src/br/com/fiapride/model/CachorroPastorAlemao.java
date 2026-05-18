package br.com.fiapride.model;

public class CachorroPastorAlemao extends Cachorro implements Treinavel {

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
	
	@Override
	public void treinar() {

	    System.out.println(
	        getNome() + " está treinando patrulha militar."
	    );
	}

	@Override
	public String executarComando() {

	    return "O Pastor Alemão obedeceu imediatamente!";
	}
}