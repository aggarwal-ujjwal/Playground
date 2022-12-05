package learning;

public class PromoTxWorker extends TransactionWorker{


    public PromoTxWorker(BankAccount account, char txType, int amount) {
        super(account, txType, amount);
    }

    @Override
    public void run() {
        if(txType=='w'){
            account.withdrawal(amount);
        } else if (txType=='d') {
            synchronized (account){
                account.deposit(amount);
                int balance = account.getBalance();
                if (balance > 500) {
                    balance = (int) ((balance - 500) * 0.1);
                    account.deposit(balance);
                }
            }

        }
    }
}
