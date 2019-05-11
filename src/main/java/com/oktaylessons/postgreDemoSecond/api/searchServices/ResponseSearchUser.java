package com.oktaylessons.postgreDemoSecond.api.searchServices;

import com.oktaylessons.postgreDemoSecond.entity.User;

public class ResponseSearchUser {
    private int serverCode;
    private String serverMessage;
    private User user;

    @Override
    public String toString() {
        return "ResponseSearchUser{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", user=" + user +
                '}';
    }

    public ResponseSearchUser() {
    }

    public int getServerCode() {
        return serverCode;
    }

    public void setServerCode(int serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ResponseSearchUser(int serverCode, String serverMessage, User user) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.user = user;
    }
}
