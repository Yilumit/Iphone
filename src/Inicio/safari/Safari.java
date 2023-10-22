package Inicio.safari;

public class Safari extends NavegadorNaInternet{

	public void iniciar() {
		System.out.println("Abrindo Safari...");
		adicionarNovaAba();
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo página da Internet no Safari");
		atualizarPagina();
	}

	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		exibirPagina();
	}

	public void atualizarPagina() {
		System.out.println("Página Atualizada");
	}

}
