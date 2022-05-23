package com.sofkau.dddpetproject.domain.tennisCourtReservations.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ilumination implements ValueObject<Boolean> {
    private final Boolean ilumination;

    public Ilumination(Boolean ilumination) {
        this.ilumination = Objects.requireNonNull(ilumination);
    }

    @Override
    public Boolean value() {
        return ilumination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ilumination that = (Ilumination) o;
        return Objects.equals(ilumination, that.ilumination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ilumination);
    }
}
