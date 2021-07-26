/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.SolucaoExcecoes.ruim.model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author 99030499
 */
public class Reservation {

    private int roomNumber;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(int roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    public long duration() {
        long dff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut) {

        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {
            return "Reservation dates for updates must be future dates";

        } 
        if (checkIn.after(checkOut)) {
            return "Check-Out date must be after check-in date";
        }

            this.checkIn = checkIn;
            this.checkOut = checkOut;
            return null;
    }
    

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        return "Reservation:" + "Room " + roomNumber + ", checkIn: " + sdf.format(checkIn) + ", checkOut: " + sdf.format(checkOut) + ", " + duration() + " nights";
    }

}
