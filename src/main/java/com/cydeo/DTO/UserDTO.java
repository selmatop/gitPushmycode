package com.cydeo.DTO;

import com.cydeo.Enums.Gender;
import com.cydeo.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String passWord;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    public UserDTO(String sam, String smith, String username, String abc1, boolean enabled, String phone, RoleDTO employeeRole, Gender male) {
    }

}
