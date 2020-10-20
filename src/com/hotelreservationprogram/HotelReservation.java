package com.hotelreservationprogram;
import java.util.Arrays;

public class HotelReservation {
    public Hotel[] hotel = new Hotel[3];

    public static void main(String[] args){
           HotelReservation hotelReservation = new HotelReservation();
           Hotel hotel1 = new Hotel("Lakewood" , 110 ,80);
           hotelReservation.hotel[0] = hotel1;
           Hotel hotel2 = new Hotel("Bridgewood",160 ,110);
           hotelReservation.hotel[1] = hotel2;
           Hotel hotel3 = new Hotel("Bridgewood",220 ,100);
           hotelReservation.hotel[2] = hotel3;

    }
}
