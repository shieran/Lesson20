package ProdCons;

public class Consumer extends Thread {
    int product = 0;
    Store store;

    public Consumer(Store store){
        this.store = store;
    }

    public void run(){
        try {
            while (product < 5){
                product = product + store.get();
                System.out.println("Потребитель взял " + product);
                sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
