package modelo;

public class TesteFilme {
	/*->Considere um sistema para cadastramento de filmes. Trabalharemos com duas
	classes de modelo: Diretor e Filme. Todo filme tem um diretor. Desse modo, você
	deve definir uma classe Diretor em Java, com as seguintes características:
 	Atributos: nome, tempo de experiência (em anos), local de origem.
 	Construtores para a classe;
 	Métodos getters e setters;
	Método para impressão.
	
	->Em seguida, você deve construir uma classe Filme em Java, com as seguintes
	características:
 	A classe deve possuir quatro atributos: titulo, descrição, diretor e duracaoEmMinutos.
	Crie os construtores padrão e completo;
	Crie os métodos de acesso (get e set) para os atributos da classe;
	**Crie um método exibirDuracaoEmHoras que converta o valor em minutos para horas e
	apresente a mensagem “O filme TITULO possui X horas e Y minutos de duração”.
	Acrescente também na classe um método para exibição dos dados do filme.
	
	->Considerando a classe Filme definida, crie uma classe TesteFilme que possua um
	método main de modo que seja possível testar a classe Filme criada na questão
	anterior. Você deve instanciar três filmes e, para cada filme, você deve exibir seus
	dados e a quantidade de horas do filme utilizando o método definido
	anteriormente. */

	public static void main(String[] args) {
		Filme f1, f2, f3;
		f1 = new Filme ("Sociedade dos Poetas Mortos","História de um professor","Peter Weir",134);
		System.out.println(f1);
		System.out.println(f1.exibirDuracaoEmHoras());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		f2= new Filme ("Em chamas", "Um entregador chamado Jong-soon","Lee Chang-Dong",148);
		System.out.println(f2);
		System.out.println(""+f2.exibirDuracaoEmHoras());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		f3 = new Filme ("Feitiço do Tempo","Metereologista fica preso no tempo","Harold Ramis",101);
		System.out.println(f3);
		System.out.println(f3.exibirDuracaoEmHoras());
		
		
	}

}
