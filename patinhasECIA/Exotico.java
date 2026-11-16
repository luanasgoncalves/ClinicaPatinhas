package patinhasECIA;

import java.time.LocalDate;

public class Exotico extends Animal{
	private String especie;
	private String outro1;
	private String outro2;
	
	public Exotico(String nome, LocalDate dataNascimento, String tutor, String observacao, boolean castrado,
			String especie, String outro1, String outro2) {
		super(nome, dataNascimento, tutor, observacao, castrado);	
		this.especie = especie;
		this.outro1 = outro1;
		this.outro2 = outro2;
	}
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getOutro1() {
		return outro1;
	}

	public void setOutro1(String outro1) {
		this.outro1 = outro1;
	}

	public String getOutro2() {
		return outro2;
	}

	public void setOutro2(String outro2) {
		this.outro2 = outro2;
	}

	
}
