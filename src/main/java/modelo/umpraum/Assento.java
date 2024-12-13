package modelo.umpraum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "Assentos")
public class Assento {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    public Assento(String nome) {
        this.nome = nome;
    }
}
