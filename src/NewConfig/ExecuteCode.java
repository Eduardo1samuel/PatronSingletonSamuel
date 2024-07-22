package NewConfig;

public class ExecuteCode {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        config.setPuerto(8080);
        config.setDataBaseName("New Data base");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto del servidor:" + config.getPuerto());
        System.out.println("Base de datos:" + config.getDataBaseName());
        System.out.println("Instancias iguales: " + (config == config2));

    }
}
