package com.cumulare.clinical.acquisition.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@NoArgsConstructor
public class Member {
    private String id;
    private String firstName;
    private String lastName;
    private String dob;
}
