//public class MyThreadImp extends Thread {
//
//    boolean isActive;
//
//    void disabled(){
//        isActive = false;
//    }
//
//    public MyThreadImp(String name){
//        super(name);
//        isActive = true;
//    }
//
//    @Override
//    public void run() {
//
//        System.out.printf("Thread %s started \n", Thread.currentThread().getName());
//        int counter = 1;
//        while (isActive){
//            System.out.println("Loop" + counter++);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.printf("Thread %s finished \n", Thread.currentThread().getName());
//    }
//
//}
