public class ContaCorrente {

	private int agencia;
	private int conta;
	private float limite;
	private float saldo;
	private float valorLimite = 1000;
	private String titular;

	public ContaCorrente(int agencia, int conta, float limite, float saldo, float valorLimite, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValorLimite() {
		return valorLimite;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void sacar(float valor) throws SaldoInsuficienteException {

		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}
		System.out.println("Sacado: " + valor + "\n");
		this.saldo -= valor;
	}

	public void depositar(float valor) throws ValorDepositoInvalidoException {
		if (valor <= 0) {
			throw new ValorDepositoInvalidoException("Valor informado invalido!");
		} else {
			this.saldo += valor;
			System.out.println("Valor depositado com sucesso: " + valor);
		}

	}

	public void setValorLimite(float valorLimite) throws ValorLimiteExcedidoException  {
		if (valorLimite <= 0) {
			throw new ValorLimiteExcedidoException("Desculpe, você atingiu seu limite diário!");
		} else {
			this.valorLimite = valorLimite;
		}

	}

}
