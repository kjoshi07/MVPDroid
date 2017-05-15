package com.kc.mvpdroid.presenter;

import android.view.View;

import com.kc.mvpdroid.model.User;
import com.kc.mvpdroid.view.UserView;

/**
 * Created by Khemchand Joshi on 5/15/2017.
 */

public interface UserPresenter {

    void setView(UserView view);
    void saveUser();
}
