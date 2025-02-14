package com.techproeducation.backendproject.initialwork.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ContactMessageCreateDTO {

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String subject;

    @NotNull
    private String message;
}