package entidades;

public abstract class Pessoa {
	
	String nome;
	double rendaAnual;
	

	public Pessoa(){
	}

	public Pessoa(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
	return nome;	
	}

	public double getRendaAnual() {
		return rendaAnual;
	}
	
	
	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual= rendaAnual;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public abstract double valorTotalImposto();
	

	
}
