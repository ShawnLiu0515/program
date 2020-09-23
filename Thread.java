public class Thread23 {
    public static void main(String[] args) {
        ImplRunnable runnable = new ImplRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName()+"       主线程");
    }
}
