package patinhasECIA;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Animal> listaAnimais = new ArrayList<Animal> ();
		Cachorro Bob = new Cachorro("Bob", LocalDate.parse("2018-05-05"), "Loni", "gordo", true, 'p', "salsicha", "caramelo", 120);
		Gato Joca = new Gato("Joca", LocalDate.parse("2020-05-03"), "Iara", "gigante", true, "Ragdoll", "branco e cinza", 'm', 500);
		listaAnimais.add(Bob);
		listaAnimais.add(Joca);
		
		
		Scanner entrada = new Scanner(System.in);
		GeraMenu.DesenharMenuPrincipal();
		int input = entrada.nextInt();
		
		//String nome, LocalDate dataNascimento, String tutor, String observacao, boolean castrado,
		//cachorro: char porte, String raça, String cor, double peso
		//gato: String tipo, String cor, char pelagem, double peso
		
	}

}
