package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Role")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Role {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "role_seq_gen")
    @SequenceGenerator(name = "role_seq_gen",sequenceName = "role_seq",allocationSize = 1,initialValue = 1)
    @Id
    private Integer roleId;

    @Column(name="name",nullable=false)
    private String name;


}
