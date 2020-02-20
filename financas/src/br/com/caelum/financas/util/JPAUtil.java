package br.com.caelum.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	// Estados da entidade no JPA:
	// - Transient: Novo objeto
	// - Managed: Ap�s chamar o persist, at� o em.close()
	// - Detached: Existe no banco, ams n�o est� gerenciada pelo JPA, sendo necess�rio chamar o find() e merge()
	// - Removed: N�o h� mais representa��o ou registro no banco, mas a entidade continua em mem�ria

}
