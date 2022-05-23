package com.sofkau.dddpetproject.domain.tennisCourtReservations;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.events.*;
import com.sofkau.dddpetproject.domain.tennisCourtReservations.values.*;

import java.util.Objects;

public class TennisCourtReservations extends AggregateEvent<TennisCourtReservationID> {
    protected DateOfReservation dateOfReservation;
    protected HourOfReservation hourOfReservation;
    protected Client client;
    protected Court court;

    public TennisCourtReservations(TennisCourtReservationID entityId,
                                   DateOfReservation dateOfReservation,
                                   HourOfReservation hourOfReservation) {
        super(entityId);
        this.dateOfReservation = dateOfReservation;
        this.hourOfReservation = hourOfReservation;
    }

    public void updateDateOfReservation(DateOfReservation dateOfReservation){
        appendChange(new DateOfReservationUpdated(dateOfReservation)).apply();
    }

    public void updateHourOfReservation(HourOfReservation hourOfReservation){
        appendChange(new HourOfReservationUpdated(hourOfReservation)).apply();
    }

    public void addClient(ClientID clientID, Name name, PhoneNumber phoneNumber){
        Objects.requireNonNull(clientID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(phoneNumber);
        appendChange(new ClientAdded(clientID, name, phoneNumber)).apply();
    }

    public void updateClientName(Name name){
        appendChange(new ClientNameUpdated(name)).apply();
    }

    public void updateClientsPhoneNumber(PhoneNumber phoneNumber){
        appendChange(new ClientPhoneNumberUpdated(phoneNumber)).apply();
    }

    public void addCourt(CourtID courtID,
                         Ilumination ilumination,
                         TypeOfCourt typeOfCourt,
                         CourtNumber courtNumber){
        appendChange(new CourtAdded(courtID,ilumination,typeOfCourt,courtNumber)).apply();
    }

    public void updateIlumination(Ilumination ilumination){
        appendChange(new IluminationUpdated(ilumination)).apply();
    }

    public void updateTypeOfCourt(TypeOfCourt typeOfCourt){
        appendChange(new TypeOfCourtUpdated(typeOfCourt)).apply();
    }

    public void updateCourtNumber(CourtNumber courtNumber){
        appendChange(new CourtNumberUpdated(courtNumber)).apply();
    }
}
