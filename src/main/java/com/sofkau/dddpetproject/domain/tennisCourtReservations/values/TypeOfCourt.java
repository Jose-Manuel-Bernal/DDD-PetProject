package com.sofkau.dddpetproject.domain.tennisCourtReservations.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TypeOfCourt implements ValueObject<TypesOfCourtEnum> {
    private final TypesOfCourtEnum typesOfCourt;

    public TypeOfCourt(TypesOfCourtEnum typesOfCourt) {
        this.typesOfCourt = Objects.requireNonNull(typesOfCourt);
    }

    @Override
    public TypesOfCourtEnum value() {
        return typesOfCourt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfCourt that = (TypeOfCourt) o;
        return typesOfCourt == that.typesOfCourt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typesOfCourt);
    }
}
