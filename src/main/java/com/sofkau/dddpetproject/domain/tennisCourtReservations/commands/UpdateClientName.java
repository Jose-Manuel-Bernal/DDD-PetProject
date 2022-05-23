package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Name;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class UpdateClientName extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final Name name;

    public UpdateClientName(TennisCourtReservationID tennisCourtReservationID, Name name) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.name = name;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public Name getName() {
        return name;
    }
}
