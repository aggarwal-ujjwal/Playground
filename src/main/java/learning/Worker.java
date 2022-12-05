package learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker implements Runnable{
    private BankAccount account;

    public Worker(BankAccount account){
        this.account = account;
    }
    public void run(){
        for(int i = 0 ; i<10 ; i++) {
            int startBalance = account.getBalance();
            long threadID = Thread.currentThread().getId();
            System.out.print(threadID+" "+startBalance+" ");
            account.deposit(10);
            int endBalance = account.getBalance();
            System.out.println(threadID+" : "+endBalance);
        }
    }


}
