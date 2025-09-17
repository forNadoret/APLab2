package train;

import java.time.LocalTime;

public class Train {
    private String destination;
    private int trainNumber;
    private LocalTime departureTime;
    private int seatGeneral;
    private int seatCoupe;
    private int seatPlatzkart;
    private int seatLuxury;

    public Train(String destination, int trainNumber, LocalTime departureTime,
                 int seatGeneral, int seatCoupe, int seatPlatzkart, int seatLuxury) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.seatGeneral = seatGeneral;
        this.seatCoupe = seatCoupe;
        this.seatPlatzkart = seatPlatzkart;
        this.seatLuxury = seatLuxury;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getSeatGeneral() {
        return seatGeneral;
    }

    public void setSeatGeneral(int seatGeneral) {
        this.seatGeneral = seatGeneral;
    }

    public int getSeatCoupe() {
        return seatCoupe;
    }

    public void setSeatCoupe(int seatCoupe) {
        this.seatCoupe = seatCoupe;
    }

    public int getSeatPlatzkart() {
        return seatPlatzkart;
    }

    public void setSeatPlatzkart(int seatPlatzkart) {
        this.seatPlatzkart = seatPlatzkart;
    }

    public int getSeatLuxury() {
        return seatLuxury;
    }

    public void setSeatLuxury(int seatLuxury) {
        this.seatLuxury = seatLuxury;
    }

    @Override
    public String toString()
    {
        return "Train {" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                ", seatGeneral=" + seatGeneral +
                ", seatCoupe=" + seatCoupe +
                ", seatPlatzkart=" + seatPlatzkart +
                ", seatLuxury=" + seatLuxury +
                '}';
    }
}
