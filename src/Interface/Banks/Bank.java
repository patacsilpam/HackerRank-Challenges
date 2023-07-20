package Interface.Banks;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List laccounts;

    public Bank(){
        laccounts = new ArrayList<>();
    }
    public void addAccount(Accounts account){
        laccounts.add(account);
    }

    public void removeAccount(Accounts account){
        laccounts.remove(account);
    }

    public void printAccount(){

    }
}
