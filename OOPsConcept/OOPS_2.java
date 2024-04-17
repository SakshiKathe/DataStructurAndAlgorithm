//Access Modifiers/Specifiers

package OOPsConcept;

public class OOPS_2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "SakshiKathe";
        System.out.println(myAcc.username);
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
