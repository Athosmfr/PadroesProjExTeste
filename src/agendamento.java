import java.util.ArrayList;

public class agendamento {

	//protected String data;
	protected ArrayList<baseServico> servico = new ArrayList<>();
	protected Cliente cliente;
	
	public void Agendar() {
		for(baseServico servico: servico) {
			System.out.printf("%s - custo: R$%.2f - data: %s %n", 
					servico.titulo, 
					servico.valorFinal(), 
					servico.data);
		}
	}
	
}

// Agendamento esta errado a data tem que estar dentro do servico, para determinar quando cada servico vai ser feito e não todos em um unico dia.