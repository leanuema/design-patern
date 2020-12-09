package serviceImpl;

import service.ConectionService;

public class ConectionPostgresSQL implements ConectionService {

    private String host;
    private String port;
    private String user;
    private String password;

    public ConectionPostgresSQL() {
        this.host = "desa";
        this.port = "3496";
        this.user = "root";
        this.password = "root-admin";
    }

    @Override
    public void connect() {
        System.out.println("Se conecto a Postgres server");
    }

    @Override
    public void discconect() {
        System.out.println("Se desconecto de Postgres Server");
    }

    /**
     * Getter and Setter
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
