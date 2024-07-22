package NewConfig;

public class AppConfig {
    private static AppConfig instance;
    private String serverUrl;
    private int Puerto;
    private String DataBaseName;


    private AppConfig(){

    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public static void setInstance(AppConfig instance) {
        AppConfig.instance = instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPuerto() {
        return Puerto;
    }

    public void setPuerto(int puerto) {
        Puerto = puerto;
    }

    public String getDataBaseName() {
        return DataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        DataBaseName = dataBaseName;
    }
}
