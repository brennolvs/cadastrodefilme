package modelo;

public class Diretor {
	private String nome, tempExp, origem;
	
	public Diretor() {
		
	}

	public Diretor(String nome, String tempExp, String origem) {
		this.nome = nome;
		this.tempExp = tempExp;
		this.origem = origem;
	}
	public String toString() {
		return"\nDados do Diretor:\nNome:"+nome+"\nTempo de Experiencia:"+tempExp+"\nOrigem: "+origem;
	}
	
}
