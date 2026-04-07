package PraticalProject01;


public class SystemSettings {
    private SystemSettings(){}
    private static SystemSettings instance;

    public static SystemSettings getInstance () {
        if (instance == null) // 1a vez que chama-se getInstance
        instance = new SystemSettings ();
        return instance;
    }
}
