package serviciocobro;

import interfaces.IServicioCobro;

public class ServicioCobro implements IServicioCobro {

	@Override
	public void cobrarPedido() {
		System.out.println("Cobrar Pedido");
	}
	
}
