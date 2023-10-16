package views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empleado;
		//empleado = new EmpleadoController().createEmpleado("perez","juan","25","masculino","1500");
		//empleado = new EmpleadoController().createEmpleado("jose","salas","27","masculino","2000");
		
		//empleado= new EmpleadoController().deleteEmpleado(2);
		
		//empleado = new EmpleadoController().updateEmpleado(1, "jorge", "diaz");
		
		empleado = new EmpleadoController().getEmpleado(1);
		System.out.print(empleado);

	}

}
