package br.com.bytebank.banco.modelo;

// Exce��o unchecked
public class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
