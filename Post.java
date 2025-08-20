package com.api.blog.entitey;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int post_id;
    private String Title;
    private  String Content;
    private  String image_Name;
    private  String added_Data;
    @ManyToOne
    private  Category category;
    @ManyToOne
    private  User user;
}
