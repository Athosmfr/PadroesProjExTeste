import java.util.ArrayList;

public class cobranca {

	protected ArrayList<baseServico> servico = new ArrayList<>();
	protected metodoPgto metodoPgto;
	
	public void Cobrar(agendamento Agenda) {
		 //System.out.println(Agenda.servico.); //+ " - " + Agenda.servico.get(0).data + " - R$: " + Agenda.servico.get(0).valor);
		 System.out.println("\nValor Final a ser Pago: R$" + totalServicos(Agenda) + "\nMetodo de Pagamento: " + metodoPgto); 
	}
	
	public double totalServicos(agendamento Agenda) {
		double total = 0;
		for(baseServico valor: Agenda.servico) {
			total += valor.valorFinal();
		}
		return total;
	}
}
