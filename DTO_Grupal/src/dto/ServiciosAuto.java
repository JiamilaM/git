package dto;

import java.util.LinkedList;
import java.util.List;

public class ServiciosAuto {
	
	public List<Auto> cargarAutos(){
		List<Auto> lista = new LinkedList<Auto>();
		Auto a1 = new Auto(1,"Fiat","rojo","QAE2323","UNO",2005,Combustible.NAFTA,5000,(byte)2);
		lista.add(a1);
		lista.add(new Auto(2,"Ford","azul","NEE1243","FIESTA",2010,Combustible.NAFTA,6500,(byte)1));
		lista.add(new Auto(3,"Hyundai","blanco","PAB4355","pik",2019,Combustible.ELECTRICO,28000,(byte)6));
		lista.add(new Auto(4,"VW","verde","SAS7813","GOL",2015,Combustible.NAFTA,7200,(byte)3));
		lista.add(new Auto(5,"Chevrolet","gris","RAB3543","Camioneta",2020,Combustible.GASOIL,31000,(byte)12));
		lista.add(new Auto(6,"Fiat","verde","OAR3981","PREMIO",2008,Combustible.NAFTA,4800,(byte)1));
		lista.add(new Auto(7,"Suzuki","gris","FEE2525","FIRE",2011,Combustible.NAFTA,8500,(byte)1));
		lista.add(new Auto(8,"BYD","negro","PES4530","ONE",2006,Combustible.NAFTA,3500,(byte)1));
		lista.add(new Auto(9,"Toyota","verde","GAR2336","HILUX",2016,Combustible.GASOIL,28600,(byte)1));
		lista.add(new Auto(10,"BYD","blanco","ADE8541","Electric",2020,Combustible.ELECTRICO,32100,(byte)11));
		lista.add(new Auto(11,"Ford","negro","LAL2879","Ferro",2016,Combustible.NAFTA,8500,(byte)1));
		lista.add(new Auto(12,"Mercedes","blanco","4321","Adventure",2018,Combustible.ELECTRICO,55200,(byte)2));
		lista.add(new Auto(13,"Porsche","negro","NBC6658","Lujo",2019,Combustible.NAFTA,41200,(byte)1));
		return lista;
		
	}
	
	
	// METODO TRANSFERIR DATOS 
	// recive como parametro la lista de autos de la clase auto, para devolverla como una lista de autos dto
	    public List<AutoDTO> transferirDatos(List<Auto> autos) {
	        // creamos la lista dto para guardar los autos de auto dto
	    	List<AutoDTO> listaDTO = new LinkedList<AutoDTO>();
	       //iteramos cada objeto de la clase Auto de la lista pasada como parametro
	    	for (Auto auto : autos) {
	    		// en cada iteracion se crea un autoDTO a partir de los atributos seleccionados
	            AutoDTO dto = new AutoDTO(auto.getMarca(), auto.getCombustible(),
	                    auto.getValor(), auto.getStock());
	            //el auto creado se agrega a la lista
	            listaDTO.add(dto);
	        }
	        return listaDTO;
	    }
	    // metodo para mostrar los autos
	    public void mostrar(List<AutoDTO> listaDTO) {
	       //variable para acumular el valor total de los autos
	    	double importeTotal = 0;
	        System.out.println("------------------------------------------------------------");
	        // iteramos cada auto de la lista 
	        for (AutoDTO dto : listaDTO) {
	           //los imprimimos
	        	System.out.println(dto);
	        	// y sumamos el valor de cada auto a la variable importeTotal
	            importeTotal += dto.getValorTotal();
	        }
	        System.out.println("\n==========================================================");
	        System.out.println("Importe total en autos U$S " + importeTotal);
	    
	}

	
}
