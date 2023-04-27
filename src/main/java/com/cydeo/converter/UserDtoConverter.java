package com.cydeo.converter;

import com.cydeo.DTO.RoleDTO;
import com.cydeo.DTO.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.core.convert.converter.Converter;

import java.lang.annotation.Annotation;

public class UserDtoConverter implements Converter<String, UserDTO> {
 UserService userService;
    UserDtoConverter(UserService userService){
        this.userService = userService;
    }
    @Override
    public UserDTO convert(String source) {
        userService.findByUserName(source);

        return null;
    }
}
