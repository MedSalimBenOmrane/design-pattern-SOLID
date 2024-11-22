package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager {
    private final CarDatabase carDatabase;
    private final CarFormatter carFormatter;
    private final CarEvaluator carEvaluator;

    public CarManager() {
        this.carDatabase = new CarDatabase();
        this.carFormatter = new CarFormatter();
        this.carEvaluator = new CarEvaluator();
    }

    public Car findCarById(String carId) {
        return carDatabase.getFromDb(carId);
    }

    public String getAllCarNames() {
        List<Car> cars = carDatabase.getCars();
        return carFormatter.getCarsNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carDatabase.getCars();
        return carEvaluator.getBestCar(cars);
    }
}
