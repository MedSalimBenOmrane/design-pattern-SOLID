package com.directi.training.srp.exercise;

public class Car {
    private final String _id;
    private final String _model;
    private final String _brand;

    public Car(String id, String model, String brand) {
        this._id = id;
        this._model = model;
        this._brand = brand;
    }

    public String getId() {
        return _id;
    }

    public String getModel() {
        return _model;
    }

    public String getBrand() {
        return _brand;
    }
}
