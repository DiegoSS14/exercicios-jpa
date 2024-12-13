package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 2);
        System.out.println(usuario.getNome());

        usuario.setNome("Filipe Sousa");
        System.out.println("O novo nome é: " + usuario.getNome());

        emf.close();
        em.close();
    }
}
