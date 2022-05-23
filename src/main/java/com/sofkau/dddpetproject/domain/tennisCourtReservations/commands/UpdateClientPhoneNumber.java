package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.PhoneNumber;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class UpdateClientPhoneNumber extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final PhoneNumber phoneNumber;

    public UpdateClientPhoneNumber(TennisCourtReservationID tennisCourtReservationID, PhoneNumber phoneNumber) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.phoneNumber = phoneNumber;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
