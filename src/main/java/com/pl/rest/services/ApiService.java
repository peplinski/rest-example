package com.pl.rest.services;

import com.pl.rest.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
