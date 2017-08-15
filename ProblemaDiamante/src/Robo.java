/**
 * 
 * @author Anderson Ribeiro
 * 
 */
public class Robo implements Prototipo, Destruidor {

	public static void main(String[] args) {
		Robo robo = new Robo();
		robo.atacar();
	}

	/*
	 * Ele iria se confundir, se comportar de maneira inesperada e imprevisível.
	 * Ou seja, ele não saberia qual método ele deveria usar Unresolved
	 * compilation (Não compila)
	 */

}
