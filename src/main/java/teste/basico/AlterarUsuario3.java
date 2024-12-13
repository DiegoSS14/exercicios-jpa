package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class AlterarUsuario3 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 4);

        em.getTransaction().begin();

        em.detach(usuario);

        usuario.setNome("Diego Sousa");
        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
