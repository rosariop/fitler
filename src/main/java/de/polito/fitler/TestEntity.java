package de.polito.fitler;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="testEntity")
@Data
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

}
