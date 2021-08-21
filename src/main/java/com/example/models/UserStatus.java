package com.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserStatus {

    private User user;
    private User admin;

    private UserResult userResult;
}
