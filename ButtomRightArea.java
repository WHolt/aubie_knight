import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtomRightArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtomRightArea extends World
{

    /**
     * Constructor for objects of class ButtomRightArea.
     * 
     */
    public ButtomRightArea()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
        addObject(new IceSlime(), 165, 155);
    }
}
