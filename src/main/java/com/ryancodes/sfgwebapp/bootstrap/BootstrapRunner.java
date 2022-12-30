package com.ryancodes.sfgwebapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class BootstrapRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bootstrapping data");
    };
}