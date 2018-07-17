package com.example.practice.test.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.practice.test.R;
import com.example.practice.test.contract.LoginContract;
import com.example.practice.test.model.LoginResBean;
import com.example.practice.test.presenter.LoginPresenter;

public class MainFragment extends Fragment implements LoginContract.MainView{

    private LoginPresenter loginPresenter;

    private TextView textView;
    private TextView tv_login_username;
    private TextView tv_login_status;
    private TextView tv_login_token;

    private LoginResBean loginResBean;

    private String userName;
    private String status;
    private String token;

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Log.d("handleMessage", "handleMessage: ");
            super.handleMessage(msg);
            loginResBean = (LoginResBean)msg.obj;
            userName = loginResBean.getData().getUser().getUserName();
            status = loginResBean.getMessage();
            token = loginResBean.getData().getToken();
            getTest();
        }
    };
    private String TAG = MainFragment.class.getSimpleName();

    private void getTest() {
        Log.d(TAG+"+token", token);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        loginPresenter = new LoginPresenter(this);
        textView = view.findViewById(R.id.tv_response);
        tv_login_username = view.findViewById(R.id.tv_login_username);
        tv_login_status = view.findViewById(R.id.tv_login_status);
        tv_login_token = view.findViewById(R.id.tv_login_token);
//        tv_login_username.setText(userName);
//        tv_login_status.setText(status);
//        tv_login_token.setText(token);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        LoginResBean bean = bundle.getParcelable("key");
    }

    @Override
    public void showLoginSuccess(LoginResBean loginResBean) {
        Message msg = new Message();
        msg.obj = loginResBean;
        handler.sendMessage(msg);
    }
}
