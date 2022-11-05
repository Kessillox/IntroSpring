package servicioenvio;

public class ServicioVerificacion extends ServicioEnvio {
	public void enviarPedido () {
		System.out.println("Pedido verificado");
		super.enviarPedido();
	}

}
