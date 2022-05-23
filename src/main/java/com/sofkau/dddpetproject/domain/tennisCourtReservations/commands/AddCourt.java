package com.sofkau.dddpetproject.domain.tennisCourtReservations.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.*;

public class AddCourt extends Command {
    private final TennisCourtReservationID tennisCourtReservationID;
    private final CourtID courtID;
    private final Ilumination ilumination;
    private final TypeOfCourt typeOfCourt;
    private final CourtNumber courtNumber;

    public AddCourt(TennisCourtReservationID tennisCourtReservationID, CourtID courtID, Ilumination ilumination, TypeOfCourt typeOfCourt, CourtNumber courtNumber) {
        this.tennisCourtReservationID = tennisCourtReservationID;
        this.courtID = courtID;
        this.ilumination = ilumination;
        this.typeOfCourt = typeOfCourt;
        this.courtNumber = courtNumber;
    }

    public TennisCourtReservationID getTennisCourtReservationID() {
        return tennisCourtReservationID;
    }

    public CourtID getCourtID() {
        return courtID;
    }

    public Ilumination getIlumination() {
        return ilumination;
    }

    public TypeOfCourt getTypeOfCourt() {
        return typeOfCourt;
    }

    public CourtNumber getCourtNumber() {
        return courtNumber;
    }
}
