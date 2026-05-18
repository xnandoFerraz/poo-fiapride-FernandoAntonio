package br.com.fiapride.model;
public class Cachorro {

    // ATRIBUTOS
    public String cor;
    public int peso;
    public int tamanho;
    public int energia;

    // Método 1
    // O cachorro só pode crescer se o valor for positivo
    public void crescer(int cm) {
        if (cm > 0) {
            tamanho = tamanho + cm;
            System.out.println("O cachorro cresceu " + cm + "cm.");
        } else {
            System.out.println("Erro: o tamanho deve ser maior que zero.");
        }
    }
	
	// Método 2
    // Cada energia vale um minuto de brincar
	public void brincar(int tempo) {
	
	    if (tempo > 0 && energia >= tempo) {
	
	        energia = energia - tempo;
	        System.out.println("O cachorro brincou por " + tempo + " minutos.");
	
	    } else {
	
	        System.out.println("Erro: energia insuficiente.");
	    }
	}
}