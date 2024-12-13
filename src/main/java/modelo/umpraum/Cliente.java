package modelo.umpraum;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
    }
}
