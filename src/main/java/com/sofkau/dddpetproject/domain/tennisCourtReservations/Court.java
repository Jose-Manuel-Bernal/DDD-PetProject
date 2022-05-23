package com.sofkau.dddpetproject.domain.tennisCourtReservations;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.CourtID;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.CourtNumber;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.Ilumination;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.TypeOfCourt;

import java.util.Objects;

public class Court extends Entity<CourtID> {
    private Ilumination ilumination;
    private TypeOfCourt typeOfCourt;
    private CourtNumber courtNumber;

    public Court(CourtID entityId,
                 Ilumination ilumination,
                 TypeOfCourt typeOfCourt,
                 CourtNumber courtNumber) {
        super(entityId);
        this.ilumination = ilumination;
        this.typeOfCourt = typeOfCourt;
        this.courtNumber = courtNumber;
    }

    public Ilumination ilumination() {
        return ilumination;
    }

    public void updateIlumination(Ilumination ilumination) {
        this.ilumination = Objects.requireNonNull(ilumination);
    }

    public TypeOfCourt typeOfCourt() {
        return typeOfCourt;
    }

    public void updateTypeOfCourt(TypeOfCourt typeOfCourt) {
        this.typeOfCourt = Objects.requireNonNull(typeOfCourt);
    }

    public CourtNumber courtNumber() {
        return courtNumber;
    }

    public void updateCourtNumber(CourtNumber courtNumber) {
        this.courtNumber = Objects.requireNonNull(courtNumber);
    }
}
