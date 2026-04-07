package PraticalProject01;


public class SystemSettings {
    String aplicationName;
    String server;
    Integer MAX_RETRY;

    
    private static SystemSettings instance;


    private SystemSettings (String aplicationName, String server, Integer mAX_RETRY) {
        this.aplicationName = aplicationName;
        this.server = server;
        MAX_RETRY = mAX_RETRY;
    }


    public static SystemSettings getInstance (String aplicationName, String server, Integer mAX_RETRY) {
        if (instance == null)
        instance = new SystemSettings (aplicationName, server, mAX_RETRY);
        return instance;
    }

}
