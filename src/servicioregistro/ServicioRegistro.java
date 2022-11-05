package servicioregistro;

import interfaces.IServicioRegistro;

public class ServicioRegistro implements IServicioRegistro {
	
	@Override
	public void registrarPedido() {
		System.out.println("Registrar Pedido");
	}

}
