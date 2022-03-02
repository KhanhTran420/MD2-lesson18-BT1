public class Main {
    public static void main(String[] args) {
        NumberGenerator G1 = new NumberGenerator();
        NumberGenerator G2 = new NumberGenerator();

        Thread n1 = new Thread(G1);
        Thread n2 = new Thread(G2);

        n1.setPriority(Thread.MAX_PRIORITY);

        n1.start();
        n2.start();

    }
}
