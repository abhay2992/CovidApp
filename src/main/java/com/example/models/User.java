package com.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    private int id;
    private String name;
    private long mobileNo;
    private long pincode;
    private UserType userType;
}
