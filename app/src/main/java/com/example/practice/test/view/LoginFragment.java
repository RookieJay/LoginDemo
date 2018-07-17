package com.example.practice.test.view;


import android.annotation.SuppressLint;
import android.content.Context;
import android.opengl.ETC1;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practice.test.R;
import com.example.practice.test.contract.LoginContract;
import com.example.practice.test.model.Bean;
import com.example.practice.test.model.LoginResBean;
import com.example.practice.test.presenter.LoginPresenter;
import com.example.practice.test.utils.ToastUtil;

import java.util.List;

public class LoginFragment extends Fragment implements LoginContract.View {

    private static final String TAG = LoginFragment.class.getSimpleName();

    private EditText et_account;
    private EditText et_password;
    private Button bt_login;
    TextView tv_username;
    private ImageView iv_account_option;
    private LoginPresenter loginPresenter;

    PopupWindow popupWindow;

    private List<Bean.DataBean.UsersBean> usersBeanList;


    @SuppressLint("HandlerLeak")
    public Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            usersBeanList = (List<Bean.DataBean.UsersBean>)msg.obj;
//            Log.d(TAG+"333", usersBeanList.get(2).getUserName());
            getUserTest();

        }
    };

    private void getUserTest() {
        Log.d(TAG+"getUserTest", usersBeanList.get(3).getUserName());

    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "onAttach: ");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        et_account = view.findViewById(R.id.et_user_account);
        et_password = view.findViewById(R.id.et_user_password);
        bt_login = view.findViewById(R.id.bt_login);
        iv_account_option = view.findViewById(R.id.iv_account_option);
        loginPresenter = new LoginPresenter(this);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        iv_account_option.setOnClickListener(new View.OnClickListener() {
            boolean flag;
            @Override
            public void onClick(View v) {
                loginPresenter.getData();
                popupWindow = initPopupWindow();
                if (flag) {
                    popupWindow.showAsDropDown(et_account);
                    iv_account_option.setImageResource(R.drawable.up);
                } else {
                    iv_account_option.setImageResource(R.drawable.down);
                }
                flag = !flag;
            }
        });
        return view;
    }

    private PopupWindow initPopupWindow() {
        View rootView = LayoutInflater.from(getActivity()).inflate(R.layout.popup_list,null);
        View contentView = LayoutInflater.from(getActivity()).inflate(R.layout.list_item, null);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        tv_username = contentView.findViewById(R.id.tv_user_name);
        tv_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showToast(getContext(),"11111");
            }
        });
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showToast(getContext(),"23242");
            }
        });
        ((ViewGroup)rootView).removeView(recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        UserAdapter adapter = new UserAdapter(usersBeanList, this);
        recyclerView.setAdapter(adapter);
        popupWindow = new PopupWindow(recyclerView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setFocusable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {

                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
            }
        });
        return popupWindow;
    }


    public String getUserAccount(String userAccount){
        Log.d(TAG, userAccount);
        return userAccount;
    }

    @Override
    public void setUserAccount(String userAccount){
        et_account.setText(userAccount);
        popupWindow.dismiss();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onActivityCreated: ");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG, "onDestroyView: ");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG, "onDetach: ");
        super.onDetach();
    }

    public void login() {
        loginPresenter.validate();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }



    @Override
    public String getAccount() {
        return et_account.getText().toString();
    }

    @Override
    public String getPassword() {
        Log.d(TAG, "getPassword: "+et_password.getText().toString());
        return et_password.getText().toString();
    }

    @Override
    public LoginContract.MainView goToMainFragment(LoginResBean bean) {
        MainFragment  f = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("key", bean);
        f.setArguments(bundle);
        getActivity().getSupportFragmentManager()
                     .beginTransaction()
                     .replace(R.id.mainFrame,f)
                     .addToBackStack(null)
                     .commit();
        return f;
    }

    @Override
    public void showResult(List<Bean.DataBean.UsersBean> usersBeanList) {
        Message msg = new Message();
        msg.obj = usersBeanList;
        handler.sendMessage(msg);
    }

}
