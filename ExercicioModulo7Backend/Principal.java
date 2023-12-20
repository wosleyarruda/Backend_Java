package tarefa;

public class Principal {
	
	public static void main(String[] args) {
		
		Lampada testeLampada = new Lampada();
		
		 
		System.out.println(testeLampada.getIntensidade());
		testeLampada.ajustarIntensidade(50);
		System.out.println(testeLampada.getIntensidade());
		
		System.out.println(testeLampada.toString());
		testeLampada.ligar();
		System.out.println(testeLampada.toString());
		
		
	}

}
