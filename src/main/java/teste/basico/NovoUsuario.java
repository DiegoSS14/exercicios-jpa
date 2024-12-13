package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario( "Thiago Silva", "thiagos@gmail.com.br");

        Usuario novoUsuario2 = Usuario.builder()
                .email("sousadiego533@gmail.com")
                .nome("Diego Sousa")
                .build();

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.persist(novoUsuario2);
        em.getTransaction().commit();

        System.out.println("Os IDs adicionados foram: " + novoUsuario.getId() + " e " + novoUsuario2.getId());

        em.close();
        emf.close();
    }
}
