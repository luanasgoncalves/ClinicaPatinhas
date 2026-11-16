package patinhasECIA;
import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Animal {
	private String nome;
	private LocalDate dataNascimento;
	private String tutor;
	private ArrayList <Consulta> historicoCompleto = new ArrayList<Consulta>();
	private String observacao;
	private boolean castrado;
	
	public Animal (String nome, LocalDate dataNascimento, String tutor, String observacao, boolean castrado) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.tutor = tutor;
		this.observacao = observacao;
		this.castrado = castrado;
	}
	
	public void adicionarConsulta(Consulta insercao){
		this.historicoCompleto.add(insercao);
	}
	
	/*
	Java provides distinct APIs for date operations and comparison, with the Java 8+ java.time API (e.g., LocalDate, LocalDateTime) being the modern standard, while legacy java.util.Date and java.util.Calendar classes remain supported for backward compatibility.

	Comparison Methods

	isBefore(other), isAfter(other), and isEqual(other): These boolean methods are preferred in modern Java for clear, readable checks of temporal order and equality. 
	compareTo(other): Returns an int (negative, zero, or positive) indicating if the date is earlier, equal, or later than the argument; this is primarily used for sorting collections. 
	before(), after(), and equals(): Legacy methods available on Date and Calendar objects that serve similar boolean comparison purposes. 
	Date Operations and Calculations

	Arithmetic: Use methods like plusDays(), minusMonths(), and plusYears() on LocalDate or LocalDateTime objects to perform date math.
	Duration Calculation: To find the difference between two dates, use ChronoUnit.DAYS.between(start, end) or ChronoUnit.MONTHS.between(...) for specific unit counts.
	Parsing and Formatting: DateTimeFormatter is used to parse strings into date objects and format them back to strings, replacing the older SimpleDateFormat.
	*/
	
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
	
	public void mostraTodas(int dataDeHj) {
		for (int i = 0; i < this.historicoCompleto.size(); i++) {
			Consulta auxiliar = this.historicoCompleto.get(i);
			System.out.println(auxiliar);	
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
}
