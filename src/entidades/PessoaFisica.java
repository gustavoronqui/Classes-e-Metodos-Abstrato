package entidades;

public class PessoaFisica extends Pessoa {

	double gastos;
	
	public PessoaFisica() {
		super();
	}
	
	
	public PessoaFisica(String nome, double rendaAnual, double gastos) {
		super(nome, rendaAnual);
		this.gastos = gastos;
	}

	@Override
	public double valorTotalImposto() {
     if (getRendaAnual()<20000){
    	 return ((getRendaAnual()*0.15)) - (gastos*0.5);	
     }
     else {
         return ((getRendaAnual()*0.25)) - (gastos*0.5);	 
     }
	}
	
	
	
	
}
