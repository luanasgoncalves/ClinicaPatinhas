package patinhasECIA;

import java.time.LocalDate;

public class Passaro extends Animal {
	private String especie;
	private String pelugem;
	
	public Passaro(String nome, LocalDate dataNascimento, String tutor, String observacao, boolean castrado,
			String especie, String pelugem) {
		super(nome, dataNascimento, tutor, observacao, castrado);	
		this.especie = especie;
		this.pelugem = pelugem;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPelugem() {
		return pelugem;
	}

	public void setPelugem(String pelugem) {
		this.pelugem = pelugem;
	}
	
	
}