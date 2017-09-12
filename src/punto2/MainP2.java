package punto2;

import java.util.Calendar;
import java.util.HashMap;

public class MainP2 {

	public MainP2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main 2\n");
		
		//Cargos
		Cargo cargoJefe = new Cargo(1, "Jefe", 600000);
		Cargo cargoAnalista = new Cargo(2, "Analista", 300000);
		
		// Empleados

		Empleado david = new Empleado("David", "1", 1, cargoAnalista);
		Empleado juan = new Empleado("Juan", "2", 2, cargoAnalista);
		Empleado gloria = new Empleado("Gloria", "3", 3, cargoJefe);
		Empleado sandra = new Empleado("Sandra", "4", 4, cargoAnalista);
		Empleado mari = new Empleado("Mari", "5", 5, cargoAnalista);
		
		//Ingreso de empleados a un HashMap
		HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();
		
		empleados.put(david.getId(), david);
		empleados.put(juan.getId(), juan);
		empleados.put(gloria.getId(), gloria);
		empleados.put(sandra.getId(), sandra);
		empleados.put(mari.getId(), mari);
		
		
		//Nómina
		Calendar fechaNomina = Calendar.getInstance();
		fechaNomina.set(2017, 9, 30);
		Nomina nominaSeptiembre = new Nomina(1, empleados, fechaNomina);
		
		double valorNomina = nominaSeptiembre.calcularNomina();
		System.out.println("El valor total de la nómina en la fecha " + 
		nominaSeptiembre.fecha.get(Calendar.DAY_OF_MONTH) + "/" +
		nominaSeptiembre.fecha.get(Calendar.MONTH) + "/" +
		nominaSeptiembre.fecha.get(Calendar.YEAR) + 
		" es: " + valorNomina);
		
	}

}
