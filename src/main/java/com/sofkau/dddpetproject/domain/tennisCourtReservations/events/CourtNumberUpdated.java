package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.CourtNumber;

public class CourtNumberUpdated extends DomainEvent {
    private final CourtNumber courtNumber;

    public CourtNumberUpdated(CourtNumber courtNumber) {
        super("sofka.tenniscourtreservation.courtnumberupdated");
        this.courtNumber = courtNumber;
    }

    public CourtNumber getCourtNumber() {
        return courtNumber;
    }
}
