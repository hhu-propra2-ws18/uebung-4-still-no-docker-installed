package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.*;

@Data // Lombok - Generiert Getter, Setter, toString, ...
@Entity
public class Auto{
    @Id
    @GeneratedValue
    private Long id;

    private String marke;
    private String farbe;
    private int hubraum;
}
