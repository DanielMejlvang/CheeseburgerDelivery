public class Delivery implements Runnable {
    private Slide slide;
    private int burgersDelivered = 0;

    public Delivery(Slide slide) {
        this.slide = slide;
    }

    @Override
    public void run() {
        int repeat = 0;
        while (repeat < 120) {
            slide.deliverBurger();
            burgersDelivered++;
            try {
                Thread.sleep((int) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("how did this happen?");
            }
            repeat++;
        }
        System.out.println("Total burgers delivered: " + burgersDelivered);
    }
}
