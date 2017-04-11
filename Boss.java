import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    int Y_Velocity = 3;
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
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
}
