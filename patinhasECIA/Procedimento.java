package patinhasECIA;

public class Procedimento {
	private String nome;
	private int duracao;
	private int custo;
	private String materiais;
	
	public Procedimento(String nome, int duracao, int custo, String materiais) {
		this.nome = nome;
		this.duracao = duracao;
		this.custo = custo;
		this.materiais = materiais;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public String getMateriais() {
		return materiais;
	}
	public void setMateriais(String materiais) {
		this.materiais = materiais;
	}
}
