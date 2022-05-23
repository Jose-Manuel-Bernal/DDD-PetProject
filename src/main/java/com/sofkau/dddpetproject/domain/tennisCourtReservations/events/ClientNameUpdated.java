package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Name;

public class ClientNameUpdated extends DomainEvent {
    private final Name name;


    public ClientNameUpdated(Name name) {
        super("sofka.tenniscourtreservation.clientnameupdated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
