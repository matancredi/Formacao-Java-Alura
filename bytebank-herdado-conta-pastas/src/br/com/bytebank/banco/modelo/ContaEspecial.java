package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
	
//	Modificadores de acesso/visibilidade
//	public:vis�vel em todos os espa�os
//	protected: vis�vel dentro do pacote e p�blico para os filhos
//	package private: vis�vel apenas dentro do pacote
//	private: vis�vel apenas dentro da classe
	
}
