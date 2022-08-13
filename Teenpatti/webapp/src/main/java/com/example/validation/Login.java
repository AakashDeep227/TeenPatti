package com.example.validation;

import javax.validation.constraints.NotNull;

public class Login {
    @NotNull
    private String userName;
    @NotNull
    private String passWord;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    @Override
    public String toString() {
        return "Login [passWord=" + passWord + ", userName=" + userName + "]";
    }
    
}
