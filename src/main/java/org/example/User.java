package org.example;

public class User {
    public String username;
    public String email;
    private String password;


    public User(String username, String password, String email) {
        if(!email.contains("@")){
            System.out.println("Email contains invalid characters");
            throw new IllegalArgumentException("Email contains invalid characters");
        } else if(username.isEmpty()) {
            System.out.println("Username is empty");
            throw new IllegalArgumentException("Username is empty");
        } else if(password.length() < 6) {
            System.out.println("Password must be at least 6 characters");
            throw new IllegalArgumentException("Password must be at least 6 characters");
        } else {
            this.username = username;
            this.password = password;
            this.email = email;
        }
    }
    public String getPassword (){
        return password;
    }

    public void printUserInfo (){
        System.out.println("Username: " + username + " Email: " + email);
    }

}
