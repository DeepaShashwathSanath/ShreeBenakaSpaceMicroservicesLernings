package com.shreebenakaaspace.content.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "contents")
public class Content {


    private Long id;
    private String title;
    private String description;
    //Content belongs to User
    //This becomes your first microservice relationship.
    private Long userId;


}
