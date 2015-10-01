package exercici8_4;

import java.util.Comparator;

import exercici8_3.Cotxe;

public class cilindradaComparador implements Comparator<Cotxe> {
	@Override
	public int compare(Cotxe o1, Cotxe o2) {
		return (o1.getCilindrada() < o2.getCilindrada())? -1 : 1;
	}

}
