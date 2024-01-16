package xmen;

public class Tormenta implements PuedeVolar {

	@Override
	public void saltar() {
		System.out.println("Estoy saltando");
	}

	@Override
	public void mover() {
		System.out.println("Estoy moviendome");
		
	}

	@Override
	public void volar() {
		System.out.println("Vuela vuelaaaa");
	}

}
