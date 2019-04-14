package com.javarush.task.task33.task3305;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "className")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Motorbike.class, name = "com.javarush.task.task33.task3305.Motorbike"),
    @JsonSubTypes.Type(value = RacingBike.class, name = "com.javarush.task.task33.task3305.RacingBike"),
    @JsonSubTypes.Type(value = Car.class, name = "com.javarush.task.task33.task3305.Car")
})
public abstract class Vehicle {
    protected String name;
    protected String owner;
    protected int age;
}