package com.example.controllers;

import com.example.models.User;
import com.example.models.UserStatus;
import com.example.models.UserType;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@RestController
public class AdminController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/admin")
    public User register(@RequestBody User userDetails){
        User user = new User();

        user.setName(userDetails.getName());
        user.setMobileNo(userDetails.getMobileNo());
        user.setPincode(userDetails.getPincode());
        user.setUserType(UserType.ADMIN);

        return userRepository.save();
    }

    @PostMapping("/admin/updateStatus")
    public PatientUpdateStatus updateUserStatus(@RequestBody UserStatusDestails userStatusDestails){
        User admin = userRepository.findById(userStatusDestails.getAdminId())
                .orElseThrow(() -> new UserNotFoundException(""));

        if(!user.getUserType().equals(UserType.ADMIN))
            throw new NotAuthorizedException("");



        UserStatus userStatus = new UserStatus();

        User user = userRepository.findById(userStatusDestails.getUserId())
                .orElseThrow(() -> new UserNotFoundException(""));
        userStatus.();
        return userRepository.save();
    }

}
