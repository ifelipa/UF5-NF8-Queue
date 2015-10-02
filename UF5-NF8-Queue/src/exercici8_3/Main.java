package exercici8_3;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		LinkedList<Cotxe> listCars = new LinkedList<Cotxe>();
		listCars.offer(new Cotxe("Alfa Romeo", "Giulia", 6, 2900));
		listCars.offer(new Cotxe("Dacia", "Sandero", 4, 1200));
		listCars.offer(new Cotxe("Ford", "Focus", 4, 2000));
		listCars.offer(new Cotxe("Opel", "Insignia", 4, 2200));
		Cotxe seat = new Cotxe("Seat", "Ibiza", 4, 1600);
		listCars.offer(seat);

		System.out.println("******** Mostrando la lista \n");
		imprimir(listCars);

		// Agregando dos coches
		Cotxe hyundai = new Cotxe("Hyundai", "Atos", 3, 1500);
		listCars.offer(hyundai);
		listCars.offer(new Cotxe("Ford", "Focus", 4, 2000));

		System.out.println("******** Verificando que se haya agregador \n");
		imprimir(listCars);

		System.out.println("�Admite objeto duplicados: \n" + "si");

		System.out.println("******** Agregando al inicio \n");
		System.out.println(listCars.get(0).toString());
		listCars.offerFirst(new Cotxe("Audi", "A8", 8, 4600));
		System.out.println(listCars.get(0).toString());

		System.out.println("******** Sustituyendo el Seat Ibiza por Seat Mii \n");

		imprimir(listCars);

		if (listCars.contains(seat)) { // comrpuebo que el objeto este en la
										// lista
			listCars.set(listCars.indexOf(seat), new Cotxe("Seat", "Mii", 3, 1000)); // Si lo encuentra cambia por el anterior
			System.out.println("******** Comprobando que lo haya sustituido \n");
			imprimir(listCars);
		} else {
			System.out.println("el coche no se encuentra");
		}

		System.out.println("*********** Eliminando el primer elemento con nombreLista.removeFirst()");
		listCars.removeFirst();
		imprimir(listCars);

		System.out.println("*********** La posicion del coche Hyundai es: "
				+ ((listCars.contains(hyundai)) ? listCars.indexOf(hyundai) : -1));
		
		

	}

	public static void imprimir(LinkedList<Cotxe> listCars) {
		for (Cotxe cotxe : listCars) {
			System.out.println(cotxe.toString());
		}
	}

}
