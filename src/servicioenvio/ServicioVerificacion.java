package servicioenvio;

import interfaces.IServicioEnvio;

public class ServicioVerificacion implements IServicioEnvio{
	
	@Override
	public void enviarPedido () {
		System.out.println("Pedido enviado");

	}

	@Override
	public void verificarPedido() {
		System.out.println("Pedido verificado");
		
	}

}
