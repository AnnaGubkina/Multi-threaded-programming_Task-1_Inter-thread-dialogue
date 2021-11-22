public class MyThread extends Thread{

    MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println(getName() + " Всем привет!");
            }
        } catch (InterruptedException err) {
            System.out.println(getName() + " Прерван во время сна");
        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
