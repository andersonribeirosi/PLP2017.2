/**
 * 
 * @author Anderson Ribeiro
 * 
 */

public interface Destruidor {

	public default void atacar() {
		System.out.println("Atirar com fuzil.");
	}

}
