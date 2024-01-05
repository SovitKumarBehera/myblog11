package com.myblog.myblog11.entity;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="posts")//in the database i want the table name as post
@Entity
@Data//because i have added lombok in project structure,so using this automatically getters and setters are
    //created for this below variables
@AllArgsConstructor
@NoArgsConstructor
public class Post {          //dt-03/01/2024
    @Id//for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//for auto increment
    private long id;
    private String title;
    private String description;
    private String content;
}
