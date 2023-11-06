package com.example.diploma_2.dto;

import com.example.diploma_2.entities.Role;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
public class RegistrationUserDto {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
}
