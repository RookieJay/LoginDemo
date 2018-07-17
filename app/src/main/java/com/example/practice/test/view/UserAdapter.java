package com.example.practice.test.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.practice.test.R;
import com.example.practice.test.contract.LoginContract;
import com.example.practice.test.model.Bean;
import com.example.practice.test.utils.ToastUtil;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{

    private List<Bean.DataBean.UsersBean> mUserList;
    private LoginContract.View view;

    public UserAdapter(List<Bean.DataBean.UsersBean> mUserList) {
        this.mUserList = mUserList;
    }

    public UserAdapter(List<Bean.DataBean.UsersBean> mUserList, LoginContract.View view) {
        this.mUserList = mUserList;
        this.view = view;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_username;

        public ViewHolder(View view) {
            super(view);
            tv_username = view.findViewById(R.id.tv_user_name);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Bean.DataBean.UsersBean user = mUserList.get(position);
        holder.tv_username.setText(user.getUserName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showToast(v.getContext(), "username:"+ user.getUserName());
                view.setUserAccount(user.getAccount());
            }
        });
    }


    @Override
    public int getItemCount() {
            return mUserList.size();
    }
}


