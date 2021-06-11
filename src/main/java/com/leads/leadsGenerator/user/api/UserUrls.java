package com.leads.leadsGenerator.user.api;

public interface UserUrls {

    String RESOURCE_NAME = "/users";

    String UUID = "/{id}";

    String BASE = RESOURCE_NAME;

    String GET = BASE + UUID;

    String GET_ALL = BASE;

    String FIND = BASE;

    String CREATE = BASE;

}
