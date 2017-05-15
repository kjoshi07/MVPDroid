package com.kc.mvpdroid.view;

/**
 * Created by User on 5/15/2017.
 */

public interface UserView {

    String getFirstName();
    String getLastName();
    String getEmail();

    void setErrorMessageForWidget(String widgetName);

    void showUserInfoSaved();
}
