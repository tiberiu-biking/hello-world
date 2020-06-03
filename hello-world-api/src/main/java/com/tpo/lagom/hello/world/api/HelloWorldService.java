package com.tpo.lagom.hello.world.api;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

public interface HelloWorldService extends Service {
  ServiceCall<NotUsed, String> sayHello();

  @Override
  default Descriptor descriptor() {
    return Service.named("helloWorldService")
        .withCalls(
            Service.namedCall("hello-world", this::sayHello)
        )
        .withAutoAcl(true);
  }
}
