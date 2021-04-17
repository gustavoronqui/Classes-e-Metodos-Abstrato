package entidades;

public class PessoaJuridica extends Pessoa{
	
	int numeroFunc;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String Nome, double RendaAnual , int numeroFunc) {
     super(Nome, RendaAnual);
     this.numeroFunc = numeroFunc ;
	}
	
	@Override
	public double valorTotalImposto() {
		if (numeroFunc>10) {
			return getRendaAnual()*0.14;
		}
		else {
			return getRendaAnual()*0.16;
		}
	}

}
