package com.example.demo.Entity;
import jakarta.persistence.*;
@Entity
@Table(name="Book")

public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "information_seq_gen")
    @SequenceGenerator(name = "information_seq_gen",sequenceName = "information_seq",allocationSize = 1,initialValue = 1)
    @Id
    private Integer id;

    @Column(name="date",length = 255)
    private String date;

    //foreign key
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ground_id",referencedColumnName = "id"
            ,foreignKey = @ForeignKey(name="fk_book_ground_id"))
    private Futsal futsal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",referencedColumnName = "id"
            ,foreignKey = @ForeignKey(name="fk_book_user_id"))
    private User user;
    }


