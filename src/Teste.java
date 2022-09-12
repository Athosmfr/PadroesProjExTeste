
public class Teste {

	public static void main(String[] args) {
		
		// Cliente
		
		Cliente cliente = new Cliente();
		cliente.nome = "Athos";
		cliente.cpf = "2453";
		
		// Serviços
		
		baseServico pintura = new baseServico();
		
		pintura.titulo = "Pintura";
		pintura.valor = 25.50;
		pintura.data = "05/09/2022";
		
		servicoHora cuidadorIdoso = new servicoHora();
		
		cuidadorIdoso.titulo = "Cuidador de Idoso";
		cuidadorIdoso.valor = 20;
		cuidadorIdoso.hora = 6;
		cuidadorIdoso.data = "07/09/2022";
		
		servicoMateriais manuEletrc = new servicoMateriais();
		
		material lampada = new material();
		
		lampada.nomeProduto = "Lampada Elgin";
		lampada.precoProduto = 40.99;
		
		manuEletrc.listaMateriais.add(lampada);
		manuEletrc.titulo = "Troca de Lampadas";
		manuEletrc.valor =  60;
		manuEletrc.data = "10/09/2022";
		
		servicoDrenagem drenagem = new servicoDrenagem();
		
		drenagem.titulo = "Drenagem";
		drenagem.valor = 200;
		drenagem.volume = 20;
		drenagem.data = "12/09/2022";
		
		// ==================================================
		// Agendamento
		
		agendamento agenda01 = new agendamento();
		
		//agenda01.data = "07/11/2022";
		agenda01.servico.add(pintura);
		agenda01.servico.add(cuidadorIdoso);
		agenda01.servico.add(manuEletrc);
		agenda01.servico.add(drenagem);
		
		agenda01.cliente = cliente;
		
		//agenda01.Agendar(agenda01.data);
		
		// ==================================================
		// Pagamento
		
		cobranca cobrar01 = new cobranca();
		cobrar01.metodoPgto = metodoPgto.Pix;
		agenda01.Agendar();
		cobrar01.Cobrar(agenda01);
		System.out.println();
		
	}
	
}
