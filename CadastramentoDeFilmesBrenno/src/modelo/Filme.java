package modelo;

public class Filme {
	private String titulo, desc, diretor;
	private int minutos;
	public int horas;
	
	
	public Filme() {
		
	}

	public Filme(String titulo, String desc, String diretor, int minutos) {
		this.titulo = titulo;
		this.desc = desc;
		this.diretor = diretor;
		this.minutos = minutos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHoras() {
		return horas;
	}
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public double exibirDuracaoEmHoras() {
		return (minutos/60); 
	}
	public String toString() {
		return "\nDados do Filme:\nTitulo: "+titulo+"\nDiretor: "+diretor+"\nDescrição: "+desc+
				"\nO filme "+titulo+ " possui "+exibirDuracaoEmHoras()+" horas e "+minutos+" minutos de duração";
	}

	
}