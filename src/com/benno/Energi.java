package com.benno;

public class Energi {
    private double mass, velocity;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double kineticEnergy(double mass, double velocity){
        return (0.5 * mass * velocity * velocity) / 1000;
    }

    public double usaha(){
        return kineticEnergy(mass,velocity) - kineticEnergy(mass, 0);
    }
}
