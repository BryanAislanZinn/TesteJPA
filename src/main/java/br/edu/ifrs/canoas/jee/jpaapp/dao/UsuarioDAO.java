package br.edu.ifrs.canoas.jee.jpaapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifrs.canoas.jee.jpaapp.pojo.Usuario;
import br.edu.ifrs.canoas.jee.jpaapp.util.EntityManagerUtil;

public class UsuarioDAO {

	 private EntityManager em;

	    public UsuarioDAO() {
	    	this.em = EntityManagerUtil.getEM();
	    }

	    public void salva(Usuario usuario) {
	    	em = EntityManagerUtil.getEM();
	    	em.getTransaction().begin();
	    	em.persist(usuario);
	    	em.getTransaction().commit();
	    	em.close();
	    }

	    public void atualiza(Usuario usuario) {
	    	em = EntityManagerUtil.getEM();
	    	em.getTransaction().begin();
	    	em.merge(usuario);
	    	em.getTransaction().commit();
	    	em.close();	
	    }

	    public void remove(Long id) {
	    	em = EntityManagerUtil.getEM();
	    	em.getTransaction().begin();
	    	
	    	Usuario user = em.find(Usuario.class, id);
	    	if(user != null)
	    	   em.remove(user);
	    	
			em.getTransaction().commit();
			em.close();
	    }

	    public Usuario busca(Long id) {
	    	em = EntityManagerUtil.getEM();
	    	em.getTransaction().begin();
	    	Usuario user = em.find(Usuario.class, id);
	    	em.close();
	    	
	    	return user;
	    }

	    public List<Usuario> busca() {
	    	em = EntityManagerUtil.getEM();
	    	em.getTransaction().begin();
	    	TypedQuery<Usuario> query = em.createQuery("SELECT usr FROM Usuario usr", Usuario.class);
	    	List<Usuario> usuarios = query.getResultList();
	    	em.close();
	    	
	    	return usuarios;
	    }

	    public List<Usuario> buscaPorEmail(String email) {
	    	em = EntityManagerUtil.getEM();
	    	em.getTransaction().begin();
	    	TypedQuery<Usuario> query = em.createQuery("SELECT usr FROM Usuario usr where lower(email) = lower(:email) ", Usuario.class);
	    	query.setParameter("email", email);
	    	List<Usuario> usuarios = query.getResultList();
	    	em.close();
	    	
	    	return usuarios;
	    }
}
