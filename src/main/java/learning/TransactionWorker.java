package learning;

public class TransactionWorker implements Runnable{
    protected BankAccount account;
    protected char txType;

    protected int amount;

    public TransactionWorker(BankAccount account, char txType, int amount) {
        this.account = account;
        this.txType = txType;
        this.amount = amount;
    }


    public void run() {
        if(txType=='w'){
            account.withdrawal(amount);
        }else{
            account.deposit(amount);
        }
    }
}
