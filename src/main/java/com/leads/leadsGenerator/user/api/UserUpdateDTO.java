package com.leads.leadsGenerator.user.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.openapitools.jackson.nullable.JsonNullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDTO {

    /**
     * User's identity information
     **/

    private String firstName;

    private String lastName;


    /**
     * User's Location
     **/

    private JsonNullable<String> state = JsonNullable.undefined();

    private JsonNullable<String> city = JsonNullable.undefined();


}
