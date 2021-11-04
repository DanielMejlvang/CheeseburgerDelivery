public class CheeseMain {
    public static void main(String[] args) {
        Slide slide = new Slide();
        Chef chef = new Chef(slide);
        Delivery delivery = new Delivery(slide);

        Thread t1 = new Thread(chef);
        Thread t2 = new Thread(delivery);
        t1.start();
        t2.start();
    }
}
