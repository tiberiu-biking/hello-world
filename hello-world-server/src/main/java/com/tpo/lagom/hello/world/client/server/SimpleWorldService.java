package com.tpo.lagom.hello.world.client.server;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.tpo.lagom.hello.world.api.HelloWorldService;

import static java.util.concurrent.CompletableFuture.completedFuture;

public class SimpleWorldService implements HelloWorldService {

  @Override
  public ServiceCall<NotUsed, String> sayHello() {
    return notUsed -> completedFuture("Hello Lagom!");
  }
}
