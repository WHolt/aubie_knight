import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class DesertOrb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesertOrb extends Orb
{
    /**
     * Act - do whatever the DesertOrb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List<Hero> actorsInRange = getObjectsInRange(hitRadius, Hero.class);
      if (!actorsInRange.isEmpty()) {
         /* Reappear below Hero 
            Follow Hero at 10 pixels away
            */
         setLocation(250,220);
         followHero = 1;
      }
      if (followHero == 1) {
        Move();
      }
    }    
}
