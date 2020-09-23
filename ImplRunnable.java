public class ImplRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"   实现Runnable接口");
    }
}
