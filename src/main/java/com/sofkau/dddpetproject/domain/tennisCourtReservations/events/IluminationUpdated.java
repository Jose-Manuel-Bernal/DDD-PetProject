package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Ilumination;

public class IluminationUpdated extends DomainEvent {
    private final Ilumination ilumination;

    public IluminationUpdated(Ilumination ilumination) {
        super("sofka.tenniscourtreservation.iluminationcreated");
        this.ilumination = ilumination;
    }

    public Ilumination getIlumination() {
        return ilumination;
    }
}
