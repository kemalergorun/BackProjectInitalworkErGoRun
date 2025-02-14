package com.techproeducation.backendproject.initialwork.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactMessageUpdateDTO {
    private String name;
    private String email;
    private String subject;
    private String message;
}