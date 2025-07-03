package com.Main;

public class Account {
     private String username;
     private String password;
     private String fullName;
     private String address;

public Account() {
     System.out.println("Account instantiation");

}

public String getUsername() {
    return username;
}

public String getPassword() {
    return password;
}

public String getFullName() {
    return fullName;
}

public String getAddress() {
    return address;
}

public void setUsername(String username) {
    this.username = username;
}

public void setPassword(String password) {
    this.password = password;
}

public void setFullName(String fullName) {
    this.fullName = fullName;
}

public void setAddress(String address) {
    this.address = address;
}

@Override
public String toString() {
    return "Account [username=" + username + ", password=" + password + ", fullName=" + fullName + ", address="
            + address + "]";
}
     

}
