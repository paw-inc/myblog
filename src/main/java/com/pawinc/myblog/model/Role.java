package com.pawinc.myblog.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table()
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The 'name' cannot be empty")
    @Column(name = "name", unique = true)
    private String roleName;

    @OneToMany(mappedBy = "role")
    private Set<User> users;
}
