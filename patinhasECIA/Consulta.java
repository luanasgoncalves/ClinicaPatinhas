package patinhasECIA;
import java.util.ArrayList;

public class Consulta {
	private String nomeAnimal;
	private int data;
	private ArrayList<Procedimento> listaProcedimentos = new ArrayList<Procedimento>();
	private String nomeVeterinario;
	private double total;
	
	public Consulta(String nomeAnimal, int data, String nomeVeterinario) {
		this.nomeAnimal = nomeAnimal;
		this.data = data;
		this.nomeVeterinario = nomeVeterinario;
		this.total = 0;
	}
	
	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ArrayList<Procedimento> getListaProcedimentos() {
		return listaProcedimentos;
	}

	public void setListaProcedimentos(ArrayList<Procedimento> listaProcedimentos) {
		this.listaProcedimentos = listaProcedimentos;
	}

	public String getNomeVeterinario() {
		return nomeVeterinario;
	}

	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	void adicionarProcedimento(Procedimento insercao){
		this.listaProcedimentos.add(insercao);
	}
	
	void calcularTotal(){
		for (int i = 0; i < this.listaProcedimentos.size(); i++) {
			Procedimento auxiliar = this.listaProcedimentos.get(i);
			this.total += auxiliar.getCusto();
		}
	}
}
