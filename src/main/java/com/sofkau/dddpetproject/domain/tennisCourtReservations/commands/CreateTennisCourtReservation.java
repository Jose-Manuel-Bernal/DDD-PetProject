package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.DateOfReservation;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.HourOfReservation;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class CreateTennisCourtReservation extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final DateOfReservation dateOfReservation;
    private final HourOfReservation hourOfReservation;

    public CreateTennisCourtReservation(TennisCourtReservationID tennisCourtReservationID, DateOfReservation dateOfReservation, HourOfReservation hourOfReservation) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.dateOfReservation = dateOfReservation;
        this.hourOfReservation = hourOfReservation;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public DateOfReservation getDateOfReservation() {
        return dateOfReservation;
    }

    public HourOfReservation getHourOfReservation() {
        return hourOfReservation;
    }
}
