package com.cydeo.model;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate birthDay;
    @Email
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;



}
