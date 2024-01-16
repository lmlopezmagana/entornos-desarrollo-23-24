package herenciaeinterfaces;

public class SuperHeroe extends Personaje
	implements PuedeVolar {

	@Override
	public void volar() {
		System.out.println("Volando voolando siempre arribaaaa");		
	}

}
