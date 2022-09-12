
public class servicoHora extends baseServico {

	protected int hora;
	
	public double valorFinal() {
		return valor * hora;
	}
	
	public int valorHora() {
		if (hora <= 0) {
			return hora = 1;
		} 
		return hora;
	}
	
}
