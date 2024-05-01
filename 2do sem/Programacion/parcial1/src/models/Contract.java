package models;

public interface Contract {
    double calculateBMI(double weight, double height);
    boolean isOverweight(double bmi);
    double calculateHeartRate();
}
