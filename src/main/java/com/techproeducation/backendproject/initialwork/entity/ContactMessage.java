package com.techproeducation.backendproject.initialwork.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String subject;

    @NotNull
    private String message;

    @NotNull
    private LocalDateTime creationDateTime;

    // Getters and Setters
}