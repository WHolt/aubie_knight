import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterSlime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterSlime extends Actor
{
    /**
     * Act - do whatever the WaterSlime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
        Kill();
    }    
    public void Move() {
    int X = getX();
        int Y = getY();
    if(X >= 320){ 
          setLocation(getX(), getY()+5);
          if(Y >=310) {
           move(-5);
    
        }
    }
    else if(Y >= 310){
          move(-5);
          if(X <= 160){
         setLocation(getX(),getY()-5);
        }
         }
    else if(X <= 160){
         setLocation(getX(),getY()-5);
         if(Y <=160) {
        move(5);
    }
        }
    else if(Y <=160) {
        move(5);
    }
    }
    public int hitPoints = 50;
    public void Kill() {
      if (isTouching(Hero.class)) {
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
