package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){

    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Room Number: " + roomNumber +
                ", check-in: " + checkin +
                ", check-out: " + checkout +
                ", " + duration() + " nights";
    }

    public Date duration() throws ParseException {
        Duration diff = Duration.between(checkin.toInstant(),checkout.toInstant());
        return sdf.parse(String.valueOf(diff));
    }
}
