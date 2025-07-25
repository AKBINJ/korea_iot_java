package org.example.z_project.user_reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRegisterRequestDto {
    private String userId;
    private String password;
    private String passwordCheck;
    private String name;
    private String email;
}
