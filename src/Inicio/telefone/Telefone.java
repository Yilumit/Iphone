package Inicio.telefone;

public class Telefone extends AparelhoTelefonico{

	public void iniciar() {
		System.out.println("Inciando Telefone...");
	}
	
	public void selecionarContato() {
		System.out.println("Selecionando contato");
		ligar();
	}
	
	public void ligar() {
		System.out.println("Ligando para o contato...");
		int escolher = (int) ((Math.random()*1)+1);
		if (escolher == 1) {
			System.out.println("Chamda atendida");
			desligarChamada();
		} else {
			System.out.println("Chamada não atendida");
		}
	}

	public void atender() {
		System.out.println("Telefone tocando...");
		int escolher = (int) ((Math.random()*1)+1);
		if (escolher == 1) {
			System.out.println("Telefone atendido");
			desligarChamada();
		} else {
			System.out.println("Chamada perdida");
		}
	}

	public void desligarChamada() {
		System.out.println("Chamada encerrada");
	}

	public void iniciarCorrerioVoz() {
		System.out.println("Tocando Correio de Voz");
		encerrarCorreioVoz();
	}

	public void encerrarCorreioVoz() {
		System.out.println("Correio de Voz encerrado");
	}

}
