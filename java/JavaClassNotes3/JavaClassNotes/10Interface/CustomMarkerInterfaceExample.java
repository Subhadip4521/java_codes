//custom marker interface  
interface Car     
{  
   
}  
//custom marker interface  
interface Engine    
{  
   
}  
//class that implements the Car marker interface  
class Vehicle implements Car      
{  
static void isVehicle()  
{  
System.out.println("Car is a vehicle.");  
}  
}  
//class that implements the Engine marker interface  
class Status implements Engine  
{  
static void isWorking()  
{  
System.out.println("Yes, engine is working.");  
}  
}  
//main class  
public class CustomMarkerInterfaceExample  
{  
public static void main(String args[])  
{  
//invoking the methods of the class  
Vehicle.isVehicle();  
Status.isWorking();  
}  
}  