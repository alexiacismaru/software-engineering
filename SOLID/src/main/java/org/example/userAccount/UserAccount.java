package org.example.userAccount;

public class UserAccount {
    private String name;
    private String email;
    private String phone;

    public UserAccount(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private SecurityService securitySvc = new SecurityService();

    public void changePhone(String phone) {
        if (securitySvc.checkAccess(this)) {
            this.phone = phone;
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
