package punto3;

public class MainP3 {

	public MainP3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main 3\n");
		
		MathHelper listaNumeros = new MathHelper();
		
		listaNumeros.addNumero(5);
		listaNumeros.addNumero(7);
		listaNumeros.addNumero(9);
		listaNumeros.addNumero(4);
		listaNumeros.addNumero(2);
		listaNumeros.addNumero(8);
		
		
		listaNumeros.mostrarLista();
		
		listaNumeros.removeN(3);
		
		listaNumeros.ordenarLista();
		
		listaNumeros.removeN(1);
		listaNumeros.removeN(20);
		listaNumeros.removeN(-3);
		
		listaNumeros.mostrarLista();
	}

}
