package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.HourOfReservation;

public class HourOfReservationUpdated extends DomainEvent {
    private final HourOfReservation hourOfReservation;

    public HourOfReservationUpdated(HourOfReservation hourOfReservation) {
        super("sofka.tenniscourtreservation.hourofreservationupdated");
        this.hourOfReservation = hourOfReservation;
    }

    public HourOfReservation getHourOfReservation() {
        return hourOfReservation;
    }
}
