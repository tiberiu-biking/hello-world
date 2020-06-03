package com.tpo.lagom.hello.world.client;

import com.lightbend.lagom.javadsl.client.integration.LagomClientFactory;
import com.tpo.lagom.hello.world.api.HelloWorldService;

import java.net.URI;

public class Boot {

  public static void main(String[] args) {
    try (LagomClientFactory clientFactory = LagomClientFactory.create("client", LagomClientFactory.class.getClassLoader())) {

      HelloWorldService helloWorldService = clientFactory.createClient(HelloWorldService.class, new URI("http://localhost:9000"));

      String callTheService = helloWorldService.sayHello().invoke().toCompletableFuture().get();

      System.out.println(callTheService);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
