package punto1;

public class Calculadora {

	protected float operando1;
	protected float operando2;
	
	public Calculadora(float operando1, float operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public void sumar() {
		float suma = operando1 + operando2;
		System.out.println("El resultado de la suma es: " + suma);
	}

	public void restar() {
		float resta = operando1 - operando2;
		System.out.println("El resultado de la resta es: " + resta);
	}
	
	public void multiplicar() {
		float multiplicacion = operando1 * operando2;
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);
	}
	
	public void dividir() {
		if(operando2 == 0) {
			System.out.println("No es posible realizar la división por Cero ");
		}else {
			float division = operando1 / operando2;
			System.out.println("El resultado de la división es: " + division);
		}
					
	}
}
