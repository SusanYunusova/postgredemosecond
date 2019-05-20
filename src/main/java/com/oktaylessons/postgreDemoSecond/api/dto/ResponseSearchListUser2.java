package com.oktaylessons.postgreDemoSecond.api.dto;

import com.oktaylessons.postgreDemoSecond.api.model.User;

import java.util.List;

public class ResponseSearchListUser2  {
    private int serverCode;
    private String serverMessage;
    private List<User> userList;
    private String status;


    @Override
    public String toString() {
        return "ResponseSearchListUser2{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", userList=" + userList +
                ", status='" + status + '\'' +
                '}';
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResponseSearchListUser2() {
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

    public ResponseSearchListUser2(int serverCode, String serverMessage, List<User> userList) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.userList = userList;
    }
}
