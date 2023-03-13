package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

public class FlightBooking {
     String flightCompany="Flights-of-Fancy";
     String   flightID;
     String passengerFullName;
     FlightBooking.TripSource tripSource;
     String  sourceAirport;
     String   tripDestination;
     String   destinationAirport;
     LocalDate  departureDate;
     LocalDate  returnDate;
     int  childPassengers;
     int adultPassengers;
     int   totalPassengers;
     double   departingTicketPrice;
     double returnTicketPrice;
     double  totalTicketPrice;
     String ticketNumber;
     public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate, int i, int i1) {
        this.passengerFullName = aNull;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers =i;
        this.adultPassengers =i1;
    }


    

    
    public String getFlightCompany()
    {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany )
    {
        this.flightCompany=flightCompany;
    }


    public String getFlightID()
    {
        return flightID;
    }
    public void setFlightID(String flightID )
    {
        this.flightID=flightID;
    }


    public String getPassengerFullName()
    {
        return passengerFullName;
    }
    public void setPassengerFullName(String passengerFullName )
    {
        this.passengerFullName=passengerFullName;
    }

    public enum TripSource {
        NANJING("1"), 
        BEIJING("2"), 
        SHANGHAI("3"), 
        OULU("4"), 
        HELSINKI("5"),
        PARIS("6");
    
    public String value;
    private TripSource (String value){
        this.value = value;
    }
}

    public FlightBooking.TripSource getTripSource()
    {  
        return tripSource;
    }
    public void setTripSource(FlightBooking tripSource,String value )
    {
        switch (value){
            case "1" :
            this.tripSource = FlightBooking.TripSource.NANJING;
            break;
            case "2" :
            this.tripSource = FlightBooking.TripSource.BEIJING;
            break;
            case "3" :
            this.tripSource = FlightBooking.TripSource.SHANGHAI;
            break;
            case "4" :
            this.tripSource = FlightBooking.TripSource.OULU;
            break;
            case "5" :
            this.tripSource = FlightBooking.TripSource.HELSINKI;
            break;
            case "6" :
            this.tripSource = FlightBooking.TripSource.PARIS;
            break;
            default:
            this.tripSource = null;
        }
    }


    public String getSourceAirport()
    {
        return sourceAirport;
    }
    public void setSourceAirport(String sourceAirport )
    {
        this.sourceAirport=sourceAirport;
    }


    public String getTripDestination()
    {
        return tripDestination;
    }
    public void setTripDestination(String tripDestination )
    {
        this.tripDestination=tripDestination;
    }


    public String getDestinationAirport()
    {
        return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport )
    {
        this.destinationAirport=destinationAirport;
    }


    public LocalDate getDepartureDate()
    {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate )
    {
        this.departureDate=departureDate;
    }


    public LocalDate getReturnDate()
    {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate )
    {
        this.returnDate=returnDate;
    }


    public int getChildPassengers()
    {
        return childPassengers;
    }
    public void setChildPassengers(int childPassengers )
    {
        this.childPassengers=childPassengers;
    }


    public int getAdultPassengers()
    {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers )
    {
        this.adultPassengers=adultPassengers;
    }


    public int getTotalPassengers()
    {
        return totalPassengers;
    }
    public void setTotalPassengers(int ChildPassengers, int AdultPassengers )
    {
        this.totalPassengers = ChildPassengers+AdultPassengers;
    }


    public double  getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(double  departingTicketPrice )
    {
        this.departingTicketPrice=departingTicketPrice;
    }


    public double  getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(double returnTicketPrice )
    {
        this.returnTicketPrice=returnTicketPrice;
    }


    public double  getTotalTicketPrice()
    {
        return totalTicketPrice;
    }
    public void setTotalTicketPrice(double  totalTicketPrice )
    {
        this.totalTicketPrice=totalTicketPrice;
    }


    public String  getTicketNumber()
    {
        return ticketNumber;
    }
    public void setTicketNumber(String  ticketNumber )
    {
        this.ticketNumber=ticketNumber;
    }
    public String toString()
    {return ("Dear " + passengerFullName + ". Thank you for booking your flight with " + flightCompany + "." + "\n" +
       "Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " +  returnDate + "\n" +
       "Total passengers: " + totalPassengers + "\n" +
       "Total ticket price in Euros: " + totalTicketPrice);
}
}


