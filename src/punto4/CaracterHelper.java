package punto4;

public class CaracterHelper {

	private LetraC letraC;
	private LetraO letraO;
	private LetraS letraS;
	private LetraA letraA;
	
	public CaracterHelper() {
		// TODO Auto-generated constructor stub
		letraC = new LetraC();
		letraO = new LetraO();
		letraS = new LetraS();
		letraA = new LetraA();
	}
	
	public void dibujarPalabra(String palabra) {
		for(int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			
			switch(letra) {
			
			case 'c':
				letraC.dibujarLetra();
				break;
			case 'o':
				letraO.dibujarLetra();
				break;
			case 's':
				letraS.dibujarLetra();
				break;
			case 'a':
				letraA.dibujarLetra();
				break;
			default:
				System.out.println("La letra " + letra + " no se puede dibujar");
			}
		}
	}

}
