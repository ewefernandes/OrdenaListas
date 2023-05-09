package controller;
import br.edu.fateczl.lista.listaint.*;

public class OperacoesListas {

	public void ordenaBubbleLista(Lista l) throws Exception {
		int size = l.size();
		int w = 0;
		
		do {
			w = 0;
			for (int c = 0; c < size-1; c ++) {
				int v = l.get(c);
				int v1 = l.get(c+1);
				if (v > v1) {
					l.remove(c);
					l.add(v1, c);
					l.remove(c+1);
					l.add(v, c+1);
					w = 1;
				}
			}
		} while (w != 0);
		
		l.toString();
	}
	
}
