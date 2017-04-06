import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class WaterORb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterOrb extends Orb
{
    /**
     * Act - do whatever the WaterORb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      List<Hero> actorsInRange = getObjectsInRange(hitRadius, Hero.class);
      if (!actorsInRange.isEmpty()) {
         /* Reappear below Hero 
            Follow Hero at 10 pixels away
            */
         setLocation(280,250);
         followHero = 1;
      }
      if (followHero == 1) {
        Move();
      }
    }    
}
