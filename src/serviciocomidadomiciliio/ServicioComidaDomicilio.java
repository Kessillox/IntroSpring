package serviciocomidadomiciliio;

import serviciocobro.ServicioCobro;
import servicioenvio.ServicioVerificacion;
import servicioregistro.ServicioRegistro;

public class ServicioComidaDomicilio {
	
	ServicioCobro cobro;
	ServicioVerificacion envio;
	ServicioRegistro registro;
	
	public ServicioComidaDomicilio() {
		super();
		this.cobro = new ServicioCobro();
		this.envio = new ServicioVerificacion();
		this.registro = new ServicioRegistro();
	}
	
	public void solicitar () {
		
		registro.registrarPedido();
		cobro.cobrarPedido();
		envio.enviarPedido();
		
	}
	

	
}
