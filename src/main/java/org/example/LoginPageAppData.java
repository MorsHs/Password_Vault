package org.example;

public class LoginPageAppData {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public boolean verifyUsername(){
        switch(getUsername()){
            case "usernametest":
                return true;
            default:
                return false;
        }
    }
    public boolean verifyPassword(){
        switch (getPassword()){
            case "passwordtest":
                return true;
            default:
                return false;
        }
    }
}
