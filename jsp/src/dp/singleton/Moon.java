package dp.singleton;

public class Moon {
    public static Moon instance = new Moon();

    private Moon() {
    }


    public static Moon getInstance() {
        return instance;
    }
}
