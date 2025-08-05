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
    public String Destination()
    {
        return Destination;
    }
    public void Destination(String Destination)
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
public void checkStatus()
{
    if(delayTime==0)
    {
        System.out.println("flight "+flight_Number+" is on time");
    }else{
        System.out.println("Flight "+flight_Number+" is delayed by "+delayTime+" minutes. ");
    }
}   
}
