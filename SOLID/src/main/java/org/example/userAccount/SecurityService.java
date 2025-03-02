package org.example.userAccount;

public class SecurityService {
    public boolean checkAccess(UserAccount user) {
        return user.getEmail().endsWith("kdg.be");
    }
}
