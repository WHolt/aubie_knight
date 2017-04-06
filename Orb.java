import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
     public int W1 = 0;
    public int W2 = 0;
    public int W3 = 0;
    public int W4 = 0;
    public int W5 = 1;
    public int W6 = 0;
    public int W7 = 0;
    public int W8 = 0;
    public int W9 = 0;
    public int hitRadius = 10;
    public int followHero = 0;
    /**
     * Act - do whatever the Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
    }
     public void Move() { 
        if(Greenfoot.isKeyDown("up")) {
         setLocation(getX(), getY()-2);
        }
        else if(Greenfoot.isKeyDown("right")) {
         move(2);
        }
         else if(Greenfoot.isKeyDown("left")) {
         move(-2);
        }
        else if(Greenfoot.isKeyDown("down")) {
         setLocation(getX(), getY()+2);
        }
    }
    public void transition(int X, int Y) {
      setLocation(X,Y);
    }
}
