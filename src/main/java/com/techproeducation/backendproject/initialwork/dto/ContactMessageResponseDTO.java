package com.techproeducation.backendproject.initialwork.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ContactMessageResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String subject;
    private String message;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime creationDateTime;
}