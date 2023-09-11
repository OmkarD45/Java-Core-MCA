import java.util.*;
class vehicle {
  Scanner sc = new Scanner(System.in);
  protected int RegNo, speed;
  protected String color, ownername;

  public void getVehicleData() {
    System.out.println("Enter Register No:");
    RegNo = sc.nextInt();
    System.out.println("Enter Speed:");
    speed = sc.nextInt();
    System.out.println("Enter Color:");
    color = sc.next();
    System.out.println("Enter Owner Name:");
    ownername = sc.next();
  }

  public void showdata() {
    System.out.println("This is Vehicle Class");
  }
}

class Bus extends vehicle {

  private int routeNo;

  public void getBusData() {
    System.out.println("Enter Route No:");
    routeNo = sc.nextInt();
  }

  public void showdata() {
    System.out.println("Register No:" + RegNo);
    System.out.println("Speed:" + speed);
    System.out.println("Color:" + color);
    System.out.println("Owner Name:" + ownername);
    System.out.println("Route No : " + routeNo);
    super.showdata();
  }
}

class Car extends vehicle {

  private String ManufacturerName;

  public void getCarData() {
    System.out.println("Enter Manufacturer Name:");
    ManufacturerName = sc.next();
  }

  public void showdata() {
    System.out.println("Register No:" + RegNo);
    System.out.println("Speed:" + speed);
    System.out.println("Color:" + color);
    System.out.println("Owner Name:" + ownername);
    System.out.println("Manufacturer Name : " + ManufacturerName);
    super.showdata();
  }
}

public class Assignment2Q1 {

  public static void main(String[] args) {
	System.out.println("For Car");
    Car c = new Car();
    c.getVehicleData();
    c.getCarData();
    c.showdata();
    System.out.println("For Bus");
    Bus b = new Bus();
    b.getVehicleData();
    b.getBusData();
    b.showdata();
  }
}