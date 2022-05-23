package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.DateOfReservation;

public class DateOfReservationUpdated extends DomainEvent {
    private final DateOfReservation dateOfReservation;

    public DateOfReservationUpdated(DateOfReservation dateOfReservation) {
        super("sofka.tenniscourtreservation.dateofreservationupdated");
        this.dateOfReservation = dateOfReservation;
    }

    public DateOfReservation getDateOfReservation() {
        return dateOfReservation;
    }
}
