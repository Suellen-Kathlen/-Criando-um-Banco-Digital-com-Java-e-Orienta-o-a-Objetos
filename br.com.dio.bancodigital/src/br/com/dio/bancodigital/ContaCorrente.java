package br.com.dio.bancodigital;

public class ContaCorrente extends Conta {

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta corrente");
		System.out.println(String.format("Titular: %s", super.agencia));
		System.out.println(String.format("Ag?ncia: %d", super.agencia));
		System.out.println(String.format("N?mero: %d", super.numero));
		System.out.println(String.format("Saldo: %f", super.saldo));
		
	}
	
	
}
