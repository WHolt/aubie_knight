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
      setPaintOrder(TreeTop.class, Tree.class, Hero.class, Tree2.class);
      //BottomLeft//
      addObject(new Tree(), 150, 301);
      addObject(new Tree(), 150, 351);
      addObject(new Tree(), 150, 401);
      addObject(new Tree(), 150, 461);
      addObject(new Tree(), 100, 301);
      addObject(new Tree(), 100, 351);
      addObject(new Tree(), 100, 401);
      addObject(new Tree(), 100, 461);
      addObject(new Tree(), 50, 301);
      addObject(new Tree(), 50, 351);
      addObject(new Tree(), 50, 401);
      addObject(new Tree(), 50, 461);
      //TopLeft//
      addObject(new Tree2(), 150, 35);
      addObject(new TreeTop(),150,35);
      addObject(new Tree2(), 150, 65);
      addObject(new TreeTop(),150,65);
      addObject(new Tree2(), 150, 95);
      addObject(new TreeTop(),150,95);
      addObject(new Tree2(), 150, 129);
      addObject(new TreeTop(),150,129);
      addObject(new Tree2(), 100, 35);
      addObject(new TreeTop(), 100, 35);
      addObject(new Tree2(), 100, 65);
      addObject(new TreeTop(), 100, 65);
      addObject(new Tree2(), 100, 95);
      addObject(new TreeTop(), 100, 95);
      addObject(new Tree2(), 100, 129);
      addObject(new TreeTop(), 100, 129);
      addObject(new Tree2(), 50, 35);
      addObject(new TreeTop(), 50, 35);
      addObject(new Tree2(), 50, 65);
      addObject(new TreeTop(), 50, 65);
      addObject(new Tree2(), 50, 95);
      addObject(new TreeTop(), 50, 95);
      addObject(new Tree2(), 50, 129);
      addObject(new TreeTop(), 50, 129);
      //BottomRight//
      addObject(new Tree(), 489,301);
      addObject(new Tree(), 350, 301);
      addObject(new Tree(), 350, 351);
      addObject(new Tree(), 350,401);
      addObject(new Tree(), 350,461);
      addObject(new Tree(), 400, 301);
      addObject(new Tree(), 400, 351);
      addObject(new Tree(), 400,401);
      addObject(new Tree(), 400,461);
      addObject(new Tree(), 449,301);
      addObject(new Tree(), 449,351);
      addObject(new Tree(), 449,401);
      addObject(new Tree(), 449,461);
      addObject(new Tree(), 489,351);
      addObject(new Tree(), 489,401);
      addObject(new Tree(), 489,461);
      //TopRight//
      addObject(new Tree2(), 350, 35);
      addObject(new TreeTop(),350,35);
      addObject(new Tree2(), 350, 65);
      addObject(new TreeTop(),350,65);
      addObject(new Tree2(), 350,95);
      addObject(new TreeTop(),350,95);
      addObject(new Tree2(), 350,129);
      addObject(new TreeTop(),350,129);
      addObject(new Tree2(), 400, 35);
      addObject(new TreeTop(), 400, 35);
      addObject(new Tree2(), 400, 65);
      addObject(new TreeTop(), 400, 65);
      addObject(new Tree2(), 400,95);
      addObject(new TreeTop(), 400, 95);
      addObject(new Tree2(), 400,129);
      addObject(new TreeTop(), 400, 129);
      addObject(new Tree2(), 449,35);
      addObject(new TreeTop(), 449, 35);
      addObject(new Tree2(), 449, 65);
      addObject(new TreeTop(), 449, 65);
      addObject(new Tree2(), 449,95);
      addObject(new TreeTop(), 449, 95);
      addObject(new Tree2(), 449,129);
      addObject(new TreeTop(), 449, 129);
      addObject(new Tree2(), 489,35);
      addObject(new TreeTop(), 489, 35);
      addObject(new Tree2(), 489, 65);
      addObject(new TreeTop(), 489, 65);
      addObject(new Tree2(), 489,95);
      addObject(new TreeTop(), 489, 95);
      addObject(new Tree2(), 489,129);
      addObject(new TreeTop(), 489, 129);
    }
}
