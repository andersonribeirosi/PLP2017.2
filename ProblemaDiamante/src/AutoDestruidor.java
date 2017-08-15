/**
 * 
 * @author Anderson Ribeiro
 * 
 */

public interface AutoDestruidor {

	public default void atacar() {
		System.out.println("Robô bomba, explodir!");
	}
}
