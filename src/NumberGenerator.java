public class NumberGenerator implements Runnable {
    private Thread number;

    public NumberGenerator(){
        number = new Thread(this,"NumberGenerator");
        System.out.println("my Thread created " + number);
        number.start();
    }

    public Thread getNumber() {
        return number;
    }

    public void setNumber(Thread number) {
        this.number = number;
    }

    public int hashCore() {
        return super.hashCode();
    }
    
    public void run(){
        try {
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i);
                Thread.sleep(500);
                System.out.println("HashCode is: " + hashCore());
            }
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }
        System.out.println("Done!");
    }
}
