package com.api.blog.entitey;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;
    @OneToMany(mappedBy = "User")
    List<User> list=new ArrayList<>();
}
