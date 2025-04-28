package com.myself.ioc_01;

public class ClientService {
  private ClientService() {}
  private static ClientService clientService = new ClientService();

  public static ClientService createInstance() {
    return clientService;
  }
}