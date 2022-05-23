package com.sofkau.dddpetproject.domain.tennisCourtReservations.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.CourtID;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.CourtNumber;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Ilumination;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TypeOfCourt;

public class CourtAdded extends DomainEvent {

    private final CourtID courtID;
    private final Ilumination ilumination;
    private final TypeOfCourt typeOfCourt;
    private final CourtNumber courtNumber;

    public CourtAdded(CourtID courtID,
                      Ilumination ilumination,
                      TypeOfCourt typeOfCourt,
                      CourtNumber courtNumber) {
        super("sofka.tenniscourtreservation.courtadded");
        this.courtID = courtID;
        this.ilumination = ilumination;
        this.typeOfCourt = typeOfCourt;
        this.courtNumber = courtNumber;
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
