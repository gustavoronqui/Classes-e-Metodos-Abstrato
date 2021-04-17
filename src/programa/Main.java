package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import entidades.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		System.out.print("Digite o numero de contribuintes:");
		int ncontribuintes = sc.nextInt();
		sc.nextLine();

	
		
		for (int i=1;i<=ncontribuintes;i++) {
			
			
			System.out.println("Digite os dados da " +i+ " pessoa:");
			
			System.out.print("Digite o nome:");
			String nomePessoa = sc.nextLine();
			
			System.out.print("Digite a renda anual:");
			double rendaAnual = sc.nextDouble();
			
			System.out.print("Pesossa Fisica ou Juridica (F/J):");
			char resp= sc.next().charAt(0);
			
			
			if (resp=='F') {
				System.out.print("Digite o valor do gasto com saude:");
				double gastoSaude = sc.nextDouble();				
				PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa, rendaAnual, gastoSaude);
				lista.add(pessoaFisica);				
			}
			else {
				System.out.print("Digite o numero de funcionarios:");
				int nFuncionario = sc.nextInt();				
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoa, rendaAnual, nFuncionario);
				lista.add(pessoaJuridica);	
			}
			
			sc.nextLine();
			
		}
	
		
		double totalGeralImposto=0;
		System.out.println();
		System.out.println("Impostos");
		for (Pessoa pessoa : lista) {
			//System.out.println(pessoa.getNome()+" pagou R$ "+pessoa.valorTotalImposto()+ " de imposto");
			System.out.printf("%s : R$ %.2f",pessoa.getNome(),pessoa.valorTotalImposto());
			totalGeralImposto+=pessoa.valorTotalImposto();
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("Total de imposto: R$ %.2f",totalGeralImposto);
		sc.close();

	}

}
