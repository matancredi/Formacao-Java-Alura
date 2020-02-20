package br.com.caelum.financas.util;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;

public class TesteBuscaConta {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		// Objetivo: Buscar conta de id 1 (par�metro da chave prim�ria)
		Conta conta = em.find(Conta.class, 1);
		
		conta.setTitular("Karen Carpenter");
		
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();
		
	}

}
