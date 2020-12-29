package modelo;

public class TesteFilme {
	/*->Considere um sistema para cadastramento de filmes. Trabalharemos com duas
	classes de modelo: Diretor e Filme. Todo filme tem um diretor. Desse modo, voc�
	deve definir uma classe Diretor em Java, com as seguintes caracter�sticas:
 	Atributos: nome, tempo de experi�ncia (em anos), local de origem.
 	Construtores para a classe;
 	M�todos getters e setters;
	M�todo para impress�o.
	
	->Em seguida, voc� deve construir uma classe Filme em Java, com as seguintes
	caracter�sticas:
 	A classe deve possuir quatro atributos: titulo, descri��o, diretor e duracaoEmMinutos.
	Crie os construtores padr�o e completo;
	Crie os m�todos de acesso (get e set) para os atributos da classe;
	**Crie um m�todo exibirDuracaoEmHoras que converta o valor em minutos para horas e
	apresente a mensagem �O filme TITULO possui X horas e Y minutos de dura��o�.
	Acrescente tamb�m na classe um m�todo para exibi��o dos dados do filme.
	
	->Considerando a classe Filme definida, crie uma classe TesteFilme que possua um
	m�todo main de modo que seja poss�vel testar a classe Filme criada na quest�o
	anterior. Voc� deve instanciar tr�s filmes e, para cada filme, voc� deve exibir seus
	dados e a quantidade de horas do filme utilizando o m�todo definido
	anteriormente. */

	public static void main(String[] args) {
		Filme f1, f2, f3;
		f1 = new Filme ("Sociedade dos Poetas Mortos","Hist�ria de um professor","Peter Weir",134);
		System.out.println(f1);
		System.out.println(f1.exibirDuracaoEmHoras());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		f2= new Filme ("Em chamas", "Um entregador chamado Jong-soon","Lee Chang-Dong",148);
		System.out.println(f2);
		System.out.println(""+f2.exibirDuracaoEmHoras());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		f3 = new Filme ("Feiti�o do Tempo","Metereologista fica preso no tempo","Harold Ramis",101);
		System.out.println(f3);
		System.out.println(f3.exibirDuracaoEmHoras());
		
		
	}

}
