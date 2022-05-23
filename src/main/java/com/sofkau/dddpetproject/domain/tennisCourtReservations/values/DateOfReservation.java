package com.sofkau.dddpetproject.domain.tennisCourtReservations.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Objects;

public class DateOfReservation implements ValueObject<LocalDate> {
    private final LocalDate date;

    public DateOfReservation(Integer year, Integer month, Integer day) {
        Objects.requireNonNull(year);
        Objects.requireNonNull(month);
        Objects.requireNonNull(day);
        try {
            date = LocalDate.of(year, month, day);
            if(date.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("No valid the date of birth");
            }
        } catch (DateTimeException e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public LocalDate value() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateOfReservation that = (DateOfReservation) o;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
