package com.pawinc.myblog.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The title is mandatory")
    @Column(unique = true)
    private String title;

    @Column(name = "meta_title")
    @NotBlank
    private String metaTitle;

    @NotBlank(message = "Short description is mandatory")
    private String summary;

    @Column(name = "created_at")
    @NotNull
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @NotNull
    private LocalDateTime updatedAt;

    @NotBlank
    private String content;

    @Column(name = "likes_count")
    private Integer likesCount;

    @Column(name = "views_count")
    private Integer viewsCount;

    @OneToMany(mappedBy = "postId")
    private Set<PostComment> comments;

    @ManyToOne
    @JoinColumn(
            name = "user_id",
            nullable = false
    )
    private User author;


}
