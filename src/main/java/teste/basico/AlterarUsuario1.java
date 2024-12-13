package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 2);

        usuario.setNome("Lype");
        usuario.setEmail("Lype433@gmail.com.br");

        em.merge(usuario); // Substitui as informações da instância "usuario", pelas citadas acima.

        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
