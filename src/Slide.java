public class Slide {
    private int burgerAmount = 0;

    public synchronized void makeBurger() {
        while (burgerAmount > 7) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Chef's making a burger...");
        burgerAmount++;
        System.out.println("Current amount of burgers in slide: " + burgerAmount);
        notifyAll();
    }

    public synchronized void deliverBurger() {
        while (burgerAmount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Delivery's delivering a burger...");
        burgerAmount--;
        System.out.println("Current amount of burgers in slide: " + burgerAmount);
        notifyAll();
    }

    public int getBurgerAmount() {
        return burgerAmount;
    }
}
