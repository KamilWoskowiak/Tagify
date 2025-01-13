package com.tagify.TagifySystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "buckets")
@Getter @Setter
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String color;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Bucket parent;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;


}
