package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 23", 1163.40 );

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.abrirT().incluirT(produto).fecharT().fechar();

    }
}
