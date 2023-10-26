package com.gabriel.sistemas.user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Date birthday;
    private String registration;
    private String cpf;
    private String rg;
    private String address;
    private String phone;
    private String email;
    private Boolean pcd;
    private String image;
    private String historicoEscolar;
    private String diplomaEnsinoMedio;
}
