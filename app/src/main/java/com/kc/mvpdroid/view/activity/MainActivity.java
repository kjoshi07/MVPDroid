package com.kc.mvpdroid.view.activity;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kc.mvpdroid.R;
import com.kc.mvpdroid.presenter.UserPresenter;
import com.kc.mvpdroid.presenter.UserPresenterImpl;
import com.kc.mvpdroid.view.UserView;

public class MainActivity extends AppCompatActivity implements UserView {

    private TextInputLayout mFirstNameTextInputLayout, mLastNameTextInputLayout, mEmailTextInputLayout;
    private Button mRegisterButton;
    private TextView mErrorMessageTextView;
    private UserPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFirstNameTextInputLayout = (TextInputLayout) findViewById(R.id.firstNameInputLayout);
        mLastNameTextInputLayout = (TextInputLayout) findViewById(R.id.lastNameInputLayout);
        mEmailTextInputLayout = (TextInputLayout) findViewById(R.id.emailInputLayout);
        mErrorMessageTextView = (TextView) findViewById(R.id.errorMessageTextView);
        mRegisterButton = (Button) findViewById(R.id.registerButton);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.saveUser();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter = new UserPresenterImpl();
        mPresenter.setView(this);
    }

    @Override
    public String getFirstName() {
        return mFirstNameTextInputLayout.getEditText().getText().toString();

    }

    @Override
    public String getLastName() {
        return mLastNameTextInputLayout.getEditText().getText().toString();

    }

    @Override
    public String getEmail() {
        return mEmailTextInputLayout.getEditText().getText().toString();

    }

    @Override
    public void setErrorMessageForWidget(String widgetName) {
        mErrorMessageTextView.setVisibility(View.VISIBLE);
        mErrorMessageTextView.setText(widgetName + " should not be empty.");
    }


    @Override
    public void showUserInfoSaved() {
        Toast.makeText(getApplicationContext(), "User is saved successfully.", Toast.LENGTH_SHORT).show();

    }
}
