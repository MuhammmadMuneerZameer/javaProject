/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intro;

import java.util.Scanner;

/**
 *
 * @author zmune
 */

//public class Intro{
//    static double Power(int a, int b){
//        double power=1;
//        for(int i=0;i<b;i++){
//            power=power*a;
//        }
//      System.out.println("this is function 1: "+power);  
//      return power; 
//    }
//     static double Power(int a, float b){
//        double power=1;
//        for(int i=0;i<b;i++){
//            power=power*a;
//        }
//        System.out.println("this is function 2: "+power);
//      return power; 
//    } 
//     static double Power(int a,long c){
//        double power=1;
//        for(int i=0;i<c;i++){
//            power=power*a;
//        }
//         System.out.println("this is function 3: "+power);
//      return power; 
//    }
     
//public static void main(String []args){
//    Power(5,2);
//    Power(5, (float) 2.5);
//    Power(6,3242321);
//}}


//class Library{
//    Scanner s= new Scanner(System.in);
//     static void Checkout(String bookname,String name,String boo){
//        
//        if("yes".equals(boo)){
//            System.out.println(bookname+" is checkout by "+name);
//        }
//        else{
//           System.out.println(bookname+" is taken to read by "+name); 
//        }
//        
//    }
//}
//
//class LibraryMember extends Library{
//         
//
//    static void UserCheck(String name){
//        Scanner s= new Scanner(System.in);
//        String nameL="muneer";
//        if(name.equals(nameL)){
//            System.out.println("welcome User "+name);
//            System.out.println("Enter the name of the book you want");
//            String book=s.next();
//            Book.Bookavailable(book,nameL);
//            
//            
//        }
//        else{
//            System.out.println("User not available!");
//        }
//        
//    }
//}
//class Book extends Library{
//
//     static void Bookavailable(String Book,String name){
//         Scanner s= new Scanner(System.in);
//        String[] books = {"Head First Java","muneer", "Java: A Beginner's Guide", "Java for Dummies", "Effective Java", "Head First Design Patterns"};
//        boolean found = false;
////         System.out.println(Book);
//        for(int i=0;i <books.length ;i++){
//         if(books[i].equals(Book)){
//             System.out.println("book available");
//             System.out.println("do you want to checkout "+Book+" ? yes or No");
//             String boo=s.next();
//             Library.Checkout(Book,name,boo);
//             found = true;
//             
//             break;
//     }
//        
//             }
//         if(!found){
//             System.out.println("Not available");
//         }
//        
//        
////           System.out.println("book not available");
//            }
//}
//public class Intro{
// public static void main(String []args){
//     Scanner s= new Scanner(System.in);
//     System.out.println("enter your name Library member");
//     String name=s.next();
//     LibraryMember.UserCheck(name);
//     
//     
//     
// }
//}

//public class Intro {
//
//    public static double calculateCircleArea(double radius) {
//        return Math.PI * radius * radius;
//    }
//
//    public static double calculateRectangleArea(double length, double width) {
//        return length * width;
//    }
//
//    public static double calculateTriangleArea(double base, double height) {
//        return 0.5 * base * height;
//    }
//
//    public static void main(String[] args) {
//        // Calculate the area of a circle
//        double circleRadius = 5.0;
//        double circleArea = calculateCircleArea(circleRadius);
//        System.out.println("Circle area: " + circleArea);
//
//        // Calculate the area of a rectangle
//        double rectangleLength = 10.0;
//        double rectangleWidth = 5.0;
//        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
//        System.out.println("Rectangle area: " + rectangleArea);
//
//        // Calculate the area of a triangle
//        double triangleBase = 6.0;
//        double triangleHeight = 4.0;
//        double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
//        System.out.println("Triangle area: " + triangleArea);
//    }
//}

//lab7

public class Intro{

    private String name;
    private int yearBuilt;
    private double thrust;
    private double fuelUsagePerKm;

    public Intro(String name, int yearBuilt, double thrust, double fuelUsagePerKm) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.thrust = thrust;
        this.fuelUsagePerKm = fuelUsagePerKm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public double getFuelUsagePerKm() {
        return fuelUsagePerKm;
    }

    public void setFuelUsagePerKm(double fuelUsagePerKm) {
        this.fuelUsagePerKm = fuelUsagePerKm;
    }

    public double calculateFuelConsumption(double distance) {
        return distance * fuelUsagePerKm;
    }

    public double calculateDistanceCovered(double fuel) {
        return fuel / fuelUsagePerKm;
    }
}

class JetFighterPlane extends Intro {

    private String pilotPosition;
    private String[] weapons;
    private int maxNuclearBombs;

    public JetFighterPlane(String name, int yearBuilt, double thrust, double fuelUsagePerKm, String pilotPosition, String[] weapons, int maxNuclearBombs) {
        super(name, yearBuilt, thrust, fuelUsagePerKm);
        this.pilotPosition = pilotPosition;
        this.weapons = weapons;
        this.maxNuclearBombs = maxNuclearBombs;
    }

    public String getPilotPosition() {
        return pilotPosition;
    }

    public void setPilotPosition(String pilotPosition) {
        this.pilotPosition = pilotPosition;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    public int getMaxNuclearBombs() {
        return maxNuclearBombs;
    }

    public void setMaxNuclearBombs(int maxNuclearBombs) {
        this.maxNuclearBombs = maxNuclearBombs;
    }

    // Overloaded member function to display jetfighter plane's specific information
    public void printJetFighterPlaneInfo() {
        System.out.println("======================= JetFighterPlane Details =========================");
        System.out.println("Name: " + getName());
        System.out.println("Year Built: " + getYearBuilt());
        System.out.println("Thrust: " + getThrust());
        System.out.println("Fuel Usage Per Km: " + getFuelUsagePerKm());
        System.out.println("Pilot Position: " + pilotPosition);
        System.out.println("Weapons: " + Array.toString(weapons));
        System.out.println("Maximum Nuclear Bombs: " + maxNuclearBombs);
        System.out.println("======================= JetFighterPlane Details End =========================");
    }

    // Overrides the print function from the base class
   
    public void print() {
        // Call the overridden printJetFighterPlaneInfo method
        printJetFighterPlaneInfo();
    }
}
 class CargoJetPlane extends Intro {

    private double maximumCargoWeight;
    private double cargoVolume;

    public CargoJetPlane(String name, int yearBuilt, double thrust, double fuelUsagePerKm, double maximumCargoWeight, double cargoVolume) {
        super(name, yearBuilt, thrust, fuelUsagePerKm);
        this.maximumCargoWeight = maximumCargoWeight;
        this.cargoVolume = cargoVolume;
    }

    public double getMaximumCargoWeight() {
        return maximumCargoWeight;
    }

    public void setMaximumCargoWeight(double maximumCargoWeight) {
        this.maximumCargoWeight = maximumCargoWeight;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    // Overloaded member function to display cargo jet plane's specific information
    public void printCargoJetPlaneInfo() {
        System.out.println("======================= CargoJetPlane Details =========================");
        System.out.println("Name: " + getName());
        System.out.println("Year Built: " + getYearBuilt());
        System.out.println("Thrust: " + getThrust());
        System.out.println("Fuel Usage Per Km: " + getFuelUsagePerKm());
        System.out.println("Maximum Cargo Weight: " + maximumCargoWeight);
        System.out.println("Cargo Volume: " + cargoVolume);
        System.out.println("======================= CargoJetPlane Details End =========================");
    }

    // Overrides the print function from the base class

    public void print() {
        // Call the overridden printCargoJetPlaneInfo method
        printCargoJetPlaneInfo();
    }
}

