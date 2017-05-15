package com.kc.mvpdroid.repository;

import com.kc.mvpdroid.model.User;

/**
 * Created by Khemchand Joshi on 5/15/2017.
 */

public interface UserRepository {
    User getUser(Long id);
    void saveUser(User user);
}
