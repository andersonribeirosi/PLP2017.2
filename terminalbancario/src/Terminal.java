import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Terminal {

	ContaCorrente cc = new ContaCorrente(0416, 33995, 1000, 1000, 2000, "Anderson");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

			
		try {
			cc.depositar(500);
		} catch (ValorDepositoInvalidoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		try {
			cc.sacar(500);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	
		try {
			cc.setValorLimite(0);
		} catch (ValorLimiteExcedidoException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		
		System.out.println("Titular da Conta: " + cc.getTitular());
		System.out.println("Agencia: " + cc.getAgencia());
		System.out.println("Conta: " + cc.getConta());
		System.out.println("Saldo atual �: " + cc.getSaldo());

	}
}