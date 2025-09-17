package main;

import train.Train;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Train[] trains = {
                new Train("Kyiv", 201, LocalTime.of(6, 30), 50, 20, 30, 5),
                new Train("Kyiv", 202, LocalTime.of(9, 15), 0, 25, 20, 0),
                new Train("Kyiv", 203, LocalTime.of(12, 45), 40, 0, 35, 10),
                new Train("Odessa", 204, LocalTime.of(7, 00), 45, 15, 25, 5),
                new Train("Odessa", 205, LocalTime.of(8, 45), 0, 20, 30, 0),
                new Train("Odessa", 206, LocalTime.of(13, 50), 60, 0, 25, 0),
                new Train("Kharkiv", 207, LocalTime.of(8, 20), 48, 18, 32, 7),
                new Train("Kharkiv", 208, LocalTime.of(11, 40), 0, 22, 28, 6),
                new Train("Kharkiv", 209, LocalTime.of(14, 15), 42, 19, 31, 4)
        };

        System.out.println("Trains with destination of Kyiv:");
        printByDestination(trains, "Kyiv");
        System.out.println();

        System.out.println("Trains with destination of Odessa and departure time of 8:45:");
        printByDestinationAndDepartureTime(trains, "Odessa", LocalTime.of(8, 45));
        System.out.println();

        System.out.println("Trains with destination of Kharkiv and general seats:");
        printByDestinationAndGeneralSeats(trains, "Kharkiv");
        System.out.println();
    };

    static void printByDestination(Train[] trains, String definedDestination)
    {
        for (Train train : trains)
        {
            if (train.getDestination().equalsIgnoreCase(definedDestination))
            {
                System.out.println(train);
            }
        }
    }

    static void printByDestinationAndDepartureTime(Train[] trains, String definedDestination, LocalTime definedDepartureTime)
    {
        for (Train train : trains)
        {
            if (train.getDestination().equalsIgnoreCase(definedDestination) && train.getDepartureTime().equals(definedDepartureTime))
            {
                System.out.println(train);
            }
        }
    }

    static void printByDestinationAndGeneralSeats(Train[] trains, String definedDestination)
    {
        for (Train train : trains)
        {
            if (train.getDestination().equalsIgnoreCase(definedDestination) && train.getSeatGeneral() > 0)
            {
                System.out.println(train);
            }
        }
    }
}