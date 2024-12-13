package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class AlterarUsuario2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 1);

        usuario.setNome("Rodrigo Sousa");
        usuario.setEmail("rodrigosousa321@gmail.com");

//        em.merge(usuario); // Mesmo sem o "merge" comentado, o banco de dados continuará atualizando, isso acontece
//        porque a funcção de gerenciamento automático está ativada, porém é possível desativar.

        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
