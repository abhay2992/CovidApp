package com.example.security.authentication;

import com.example.models.User;

import java.util.Optional;

public interface AuthenticationContext {
    Optional<User> getCurrentlyLoggedInUser();
}
