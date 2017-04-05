import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class IceSlime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
    public int hitPoints = 50;
    public int hitRadius = 10;
    /**
     * Act - do whatever the IceSlime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move(); //Add Slime Sound Effects//
        Kill();
    }    
    public void Move() {
      int X = getX();
        int Y = getY();
      if(X >= 320){ 
          setLocation(getX(), getY()+5);
          if(Y >=310) {
           move(-3);
        }
       } 
       else if(Y >= 310){
          move(-3);
          if(X <= 160){
         setLocation(getX(),getY()-3);
        }
         }
       else if(X <= 160){
         setLocation(getX(),getY()-3);
         if(Y <=160) {
        move(3);
       }
        }
       else if(Y <=160) {
        move(3);
        }
    }
    public void Kill() {
      List<Hero> actorsInRange = getObjectsInRange(hitRadius, Hero.class);
      if (!actorsInRange.isEmpty()) {
         hitPoints -= 1;
      }
      if (hitPoints == 0) {
        removeTouching(Hero.class);
        // Add GameOver Sprite //
        setLocation(250,250);
        Greenfoot.stop();
        }
    }
}
