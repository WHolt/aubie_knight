import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    int Y_Velocity = 3;
    public int hitPoints = 200;
    public int hitRadius = 50;
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
        Kill();
    }    
    public void walk() {
      move(Greenfoot.getRandomNumber(3));
      if(getX() >= 480) {
        setLocation(0,getY());
      }
      if (getY() >= 300) {
        Y_Velocity = -3;
      }
      if (getY() <= 166) {
        Y_Velocity = 3;
       }
      setLocation(getX(),getY() + Y_Velocity);
    }
    public void Kill() {
      List<Hero> actorsInRange = getObjectsInRange(hitRadius, Hero.class);
      if (!actorsInRange.isEmpty()) {
         hitPoints -= 5;
      }
      if (hitPoints == 0) {
        removeTouching(Hero.class);
        // Add GameOver Sprite //
        setLocation(250,250);
        Greenfoot.stop();
        }
     }
    }
