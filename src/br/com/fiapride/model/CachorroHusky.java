package br.com.fiapride.model;

public class CachorroHusky extends Cachorro implements Treinavel {

    private boolean gostaDeNeve;

    public CachorroHusky(
            String nome,
            String cor,
            int peso,
            int tamanho,
            int energia,
            Dono dono,
            boolean gostaDeNeve
    ) {

        super(nome, cor, peso, tamanho, energia, dono);

        this.gostaDeNeve = gostaDeNeve;
    }

    public boolean isGostaDeNeve() {
        return gostaDeNeve;
    }
    public void setgostaDeNeve(boolean gostaDeNeve) {
        this.gostaDeNeve = gostaDeNeve;
    }

	@Override
	public String fazerSom() {
	
	    return "Auuuuuu! O Husky está uivando na neve.";
	}
	@Override
	public void treinar() {

	    System.out.println(
	        getNome() + " está treinando corrida na neve."
	    );
	}

	@Override
	public String executarComando() {

	    return "O Husky ignorou o comando e saiu correndo.";
	}
}