package Singleton_DP;

public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public synchronized static Singleton getInstance(){

        if (instance==null){
            instance=new Singleton();
        }

        return instance;

    }
}
