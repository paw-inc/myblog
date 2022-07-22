package com.pawinc.myblog.model;

import com.pawinc.myblog.model.enums.Gender;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @NotBlank(message = "The first name is mandatory")
    private String firstName;

    @Column(name = "last_name")
    @Pattern(regexp = "[A-Z][a-z]+",
            message = "Must start with a capital letter followed by one or more lowercase letters")
    @NotBlank(message = "The last name is mandatory")
    private String lastName;

    @NotNull
    @Column(name = "gender")
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @Pattern(regexp = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}", message = "Must be a valid e-mail address")
    @NotBlank(message = "The email is mandatory")
    private String email;

    @Pattern(regexp = "(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}",
            message = "Must be minimum 8 characters, at least one letter and one number")
    @NotBlank(message = "The password is mandatory")
    private String password;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "registered_at")
    @NotNull
    private LocalDateTime registeredAt;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "author")
    private Set<Post> posts;

    @OneToMany(mappedBy = "author")
    private Set<PostComment> comments;

    public User() {}

}
