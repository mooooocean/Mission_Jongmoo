package com.example.Mission_Jongmoo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<Post> posts;
}