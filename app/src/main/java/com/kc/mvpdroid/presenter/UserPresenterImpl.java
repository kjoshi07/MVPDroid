package com.kc.mvpdroid.presenter;

import android.text.TextUtils;

import com.kc.mvpdroid.model.User;
import com.kc.mvpdroid.repository.UserRepository;
import com.kc.mvpdroid.view.UserView;

/**
 * Created by User on 5/15/2017.
 */

public class UserPresenterImpl implements UserPresenter {

    private UserView view;
    //private UserRepository userRepository;
    private User user;

    public UserPresenterImpl() {
        //this.userRepository = repository;
    }

    @Override
    public void setView(UserView view) {
        this.view = view;

    }

    @Override
    public void saveUser() {
        if (TextUtils.isEmpty(view.getFirstName())) {
            view.setErrorMessageForWidget("First Name");
            return;
        } else if (TextUtils.isEmpty(view.getLastName())) {
            view.setErrorMessageForWidget("Last Name");
            return;
        } else if (TextUtils.isEmpty(view.getEmail())) {
            view.setErrorMessageForWidget("Email");
            return;
        } else {
            view.showUserInfoSaved();
        }
    }
}
