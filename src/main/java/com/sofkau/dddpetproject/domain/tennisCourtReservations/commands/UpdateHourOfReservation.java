package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.HourOfReservation;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class UpdateHourOfReservation extends Command {
    private TennisCourtReservationID tennisCourtReservationID;
    private HourOfReservation hourOfReservation;

    public UpdateHourOfReservation(TennisCourtReservationID tennisCourtReservationID, HourOfReservation hourOfReservation) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.hourOfReservation = hourOfReservation;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public HourOfReservation getHourOfReservation() {
        return hourOfReservation;
    }
}
