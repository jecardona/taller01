package punto1;

public class MainP1 {

	public MainP1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main 1");
		
		System.out.println("Calculadora 1");
		
		Calculadora calculadora = new Calculadora(5, 2);
		calculadora.sumar();
		calculadora.restar();
		calculadora.multiplicar();
		calculadora.dividir();
		
		System.out.println("Calculadora 2");
		
		Calculadora calculadora2 = new Calculadora(8, 0);
		calculadora2.sumar();
		calculadora2.restar();
		calculadora2.multiplicar();
		calculadora2.dividir();
	}

}
