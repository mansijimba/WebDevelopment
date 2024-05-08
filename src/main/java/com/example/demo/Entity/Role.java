package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Role")

public class Role {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "role_seq_gen")
    @SequenceGenerator(name = "role_seq_gen",sequenceName = "role_seq",allocationSize = 1,initialValue = 1)
    @Id
    private Integer id;


}
