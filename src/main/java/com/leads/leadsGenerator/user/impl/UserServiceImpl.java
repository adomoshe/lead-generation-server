package com.leads.leadsGenerator.user.impl;

import com.leads.leadsGenerator.user.api.UserDTO;
import com.leads.leadsGenerator.user.api.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("USER_SERVICE")
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final UserDtoMapper mapper;

    public UserDTO saveUser(UserDTO dto) {
        UserRecord user = mapper.fromDto(dto);
        UserRecord record = repository.save(user);
        return mapper.toDto(record);
    }

    @Override
    public Page<UserDTO> getAllUsers(String query, Pageable pageable) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers(String query, Sort sort) {
        return null;
    }

    @Override
    public UserDTO getUser(UUID id) {
        return null;
    }

    @Override
    public void deleteUser(UUID id) {

    }

    @Override
    public UserDTO updateUser(UUID id, UserDTO dto) {
        return null;
    }
}
