package com.sofkau.dddpetproject.domain.tennisCourtReservations.values;

import co.com.sofka.domain.generic.Identity;

public class TennisCourtReservationID extends Identity {

    public TennisCourtReservationID() {}

    private TennisCourtReservationID(String id) {super(id);}

    public static TennisCourtReservationID of (String id) {return new TennisCourtReservationID(id);}
}
