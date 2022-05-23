package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Ilumination;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class UpdateIlumination extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final Ilumination ilumination;

    public UpdateIlumination(TennisCourtReservationID tennisCourtReservationID, Ilumination ilumination) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.ilumination = ilumination;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public Ilumination getIlumination() {
        return ilumination;
    }
}
