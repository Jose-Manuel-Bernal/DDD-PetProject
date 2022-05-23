package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TennisCourtReservationID;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TypeOfCourt;

public class UpdateTypeOfCourt extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final TypeOfCourt typeOfCourt;

    public UpdateTypeOfCourt(TennisCourtReservationID tennisCourtReservationID, TypeOfCourt typeOfCourt) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.typeOfCourt = typeOfCourt;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public TypeOfCourt getTypeOfCourt() {
        return typeOfCourt;
    }
}
