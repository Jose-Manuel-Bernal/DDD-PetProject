package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TypeOfCourt;

public class TypeOfCourtUpdated extends DomainEvent {
    private final TypeOfCourt typeOfCourt;

    public TypeOfCourtUpdated(TypeOfCourt typeOfCourt) {
        super("sofka.tenniscourtreservation.typeofcourtupdated");
        this.typeOfCourt = typeOfCourt;
    }

    public TypeOfCourt getTypeOfCourt() {
        return typeOfCourt;
    }
}
