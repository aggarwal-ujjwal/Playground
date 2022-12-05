package learning;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BankAccount implements Serializable {
    private int balance;
    private final String id;

    public BankAccount(String id, int startbalance){
        balance=startbalance;
        this.id = id;
    }

    public synchronized int getBalance(){
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance+=amount;
    }

    public synchronized void withdrawal(int amount) {
        balance-=amount;
    }

    public String getId(){
        return id;
    }

    public void saveAccount(BankAccount bankAccount, String fileName) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            objectOutputStream.writeObject(bankAccount);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public BankAccount loadAccount(String fileName){
        BankAccount ba = null;
        try(ObjectInputStream objectInputStream =
                new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
            ba = (BankAccount) objectInputStream.readObject();
        } catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException: "+e);
        } catch (Exception e){
            System.out.println("Exception: "+e);
        }
        return ba;
    }
    }
//    void doWork(Object obj){
//        Class<?> c = obj.getClass();
//        showName(c);
//    }
//    void showName(Class<?> theClass){
//        System.out.println(theClass.getSimpleName());
//    }


