package controladores;

import Servicios.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		int opcionIntroducida=0;
		Boolean cerrarMenu=false;
		MenuInterfaz mI= new MenuImplementacion();
		ModificacionesBBDDImplementacion mB= new ModificacionesBBDDImplementacion();
		
		while(!cerrarMenu) 
		{
			opcionIntroducida=mI.mostrarMenuYSeleccion();
			
			switch(opcionIntroducida) 
			{
			case 0: 
				System.out.println("[INFO] - Ha seleccionado la opcion 0");
				cerrarMenu=true;
				break;
			case 1:
				System.out.println("[INFO] - Ha seleccionado la opcion 1");
				//mB.darAlta(em);
				break;
			case 2:
				System.out.println("[INFO] - Ha seleccionado la opcion 2");
				//mB.eliminarElemento(em);
				break;
			case 3:
				System.out.println("[INFO] - Ha seleccionado la opcion 3");
				//mB.modificarCantidad(em);
				break;
			case 4:
				System.out.println("[INFO] - Ha seleccionado la opcion 4");
				//mB.mostrarStock(em);
				break;
			case 5:
				System.out.println("[INFO] - Ha seleccionado la opcion 5");
				//mB.crearReserva(em);
				break;
			default:
				System.out.println("[INFO] - El numero introducido no corresponde a ninguna opcion");
			}
		}
	}
}
