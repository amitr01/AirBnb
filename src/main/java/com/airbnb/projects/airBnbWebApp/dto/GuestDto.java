package com.airbnb.projects.airBnbWebApp.dto;

import com.airbnb.projects.airBnbWebApp.entity.User;
import com.airbnb.projects.airBnbWebApp.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
