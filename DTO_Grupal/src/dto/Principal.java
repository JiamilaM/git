package dto;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//crear un nuevo objeto de Servivios auto
		 ServiciosAuto servicios = new ServiciosAuto();
		 //se llama al metodo que devuelve la lista de los autos
	        List<Auto> listaAuto = servicios.cargarAutos();
	        // se llama al metodo de transferir pasandole como argumento la lista de autos para convertir cada objeto de la lista de la 
	        //clase autos en un objeto de la clase autoDTO 
	        List<AutoDTO> listaDTO = servicios.transferirDatos(listaAuto);
	        //se llama al metodo mostrar de servicios pasandole la lista de autos dto para mostrarlos.
	        servicios.mostrar(listaDTO);
	    
	}

}

