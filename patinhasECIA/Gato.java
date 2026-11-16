package patinhasECIA;

import java.time.LocalDate;

public class Gato extends Animal {
	private String tipo;
	private String cor;
	private char pelagem;
	private double peso;
	
	public Gato(String nome, LocalDate dataNascimento, String tutor, String observacao, boolean castrado,
			String tipo, String cor, char pelagem, double peso) {
		super(nome, dataNascimento, tutor, observacao, castrado);
		this.tipo = tipo;
		this.cor = cor;
		this.pelagem = pelagem;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public char getPelagem() {
		return pelagem;
	}

	public void setPelagem(char pelagem) {
		this.pelagem = pelagem;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
