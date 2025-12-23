package java9;


interface Samp{
    private void log(String m){
        System.out.println("Welcome "+m);
    }
    static void user(){
        Samp obj = new Samp(){};
        obj.log("user");
    }
    default void admin(){
        log("admin");
    }
}
public class PrivateMethodInterface implements Samp {

    public static void main(String[] args) {
        Samp obj = new Samp(){};
        obj.admin();
        Samp.user();
    }

}

