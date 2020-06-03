package com.tpo.lagom.hello.world.client.server;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;
import com.tpo.lagom.hello.world.api.HelloWorldService;

public class HelloWorldModule extends AbstractModule implements ServiceGuiceSupport {

  @Override
  protected void configure() {
    bindService(HelloWorldService.class, SimpleWorldService.class);
  }
}
