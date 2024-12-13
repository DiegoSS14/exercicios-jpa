package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Rodrigo", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluirT(assento)
                .incluirT(cliente)
                .fecharT()
                .fechar();
    }
}
