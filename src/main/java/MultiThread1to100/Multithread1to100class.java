package MultiThread1to100;
public class Multithread1to100class implements Runnable{
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;
    @Override
    public void run() {
        System.out.println(number);
        for(int i=0 ; i<10 ; i++)
            System.out.println(i);
            
    }
}
