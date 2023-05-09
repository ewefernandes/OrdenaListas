package view;
import br.edu.fateczl.lista.listaint.*;
import controller.OperacoesListas;

public class Main {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		OperacoesListas op = new OperacoesListas();
		
		lista.addFirst(10);
		lista.add(5, 1);
		lista.add(8, 2);
		lista.add(1, 3);
		lista.add(9, 4);
		lista.add(2, 5);
		lista.add(4, 6);
		lista.add(7, 7);
		lista.add(3, 8);
		lista.addLast(6);
		
		op.ordenaBubbleLista(lista);
		System.out.println(lista.toString());
	}

}
