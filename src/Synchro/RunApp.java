//package Synchro;
//
//public class RunApp {
//    public static void main(String[] args) {
//        System.out.println("main thread started");
//        CommonResource res = new CommonResource();
//        for (int i = 1; i < 6 ; i++) {
//            Thread t = new Thread(new ThreadCount(res));
//            t.setName("Thread" + i);
//            t.start();
//        }
//    }
//}
