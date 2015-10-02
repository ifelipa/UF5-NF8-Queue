package exercici8_4;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

import exercici8_3.Cotxe; //Para no copiar nuevament el clase Cotxe la importamos.

public class Main {

	public static void main(String[] args) {

		Cotxe alfa = new Cotxe("Alfa Romeo", "Giulia", 6, 2900);
		Cotxe dacia = new Cotxe("Dacia", "Sandero", 4, 1200);
		Cotxe ford = new Cotxe("Ford", "Focus", 4, 2000);
		Cotxe opel = new Cotxe("Opel", "Insignia", 4, 2200);
		Cotxe seat = new Cotxe("Seat", "Ibiza", 4, 1600);

		LinkedList<Cotxe> lifoAutos = new LinkedList<Cotxe>();
		LinkedList<Cotxe> fifoAutos = new LinkedList<Cotxe>();
		PriorityQueue<Cotxe> priority = new PriorityQueue<Cotxe>();

		lifoAutos.push(alfa);
		lifoAutos.push(dacia);
		lifoAutos.push(ford);
		lifoAutos.push(opel);
		lifoAutos.push(seat);

		fifoAutos.offer(alfa);
		fifoAutos.offer(dacia);
		fifoAutos.offer(ford);
		fifoAutos.offer(opel);
		fifoAutos.offer(seat);

		// agregar los coches a la lista PriorityQueue
		for (Cotxe cotxe : fifoAutos)
			priority.offer(cotxe);

		System.out.println("*********** LISTAS ******");
		System.out.println("===LIFO========");
		imprimir(lifoAutos);
		System.out.println("===FIFO=========");
		imprimir(fifoAutos);
		System.out.println("===PRIORITYQUEUE=========");

		imprimirPriority(priority);

		// Agregando nuevamente elementos a priorityqueue
		for (Cotxe cotxe : fifoAutos)
			priority.offer(cotxe);

		// Agregando nuevo coche
		Cotxe fiat = new Cotxe("Fiat", "Panda", 2, 900);
		lifoAutos.push(fiat);
		fifoAutos.offer(fiat);
		priority.offer(fiat);

		System.out.println("========== Mostrando los primeros elementos de las listas ===========");
		System.out.println("numero de Elementos");
		System.out.println("lifo " + lifoAutos.size());
		System.out.println("lifo " + fifoAutos.size());
		System.out.println("priority " + priority.size());

		int i = 0;
		while (!priority.isEmpty()) {
			System.out.println("Mostrando primero LIFO" + i + " -> " + lifoAutos.removeFirst());
			System.out.println("Mostrando primero FIFO" + i + " -> " + fifoAutos.removeFirst());
			System.out.println("Mostrando primero PRIORITY" + i + " -> " + priority.poll().toString());
		}
		System.out.println("Comprobacion del numero de Elementos");
		System.out.println("lifo " + lifoAutos.size());
		System.out.println("lifo " + fifoAutos.size());
		System.out.println("priority " + priority.size());

	}

	private static void imprimirPriority(PriorityQueue<Cotxe> priority) {
		PriorityQueue<Cotxe> auxList = priority;
		while (!auxList.isEmpty()) {
			System.out.println(auxList.poll().toString());
		}
	}

	private static void imprimir(Deque<Cotxe> listCars) {
		for (Cotxe cotxe : listCars) {
			System.out.println(cotxe.toString());
		}
	}

	/*
	 * Respon la següent pregunta (en un comentari al final del codi): Posa un
	 * exemple de la vida real de cadascun dels dos tipus de cues (no
	 * necessàriament quan els objectes són models de cotxes!)
	 * 
	 * 
	 * FIFO : Un supermercado del stock de alimentos que se vayan a vencer FIFO
	 */

}
