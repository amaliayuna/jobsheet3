/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author Amalia Yuna
 */
public class mountaintruck extends truck
{
    public int seatHeight;
    public mountaintruck(int startHeight, int startCadence, int startSpeed, int startGear) 
    {
        super (startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    // the mountaintrucj subclass adds one method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public static void main (String [] aku)
    {
        System.out.println("mulau Berjalan");
        mountaintruck MB = new mountaintruck(0,0,0,0);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
    }
}

