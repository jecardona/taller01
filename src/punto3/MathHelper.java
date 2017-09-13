package punto3;

import java.util.LinkedList;
import java.util.List;

public class MathHelper {

	protected List<Integer> listaNumeros = new LinkedList<Integer>();
	
	public MathHelper() {
		// TODO Auto-generated constructor stub
	}
	
	//Añadir números a la lista
	public void addNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	//Método Burbuja
	public void ordenarLista() {
		int auxiliar= 0;
		int jotaMasUno = 0;
		int moverN = 0;
		for(int i = 2; i < listaNumeros.size(); i++){
				for(int j = 0; j <= listaNumeros.size()-i; j++){					
						if(listaNumeros.get(j) > listaNumeros.get(j+1)) {
							auxiliar = listaNumeros.get(j);
							//listaNumeros.remove(j);
							jotaMasUno = j+1;
							moverN = listaNumeros.get(jotaMasUno);
							listaNumeros.remove(j);
							listaNumeros.add(j, moverN);
							listaNumeros.remove(jotaMasUno);
							listaNumeros.add(jotaMasUno, auxiliar);
						}
				}
		}
	}
	
	//Remove
	public void removeN(int posicion) {
		if(posicion < listaNumeros.size() && posicion >= 0) {
			listaNumeros.remove(posicion);
			ordenarLista();
		}else {
			System.out.println("La posición indicada es mayor que el tamaño de la lista ó es menor a cero");
		}
	}
	
	//Imprimir Lista en pantalla
	public void mostrarLista() {
		System.out.println("Lista de números\n");
		for(int i = 0; i < listaNumeros.size(); i++){
			System.out.println("ListaNumeros[" + i + "] = " + listaNumeros.get(i));
		}
		System.out.println("\n");
	}

}
