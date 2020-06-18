package dp.singleton;

public class TestSingleton {
    public static void main(String[] args) {

//        Moon chinaMoon=new Moon();
//        Moon usaMoon=new Moon();
//        System.out.println(chinaMoon==usaMoon);
        Moon chinaMoon = Moon.getInstance();
        Moon usaMoon = Moon.getInstance();
        System.out.println(chinaMoon == usaMoon);
        //  Runtime runtime=new Runtime();
        //  Moon ukMoon=new Moon();

    }
}
