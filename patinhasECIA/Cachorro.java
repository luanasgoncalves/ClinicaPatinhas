package patinhasECIA;
import java.time.LocalDate;

public class Cachorro extends Animal {
	private char porte;
	private String raça;
	private String cor;
	private double peso;
	
	public Cachorro(String nome, LocalDate dataNascimento, String tutor, String observacao, boolean castrado,
					char porte, String raça, String cor, double peso) {
		super(nome, dataNascimento, tutor, observacao, castrado);
		this.porte = porte;
		this.raça = raça;
		this.cor = cor;
		this.peso = peso;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
