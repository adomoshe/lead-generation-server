package com.leads.leadsGenerator.user.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UUID id;

    /**
     * System fields
     */

    private Date createdAt;

    private Date updatedAt;

    /**
     * User's identity information
     **/

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    /**
     * User's Settings
     **/

    private String state;

    private String city;

}
