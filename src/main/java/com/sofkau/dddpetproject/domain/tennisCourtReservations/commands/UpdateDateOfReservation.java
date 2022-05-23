package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.DateOfReservation;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class UpdateDateOfReservation extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final DateOfReservation dateOfReservation;

    public UpdateDateOfReservation(TennisCourtReservationID tennisCourtReservationID, DateOfReservation dateOfReservation) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.dateOfReservation = dateOfReservation;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public DateOfReservation getDateOfReservation() {
        return dateOfReservation;
    }
}
