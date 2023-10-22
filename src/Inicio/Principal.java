package Inicio;

import Inicio.iPod.IPod;
import Inicio.safari.Safari;
import Inicio.telefone.Telefone;

public class Principal {

	public static void main(String[] args) {
		Telefone tel = new Telefone();
		Safari safari = new Safari();
		IPod iPod = new IPod();
		
		tel.iniciar();
		tel.selecionarContato();
		tel.iniciarCorrerioVoz();
		System.out.println();
		
		safari.iniciar();
		System.out.println();
		
		iPod.iniciar();
		iPod.selecionarMusica();
		
	}

}
