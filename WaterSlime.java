import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class WaterSlime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterSlime extends Slime
{
    /**
     * Act - do whatever the IceSlime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
        Kill();
        /* GreenfootImage S1 = new GreenfootImage("S2.png");
        setImage(S1); */
    }
}
