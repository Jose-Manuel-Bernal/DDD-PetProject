package com.sofkau.dddpetproject.domain.tennisCourtReservations.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Objects;

public class HourOfReservation implements ValueObject<LocalTime> {

    public LocalTime hour;

    public HourOfReservation(Integer hours, Integer minutes, Integer seconds){
        Objects.requireNonNull(hours);
        Objects.requireNonNull(minutes);
        Objects.requireNonNull(seconds);
        try{
            hour = LocalTime.of(hours,minutes,seconds);
            if (hour.isAfter(LocalTime.of(18,0,0))) {
                throw new IllegalArgumentException("No valid hour for schedule");
            }
        }catch (DateTimeException e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public LocalTime value() {
        return hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourOfReservation that = (HourOfReservation) o;
        return Objects.equals(hour, that.hour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour);
    }
}
