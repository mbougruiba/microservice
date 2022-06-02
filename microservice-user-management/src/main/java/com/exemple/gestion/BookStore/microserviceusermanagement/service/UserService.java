package com.exemple.gestion.BookStore.microserviceusermanagement.service;


import com.exemple.gestion.BookStore.microserviceusermanagement.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> idList);
}
