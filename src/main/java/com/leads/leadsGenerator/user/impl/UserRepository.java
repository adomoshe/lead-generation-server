package com.leads.leadsGenerator.user.impl;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("USER_REPOSITORY")
public interface UserRepository extends PagingAndSortingRepository<UserRecord, UUID>,
        JpaSpecificationExecutor<UserRecord> {

}
