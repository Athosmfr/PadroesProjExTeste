import java.util.ArrayList;

public class servicoMateriais extends baseServico {
	
	protected ArrayList <material> listaMateriais = new ArrayList<>();
	
	public double custoMaterial() {
		double custo = 0;
		for (material Material: listaMateriais) {
			custo += Material.precoProduto;
		}
		return custo;
	}
	
	public double valorFinal() {
		return valor + custoMaterial();
	}

}
