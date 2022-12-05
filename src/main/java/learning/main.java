package learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class main {
    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
//        ArrayList<myClass> list = new ArrayList<>();
//        myClass v1 = new myClass("v1","abc");
//        myClass v2 = new myClass("v2","xyz");
//        myClass v3 = new myClass("v3","abc");
//
//        list.add(v1);
//        list.add(v2);
//        list.add(v3);
//
//        list.removeIf(m -> m.getValue().equals("abc"));
//
//        for(myClass o:list){
//            System.out.println(o.label);
//        }

//        for(String ans: args){
//            System.out.println(ans);


//        Map<String, String> env = System.getenv();
//
//        // Java 8
//        env.forEach((k, v) -> System.out.println(k + ":" + v));

//        LogManager lm = LogManager.getLogManager();
//        Logger logger = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
//        logger.log(Level.INFO,"This is my logger message");

//        logger.log(Level.INFO, "Final message");

        ExecutorService es = Executors.newFixedThreadPool(5);

        BankAccount bankAccount = new BankAccount("1234",500);
        bankAccount.deposit(250);

        bankAccount.saveAccount(bankAccount,"account.dat");

        BankAccount acct = bankAccount.loadAccount("account.dat");
        System.out.println(acct.getBalance()+" : "+acct.getId());
       // bankAccount.doWork(bankAccount);
//        for(int i = 0; i<5 ; i++) {
//            Worker worker = new Worker(bankAccount);
//            es.submit(worker);
//        }

        //System.out.println(bankAccount.getBalance());
        //TransactionWorker[] transactionWorkers = new PromoTxWorker(bankAccount,'d',500);

        es.shutdown();

        }




}
