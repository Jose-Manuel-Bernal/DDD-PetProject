package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.ClientID;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Name;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.PhoneNumber;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class AddClient extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final ClientID clientID;
    private final Name name;
    private final PhoneNumber phoneNumber;

    public AddClient(TennisCourtReservationID tennisCourtReservationID, ClientID clientID, Name name, PhoneNumber phoneNumber) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.clientID = clientID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
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
