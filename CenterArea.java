import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CenterArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CenterArea extends World
{

    /**
     * Constructor for objects of class CenterArea.
     * 
     */
    public CenterArea()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
        setPaintOrder(Tree.class,Hero.class,Tree2.class);
        addObject(new Tree(), 489, 301);
        addObject(new Tree2(), 489,129);
    }
}
