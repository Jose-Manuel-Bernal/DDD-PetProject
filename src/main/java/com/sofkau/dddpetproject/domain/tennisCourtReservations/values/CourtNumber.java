package com.sofkau.dddpetproject.domain.tennisCourtReservations.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CourtNumber implements ValueObject<CourtNumberEnum> {
    private final CourtNumberEnum courtNumber;

    public CourtNumber(CourtNumberEnum courtNumber) {
        this.courtNumber = Objects.requireNonNull(courtNumber);
    }

    @Override
    public CourtNumberEnum value() {
        return courtNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourtNumber that = (CourtNumber) o;
        return courtNumber == that.courtNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courtNumber);
    }
}
