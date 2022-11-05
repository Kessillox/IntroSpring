package serviciocomidadomiciliio;

import interfaces.IServicioComidaDomicilio;
import serviciocobro.ServicioCobro;
import servicioenvio.ServicioVerificacion;
import servicioregistro.ServicioRegistro;

public class ServicioComidaDomicilio implements IServicioComidaDomicilio {
	
	ServicioCobro cobro;
	ServicioVerificacion envio;
	ServicioRegistro registro;
	
	
	public ServicioComidaDomicilio() {
		super();
		this.cobro = new ServicioCobro();
		this.envio = new ServicioVerificacion();
		this.registro = new ServicioRegistro();
	}
	@Override
	public void solicitar () {
		
		registro.registrarPedido();
		cobro.cobrarPedido();
		envio.verificarPedido();
		envio.enviarPedido();
		
		
	}
	

	
}
