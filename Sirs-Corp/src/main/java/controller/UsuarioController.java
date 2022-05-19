package controller;

import javax.persistence.EntityManager;

import model.JPAFactory;
import model.Usuario;


public class UsuarioController {
	
	public static void main(String[] args) {
		// Obtendo um administrador de entidades
		EntityManager em = JPAFactory.getEntityManager();
		
		// Criando um objeto usuario 
		Usuario usu = new Usuario(null, "Pedro", "pedro", "123");
		
		// Iniciando uma transacao com o banco de dados
		em.getTransaction().begin();
		
		em.persist(usu);
		
		em.getTransaction().commit();

		System.out.println("Funcionou.");
	}

}
