package patinhasECIA;
import java.util.ArrayList;

public abstract class Animal {
	private String nome;
	private int dataNascimento;
	private String tutor;
	private ArrayList <Consulta> historicoCompleto = new ArrayList<Consulta>();
	private String observacao;
	private boolean castrado;
	
	public void adicionarConsulta(Consulta insercao){
		this.historicoCompleto.add(insercao);
	}
	
	public void mostraHistorico(int dataDeHj) {
		for (int i = 0; i < this.historicoCompleto.size(); i++) {
			Consulta auxiliar = this.historicoCompleto.get(i);
			if(auxiliar.getData()< dataDeHj) {
				System.out.println(auxiliar);
			}
		}
	}
	public void mostraAgendados(int dataDeHj) {
		for (int i = 0; i < this.historicoCompleto.size(); i++) {
			Consulta auxiliar = this.historicoCompleto.get(i);
			if(auxiliar.getData() > dataDeHj) {
				System.out.println(auxiliar);
			}
		}
	}
	
	
	
	
}
