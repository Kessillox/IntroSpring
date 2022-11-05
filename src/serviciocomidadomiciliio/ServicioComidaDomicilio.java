package serviciocomidadomiciliio;

import serviciocobro.ServicioCobro;
import servicioenvio.ServicioEnvio;
import servicioregistro.ServicioRegistro;

public class ServicioComidaDomicilio {
	
	ServicioCobro cobro;
	ServicioEnvio envio;
	ServicioRegistro registro;
	
	public ServicioComidaDomicilio() {
		super();
		this.cobro = new ServicioCobro();
		this.envio = new ServicioEnvio();
		this.registro = new ServicioRegistro();
	}
	
	public void solicitar () {
		
		registro.registrarPedido();
		cobro.cobrarPedido();
		envio.enviarPedido();
		
	}
	

	
}
