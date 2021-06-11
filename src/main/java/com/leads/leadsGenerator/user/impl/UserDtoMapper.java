package com.leads.leadsGenerator.user.impl;

import com.leads.leadsGenerator.user.api.UserDTO;
import com.leads.leadsGenerator.user.api.UserUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Objects;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    UserDTO toDto(UserRecord record);

    UserRecord fromDto(UserDTO dto);

    @Mapping(target = "id", source = "dto.id", ignore = true)
    @Mapping(target = "createdAt", source = "dto.createdAt", ignore = true)
    @Mapping(target = "updatedAt", source = "dto.updatedAt", ignore = true)
    UserRecord toEntity(UserDTO dto, @MappingTarget UserRecord userRecord);

    default UserRecord toEntity(UserUpdateDTO dto, UserRecord userRecord) {

        if (Objects.nonNull(dto.getFirstName())) {
            userRecord.setFirstName(dto.getFirstName());
        }

        if (Objects.nonNull(dto.getLastName())) {
            userRecord.setLastName(dto.getLastName());
        }

        if (dto.getState().isPresent()) {
            userRecord.setState(dto.getState().get());
        }

        if (dto.getCity().isPresent()) {
            userRecord.setCity(dto.getCity().get());
        }

        return userRecord;
    }

}
