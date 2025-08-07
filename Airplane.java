import java.time.LocalTime;

public class Airplane {

    private String flight_Number;
    private String Destination;
    private LocalTime scheduledDeparture;
    private int delayTime;

    public Airplane(String flight_Number,String Destination,LocalTime scheduledDeparture)
    {
        this.flight_Number=flight_Number;
        this.Destination=Destination;
        this.scheduledDeparture=scheduledDeparture;
        this.delayTime=0;
    }
    public String getFlightNumber()
    {
        return flight_Number;
    }
    public void setFlightNumber(String flight_Number)
    {
        this.flight_Number=flight_Number;
    }
    public String getDestination()
    {
        return Destination;
    }
    public void setDestination(String Destination)
    {
        this.Destination = Destination;
    }
    public LocalTime getscheduledDeparture()
    {
        return scheduledDeparture;
    }
    public void setscheduledDeparture(LocalTime scheduledDeparture)
    {
        this.scheduledDeparture=scheduledDeparture;
    }
    public int getDelayTime()
    {
        return delayTime;
    }
    public void delay(int minutes)
    {
        this.delayTime = minutes;
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
    }
    public void getDetails()
    { if(delayTime!=0){
        LocalTime newTime = scheduledDeparture.plusHours(delayTime/60);
        System.out.println("Flight number "+flight_Number+" flying to "+Destination+" is Delayed by "+delayTime+" minutes, Updated time is "+newTime);
    }else{
        System.out.println("Flight number "+flight_Number+" Destination is "+Destination+" will depart at "+scheduledDeparture);
    }
    }
    public void checkStatus()
    {
    if(delayTime==0)
    {
        System.out.println("flight "+flight_Number+" is on time");
    }else{
        System.out.println("Flight "+flight_Number+" is delayed by "+delayTime+" minutes. ");
        }
    }   
    public static void main(String[] args)
    {
        Airplane flight1 = new Airplane("AI171","London",LocalTime.of(10,20));
        Airplane flight2 = new Airplane("VSR123","Singapore",LocalTime.of(14,40));
        Airplane flight3 = new Airplane("SPJ456", "Delhi", LocalTime.of(19,40));
        
        System.out.println("Flight Status before Delay ");
        System.out.println("-----------------------------------------------");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        System.out.println("-----------------------------------------------");

        flight1.delay(40);
        flight2.delay(30);
        flight3.delay(0);

        flight1.getDetails();
        flight2.getDetails();
        flight3.getDetails();
        System.out.println("-----------------------------------------------");

        System.out.println("Flight Status after Delay ");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
                System.out.println("-----------------------------------------------");

    }
}
