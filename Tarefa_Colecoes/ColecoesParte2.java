package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte2 {
	
	public static void main(String[] args) {
		Tarefa1();
		Tarefa2();
	} 

	private static void Tarefa1() {
        System.out.println("****** Lista Sem Ordenação ******");
        List<String> lista = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);

        int count = 5;
		for (int i = 0; i< count; i++) {
			 System.out.println("Digite o "+(i+1)+"º"+ " nome");
             lista.add(entrada.next());
        } 
        System.out.println(lista);
        System.out.println(""); 
        System.out.println("Lista Apó a Ordeção");
        Collections.sort(lista); 
        System.out.println(""); 
        System.out.println(lista);
    	System.out.println("******FIM TAREFA 1******");
     
    }

	private static void Tarefa2() {
		// TODO Auto-generated method stub
		System.out.println("**********");
		System.out.println("****** Tarafa Parte 2 ******");
		
		Scanner sc = new Scanner(System.in);
        Person person;
        List<Person> malePeople = new ArrayList<>();
        List<Person> femalePeple = new ArrayList<>();
         
        do {
            System.out.print("Digite o nome e o sexo separados por virgula ");
            String[] split = sc.next().split(",");
            person = new Person(split[0], split[1]);
            
            if (person.getSex().equalsIgnoreCase("M") || person.getSex().equalsIgnoreCase("Masculino")) {
                malePeople.add(person);
                Collections.sort(malePeople);
                for (Person people : malePeople) {
                    System.out.println(people);
                }
            } else if (person.getSex().equalsIgnoreCase("F") || person.getSex().equalsIgnoreCase("Feminino")) {
                femalePeple.add(person);
                for (Person people : femalePeple){
                    Collections.sort(femalePeple);
                    System.out.println(people);
                }
            }
            System.out.print("Gostaria de adicionar mais pessoas a lista? ");

        } while (sc.next().equalsIgnoreCase("Sim"));
        
        System.out.println(malePeople);
        System.out.println(femalePeple);
        System.out.println("FIM");
        sc.close();
	}
	
	
}
