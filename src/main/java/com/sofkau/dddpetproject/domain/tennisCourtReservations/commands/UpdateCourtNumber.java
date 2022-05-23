package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.CourtNumber;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;

public class UpdateCourtNumber extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final CourtNumber courtNumber;

    public UpdateCourtNumber(TennisCourtReservationID tennisCourtReservationID, CourtNumber courtNumber) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.courtNumber = courtNumber;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public CourtNumber getCourtNumber() {
        return courtNumber;
    }
}
