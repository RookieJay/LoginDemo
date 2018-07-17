package com.example.practice.test.presenter;

import com.google.gson.Gson;

import android.os.Looper;
import android.util.Log;

import com.example.practice.test.contract.LoginContract;
import com.example.practice.test.model.Bean;
import com.example.practice.test.model.LoginModel;
import com.example.practice.test.model.LoginResBean;
import com.example.practice.test.utils.EncryptUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginPresenter implements LoginContract.Presenter {

    private static final String TAG = LoginPresenter.class.getSimpleName();

    private LoginContract.Model loginModel;
    private LoginContract.View loginView;
    private LoginContract.MainView mainView;

    public LoginPresenter(LoginContract.View loginView) {
        loginModel = new LoginModel(this);
        this.loginView = loginView;
    }

    public LoginPresenter(LoginContract.MainView mainView) {
        loginModel = new LoginModel(this);
        this.mainView = mainView;
    }


    @Override
    public void validate() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String account = loginView.getAccount();
                String password = loginView.getPassword();
                if (login(account, password)) {
                    loginSuccess();
                } else {
                    loginFailed();
                    Log.d(TAG, "用户名或密码不正确");
                    Looper.prepare();
                    loginView.showToast("用户名或密码不正确");
                    Looper.loop();
                }
            }
        }).start();

    }

    public boolean login(String account, String password) {
        LoginResBean loginResBean = null;
        if (!account.isEmpty() && !password.isEmpty()) {
            Log.d(TAG, account + "+" + password);
            String loginResult = null;
            OkHttpClient client = new OkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            JSONObject jsonObject = new JSONObject();
            try {
                    jsonObject.put("license", "dfb9aaa49e773b001fef57c8afeb09fb");
                    jsonObject.put("account", account);
                    Log.d(TAG + "MD5", EncryptUtils.encryptMD5ToString(password));
                    jsonObject.put("password", EncryptUtils.encryptMD5ToString(password));
                    jsonObject.put("getTask", "0");
                    jsonObject.put("getReform", "0");
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
            RequestBody requestBody = RequestBody.create(mediaType, jsonObject.toString());
            Request request = new Request.Builder().post(requestBody)
                                                   .url("http://sczpkj.f3322.net:39999/api/mobile/auth/login")
                                                   .build();
            Response response;
            try {
                response = client.newCall(request).execute();
                loginResult = response.body().string();
                Log.d(TAG + "+loginResult", loginResult);
                loginResBean = parseLoginResult(loginResult);
                response.body().close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            if (loginResult != null) {
                if (loginResult.isEmpty()) {
                    return false;
                }
                else {
                    mainView = loginView.goToMainFragment(loginResBean);
                    mainView.showLoginSuccess(loginResBean);
                    return true;
                }
            }
            else {
                return false;
            }
        } else {
            Log.d(TAG, "账号或密码不能为空");
            return false;
        }
    }

    private LoginResBean parseLoginResult(String loginResult) {
        Gson gson = new Gson();
        LoginResBean loginResBean = gson.fromJson(loginResult, LoginResBean.class);
        String loginUsername = loginResBean.getData().getUser().getUserName();
        String loginStatus = loginResBean.getMessage();
        String token = loginResBean.getData().getToken();
        Log.d(TAG+"+loginUsername", loginUsername);
        Log.d(TAG+"+message", loginStatus);
        Log.d(TAG+"+token", token);
        
        return loginResBean;
    }

    public void getData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<Bean.DataBean.UsersBean> usersList = loginModel.getData();
                Log.d(TAG+"third", usersList.get(2).getAccount());
            }
        }).start();

    }

    @Override
    public void loginSuccess() {
        Log.d(TAG, "loginSuccess！！！");

    }

    @Override
    public void loginFailed() {
        Log.d(TAG, "loginFailed！！！");
    }

    @Override
    public void onSuccess(List<Bean.DataBean.UsersBean> usersBeanList) {
//        Looper.prepare();
//        loginView.showToast(usersBeanList.get(1).getAccount());
//        Looper.loop();
        loginView.showResult(usersBeanList);
    }
}
