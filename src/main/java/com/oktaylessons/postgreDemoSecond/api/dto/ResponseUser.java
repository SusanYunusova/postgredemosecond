package com.oktaylessons.postgreDemoSecond.api.dto;

import com.oktaylessons.postgreDemoSecond.api.model.User;

public class ResponseUser {
    private int serverCode;
    private String serverMessage;
    private User user;

    public ResponseUser() {
    }

    @Override
    public String toString() {
        return "ResponseUser{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", user=" + user +
                '}';
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

    public ResponseUser(int serverCode, String serverMessage, User user) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.user = user;
    }
}
