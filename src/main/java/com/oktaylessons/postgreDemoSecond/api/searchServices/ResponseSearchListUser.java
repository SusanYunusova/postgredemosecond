package com.oktaylessons.postgreDemoSecond.api.searchServices;

import com.oktaylessons.postgreDemoSecond.entity.User;

import java.util.List;

public class ResponseSearchListUser {
    private int serverCode;
    private String serverMessage;
    private List<User> userList;

    public ResponseSearchListUser() {
    }

    @Override
    public String toString() {
        return "ResponseSearchListUser{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", userList=" + userList +
                '}';
    }

    public int getServerCode() {
        return serverCode;
    }

    public void setServerCode(int serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerMessage(String user_not_found) {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public ResponseSearchListUser(int serverCode, String serverMessage, List<User> userList) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.userList = userList;
    }
}
