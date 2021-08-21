package com.example.covidapp.exceptions.authontication;

import com.example.covidapp.exceptions.CovidAppException;

public class NotLoggedInException extends CovidAppException {
    public NotLoggedInException(String message) {
        super(message);
    }
}

