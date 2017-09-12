package punto2;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Nomina {


	protected int id;
	protected HashMap<Integer, Empleado> empleados;
	protected Calendar fecha;
	
	public Nomina(int id, HashMap<Integer, Empleado> empleados, Calendar fecha) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.empleados = empleados;
		this.fecha = fecha;
	}
	
	public double calcularNomina() {
		double nomina = 0;
		//Recorre el hashmap de empleados para obtener el salario e irlo sumando 
		for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
			System.out.println("id Empleado = " + entry.getKey() + 
					", Nombre Empleado = " + entry.getValue().getNombre() + 
					", Salario Empleado = " + entry.getValue().getCargo().getSalario());
			nomina += entry.getValue().getCargo().getSalario();
		}
		System.out.println("\n");
		return nomina;
	}

}
