package service;

public interface AbstractFactory {

    ConnectionService getDataBase(String engine);
    ConnectionRestService getRest(String url);
}
