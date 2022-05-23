package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.DateOfReservation;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.HourOfReservation;

public class TennisCourtReservationCreated extends DomainEvent {
    private final DateOfReservation dateOfReservation;
    private final HourOfReservation hourOfReservation;

    public TennisCourtReservationCreated(DateOfReservation dateOfReservation, HourOfReservation hourOfReservation) {
        super("sofka.tenniscourtreservation.tenniscourtreservationcreated");
        this.dateOfReservation = dateOfReservation;
        this.hourOfReservation = hourOfReservation;
    }

    public DateOfReservation getDateOfReservation() {
        return dateOfReservation;
    }

    public HourOfReservation getHourOfReservation() {
        return hourOfReservation;
    }
}
