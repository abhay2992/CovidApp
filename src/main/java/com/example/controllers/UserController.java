package com.example.controllers;

import com.example.models.User;
import com.example.models.UserType;
import com.example.repositories.UserRepository;
import com.example.riskCalculationstrategiest.NormalRiskCalculationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    public User register(UserDto userDetails){
        User user = new User();

        user.setName(userDetails.getName());
        user.setMobileNo(userDetails.getMobileNo());
        user.setPincode(userDetails.getPincode());
        user.setUserType(UserType.USER);

        return userRepository.save(user);
    }

    @PostMapping("/user/riskCalculator")
    public Risk calculateRisk(@RequestBody long userId, @RequestBody List<String> symptoms
            , @RequestBody boolean travelHistory, @RequestBody boolean contactWithCovidPatient){
        User user = userRepository.findById(userId)
                .orElseThrow(()-> new NoUserFoundException("User does not exists"));
        return new NormalRiskCalculationStrategy().caculateRisk(userSymptomsDetail);
    }



}
