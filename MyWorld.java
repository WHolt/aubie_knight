import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
        addObject(new Hero(), 250, 250);
        addObject(new Tree(), 489, 301);
        addObject(new Tree2(), 489,129);
        setPaintOrder(Tree.class, Hero.class, Tree2.class);
    }
}
