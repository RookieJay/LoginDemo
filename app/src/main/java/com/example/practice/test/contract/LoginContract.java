package com.example.practice.test.contract;

import com.example.practice.test.model.Bean;
import com.example.practice.test.model.LoginResBean;
import com.example.practice.test.view.MainFragment;

import java.util.List;

public interface LoginContract {

    interface Model {
        List<Bean.DataBean.UsersBean> getData();
    }

    interface View {
        void showToast(String msg);
        String getAccount();
        String getPassword();
        LoginContract.MainView goToMainFragment(LoginResBean bean);
        void showResult(List<Bean.DataBean.UsersBean> usersBeanList);
        void setUserAccount(String userAccount);
    }

    interface Presenter {
        void validate();
        void loginSuccess();
        void loginFailed();
        void onSuccess(List<Bean.DataBean.UsersBean> usersBeanList);
    }

    interface MainView {
        void showLoginSuccess(LoginResBean loginResBean);
    }
}
