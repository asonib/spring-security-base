package com.asb.expbaseservice.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class LogModel {
    private Long id;
    private String message;
}
