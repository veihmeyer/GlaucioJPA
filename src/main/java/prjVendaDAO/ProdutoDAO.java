package prjVendaDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import prjVendaDAO.RepositorioCliente.*;

public class ProdutoDAO {
	
	private EntityManager conexao = null;
	
	public ProdutoDAO(EntityManagerFactory emf) {
		
		conexao = emf.createEntityManager();
		
	}
	
	public ProdutoDAO() {
		// TODO Auto-generated constructor stub
	}

	public void adicionar(Produto p) {
		
		conexao.getTransaction().begin();
		conexao.persist(p);
		conexao.getTransaction().commit();
		
	}
	
	public void remover(Produto p) {
		
		conexao.getTransaction().begin();
		conexao.remove(p);
		conexao.getTransaction().commit();
		conexao.close();
	}
	
	public Produto consular(int id) {
		
		return conexao.find(Produto.class, id);
		
	}
	
	
}
