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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Category_id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "post" ,cascade = CascadeType.ALL)
    List<Post>list=new ArrayList<>();
}
