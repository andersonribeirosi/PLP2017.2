/**
 * 
 * @author Anderson Ribeiro
 * 
 */

public interface AutoDestruidor {

	public default void atacar() {
		System.out.println("Rob� bomba, explodir!");
	}
}
