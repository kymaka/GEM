package ru.nucodelabs.data.ves;

import java.io.Serializable;

record ExperimentalDataImpl(
        double ab2,
        double mn2,
        double resistanceApparent,
        double errorResistanceApparent,
        double amperage,
        double voltage
) implements ExperimentalData, Serializable {
    @Override
    public double getAb2() {
        return ab2();
    }

    @Override
    public double getMn2() {
        return mn2();
    }

    @Override
    public double getResistanceApparent() {
        return resistanceApparent();
    }

    @Override
    public double getErrorResistanceApparent() {
        return errorResistanceApparent();
    }

    @Override
    public double getAmperage() {
        return amperage();
    }

    @Override
    public double getVoltage() {
        return voltage();
    }
}
