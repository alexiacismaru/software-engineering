package org.example.userAccount;

/*modeled using the Open/Closed mechanism from SOLID*/
public class Main {
    public static void main(String[] args) {
        UserAccount account = new UserAccount("John Doe","john.doe@student.kdg.be","+32.741.526.368");
        System.out.println("Account before "+ account);
        account.changePhone("+1.539.446.785");
        System.out.println("Account after "+account);
    }
}
