package com.pawinc.myblog.model;

import com.pawinc.myblog.model.enums.Gender;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table()
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @NotBlank
    private String firstName;

    @Column(name = "last_name")
    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @NotBlank
    private String lastName;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Gender gender;

    @Column(name = "email")
    @Pattern(regexp = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}", message = "Must be a valid e-mail address")
    @NotBlank
    private String email;

    @Column(name = "password")
    @Pattern(regexp = "(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}",
            message = "Must be minimum 8 characters, at least one letter and one number")
    @NotBlank
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
