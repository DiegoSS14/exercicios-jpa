package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import modelo.basico.Usuario;

import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        for (Usuario u: usuarios) {
            System.out.println("ID: " + u.getId()
            + " E-mail: " + u.getEmail());
        }

        emf.close();
        em.close();
    }
}
