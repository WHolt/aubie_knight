import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawns here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawns extends Overworld
{
    
    /**
     * Constructor for objects of class Spawns.
     * 
     */
    public Spawns()
    {
      setPaintOrder(TreeTop.class, Tree.class, Hero.class, Boss.class, Tree2.class);
      //BottomLeft//
      for (int i = 0; i <= 2; i++) {
          int x = (i * 50) + 50;

          for(int j = 0; j <= 4; j++) {
              int y = (j * 50) + 301;


              addObject(new Tree(), x, y);
          }
      }
      //TopLeft//
      
      for (int i = 0; i <= 2; i++) {
          int x = (i * 50) + 35;

          for(int j = 0; j <= 2; j++) {
              int y = (j * 40) + 50;


              addObject(new Tree2(), x, y);
              addObject(new TreeTop(), x, y);
          }
      }
      
      //BottomRight//
      
      for (int i = 0; i <= 3; i++) {
          int x = (i * 50) + 350;

          for(int j = 0; j <= 4; j++) {
              int y = (j * 50) + 301;


              addObject(new Tree(), x, y);
          }
      }
      
      //TopRight//
      
      for (int i = 0; i <= 3; i++) {
          int x = (i * 50) + 350;

          for(int j = 0; j <= 2; j++) {
              int y = (j * 40) + 50;


              addObject(new Tree2(), x, y);
              addObject(new TreeTop(), x, y);
          }
      }
    }
}
