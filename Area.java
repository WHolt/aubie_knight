import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Area here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Area
{
    final int height = 500;
    final int width = 500;
    GreenfootImage bgImage;
    /**
     * Constructor for objects of class Area.
     * 
     */
    public Area(String backgroundImage)
    {    
       bgImage = new GreenfootImage(backgroundImage);
    }
    public int getHeight() {
      return height;
    }
    public int getWidth() {
     return width;
    }
    public GreenfootImage getBackground() {
        return bgImage;
    }
}
