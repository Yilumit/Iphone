package Inicio.iPod;

public class IPod extends ReprodutorMusical{

	public void iniciar() {
		System.out.println("Iniciando IPod...");
	}
	
	public void tocar() {
		System.out.println("Tocando musica");
		int escolher = (int) ((Math.random()*1)+1);
		if (escolher == 1) {
			pausar();
		} else {
			encerrarMusica();
		}
	}

	public void encerrarMusica() {
		System.out.println("A musica parou de tocar");
	}

	public void pausar() {
		System.out.println("Muscica pausada");
		retomarMusica();
	}

	public void retomarMusica() {
		System.out.println("Musica retomada");
		encerrarMusica();
	}

	public void selecionarMusica() {
		System.out.println("Musica selecionada");
		tocar();
	}

}
