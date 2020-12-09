package serviceImpl;

import service.ConnectionService;

public class ConnectionOracle implements ConnectionService {

    private String host;
    private String port;
    private String user;
    private String password;

    public ConnectionOracle() {
        this.host = "integration";
        this.port = "3345";
        this.user = "admin";
        this.password = "123";
    }

    @Override
    public void connect() {
        System.out.println("Se conecto a Oracle server");
    }

    @Override
    public void disconnect() {
        System.out.println("Se desconecto de Oracle Server");
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
