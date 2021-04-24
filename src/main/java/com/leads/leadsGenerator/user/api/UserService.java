package com.leads.leadsGenerator.user.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.UUID;

public interface UserService {

    Page<UserDTO> getAllUsers(String query, Pageable pageable);

    List<UserDTO> getAllUsers(String query, Sort sort);

    UserDTO getUser(UUID id);

    UserDTO saveUser(UserDTO dto);

    void deleteUser(UUID id);

    UserDTO updateUser(UUID id, UserDTO dto);

}
