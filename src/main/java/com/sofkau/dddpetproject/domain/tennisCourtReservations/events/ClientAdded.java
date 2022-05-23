package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.ClientID;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Name;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.PhoneNumber;

public class ClientAdded extends DomainEvent {

    private final ClientID clientID;
    private final Name name;
    private final PhoneNumber phoneNumber;

    public ClientAdded(ClientID clientID, Name name, PhoneNumber phoneNumber) {
        super("sofka.tenniscourtreservation.clientadded");
        this.clientID= clientID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Name getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
