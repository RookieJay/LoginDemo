package com.example.practice.test.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.example.practice.test.contract.LoginContract;
import com.example.practice.test.presenter.LoginPresenter;
import com.example.practice.test.utils.EncryptUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginModel implements LoginContract.Model {

    private static final String TAG = LoginModel.class.getSimpleName();

    private LoginPresenter presenter;

    private String data;

    List<Bean.DataBean.UsersBean> users = new ArrayList<>();

    public LoginModel(LoginPresenter presenter) {
        this.presenter = presenter;

    }



    @Override
    public List<Bean.DataBean.UsersBean> getData() {
            OkHttpClient client = new OkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            //使用JSONObject封装参数
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("license","f901a1659fec561baeca213378f572ba");
                jsonObject.put("type", "1");
                jsonObject.put("updateTime", "2018-04-22 15:15:02");
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
            RequestBody requestBody = RequestBody.create(mediaType,jsonObject.toString());
            Request request = new Request
                    .Builder()
                    .post(requestBody)
                    .url("http://sczpkj.f3322.net:39999/api/mobile/system/users")
//                        .url("http://sczpkj.f3322.net:39999/api/mobile/auth/login")
                    .build();
            try {
                Response response = client.newCall(request).execute();
                String responseData = response.body().string();
                Log.d(TAG, responseData);
                users = parse(responseData);
                presenter.onSuccess(users);
                response.body().close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return users;
        }
/*        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("license","f901a1659fec561baeca213378f572ba");
            jsonObject.put("type", "1");
            jsonObject.put("updateTime", "2018-04-22 15:15:02");
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        NetworkUtil.getInstance().asyncPost("http://192.168.1.2:9999/api/mobile/system/users", jsonObject,
                new NetworkUtil.HttpCallBack() {
                    @Override
                    public void onError(Request request, IOException e) {
                        Log.d(TAG, "onError: ");
                    }

                    @Override
                    public void onSuccess(Request request, String result) {
                        Log.d(TAG, result);
                        parse(result);

                    }
                });
    }*/

    private List<Bean.DataBean.UsersBean> parse(String result) {
        Gson gson = new Gson();
        Bean bean = gson.fromJson(result, Bean.class);
        Bean.DataBean dataBean = bean.getData();
        List<Bean.DataBean.UsersBean> users = dataBean.getUsers();
        Log.d(TAG+"user0", users.get(0).getAccount().toString());
//        data = users.get(0).getAccount();
//        Message msg = new Message();
//        msg.what = 1;
//        handler.sendMessage(msg);
        return users;
    }


}
