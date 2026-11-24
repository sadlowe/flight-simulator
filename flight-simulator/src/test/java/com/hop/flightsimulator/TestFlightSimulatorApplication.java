package com.hop.flightsimulator;

import org.springframework.boot.SpringApplication;

public class TestFlightSimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.from(FlightSimulatorApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
