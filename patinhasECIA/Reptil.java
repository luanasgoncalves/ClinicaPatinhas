package patinhasECIA;

import java.time.LocalDate;

public class Reptil extends Animal {
	private String especie;
	private double peso;
	
	public Reptil(String nome, LocalDate dataNascimento, String tutor, String observacao, boolean castrado,
			String especie, double peso) {
		super(nome, dataNascimento, tutor, observacao, castrado);	
		this.especie = especie;
		this.peso = peso;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
