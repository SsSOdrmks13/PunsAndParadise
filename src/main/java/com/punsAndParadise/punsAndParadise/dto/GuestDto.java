package com.punsAndParadise.punsAndParadise.dto;

import com.punsAndParadise.punsAndParadise.entity.User;
import com.punsAndParadise.punsAndParadise.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {

    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
