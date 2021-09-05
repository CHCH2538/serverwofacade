package serverwofacade;

public class FacadeImplement {
    private static FacadeImplement facadeObj = null;
    private FacadeImplement() {}
    public static FacadeImplement getFacadeObj() {
        if (facadeObj == null) {
            facadeObj = new FacadeImplement();
        } 
        return facadeObj;
    }

    ScheduleServer scheduleserver = new ScheduleServer();

    public void initiateServer() {
        scheduleserver.startBooting();
        scheduleserver.readSystemConfigFile();
        scheduleserver.init();
        scheduleserver.initializeContext();
        scheduleserver.initializeListeners();
        scheduleserver.createSystemObjects();
    }

    public void killServer() {
        scheduleserver.releaseProcesses();
        scheduleserver.destory();
        scheduleserver.destroySystemObjects();
        scheduleserver.destoryListeners();
        scheduleserver.destoryContext();
        scheduleserver.shutdown();
    }
    
}
