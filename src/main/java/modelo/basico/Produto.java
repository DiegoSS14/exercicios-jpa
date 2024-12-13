package modelo.basico;

import infra.DAO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Table(name = "produtos") // Anotation que vai nomear a tabela
@Entity // Anotation que vai vincular a classe ao banco de dados
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id // Anotation que define que o atributo é o identificador único
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "prod_nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "prod_preço", nullable = false)
    private Double preco;

    public int cb;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
