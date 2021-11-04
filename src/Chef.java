public class Chef implements Runnable {
    private Slide slide;
    private int burgersMade = 0;

    public Chef(Slide slide) {
        this.slide = slide;
    }

    @Override
    public void run() {
        int repeat = 0;
        while (repeat < 125) {
            slide.makeBurger();
            burgersMade++;
            try {
                Thread.sleep((int) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("how did this happen?");
            }
            repeat++;
        }
        System.out.println("Total burgers made: " + burgersMade);
    }
}
