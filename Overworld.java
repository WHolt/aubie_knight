import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Overworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Overworld extends World
{
    public List<GreenfootImage> areas = new ArrayList<GreenfootImage>();
    public World currentWorld;
    public int currentAreaIndex;
    final int TOP_LEFT = 0;
    final int TOP = 1;
    final int TOP_RIGHT = 2;
    final int LEFT = 3;
    final int CENTER = 4;
    final int RIGHT = 5;
    final int BOTTOM_LEFT = 6;
    final int BOTTOM = 7;
    final int BOTTOM_RIGHT = 8;
    public Hero hero;
    /**
     * Constructor for objects of class Overworld.
     * 
     */
   public Overworld() {
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);

        areas.add(new GreenfootImage("LavaArea.png"));
        areas.add(new GreenfootImage("LavaTransition.png"));
        areas.add(new GreenfootImage("WaterArea.png"));
        areas.add(new GreenfootImage("DesertTransition.png"));
        areas.add(new GreenfootImage("BeginningArea.png"));
        areas.add(new GreenfootImage("WaterTransition.png"));
        areas.add(new GreenfootImage("DesertArea.png"));
        areas.add(new GreenfootImage("IceTransition.png"));
        areas.add(new GreenfootImage("IceArea.png"));

        setCurrentWorld(CENTER);
        currentAreaIndex = CENTER;

        hero = new Hero(250, 250);
        addObject(hero, 250, 250);
    }
  public void act() {
        if (hero.GetPosY() == 500) {
            hero.SetPosY(1);
            setCurrentWorld(getAdjacentArea('d'));
        }

       else if (hero.GetPosY() == 0) {
            hero.SetPosY(499);
            setCurrentWorld(getAdjacentArea('u'));
        }
        else if (hero.GetPosX() == 500) {
            hero.SetPosX(1);
            setCurrentWorld(getAdjacentArea('r'));
        }

       else if (hero.GetPosX() == 0) {
            hero.SetPosX(499);
            setCurrentWorld(getAdjacentArea('l'));
        }
  }
    
  public int getAdjacentArea(char direction) {
        // Do valid cases for all areas //
        
         /*if(currentAreaIndex == CENTER) {
            if (direction == 'r') {
                return RIGHT;
            }
            else if (direction == 'l') {
                return LEFT;
            }
            else if (direction == 'd') {
                return BOTTOM;
            }
            else if (direction == 'u') {
                return TOP;
            }
        } */
        // USE currentAreaIndex to change it.//
        switch(currentAreaIndex) {
         case TOP_LEFT:
         if (direction == 'r') {
                return TOP;
            }
            else if (direction == 'd') {
                return LEFT;
            }
            break;
         case TOP:
         if (direction == 'r') {
                return TOP_RIGHT;
            }
            else if(direction == 'l') {
                return TOP_LEFT;
            }
            else if (direction == 'd') {
                return CENTER;
            }
            break;
         case TOP_RIGHT:
            if (direction == 'l') {
                return TOP;
            }
            else if (direction == 'd') {
                return RIGHT;
            }
            break;
         case LEFT:
            if (direction == 'r') {
                return CENTER;
            }
            else if(direction == 'u') {
                return TOP_LEFT;
            }
            else if (direction == 'd') {
                return BOTTOM_LEFT;
            }
            break;
         case CENTER:
            if (direction == 'r') {
                return RIGHT;
            }
            else if (direction == 'l') {
                return LEFT;
            }
            else if (direction == 'd') {
                return BOTTOM;
            }
            else if (direction == 'u') {
                return TOP;
            }
            break;
         case RIGHT:
            if (direction == 'l') {
                return CENTER;
            }
            else if(direction == 'u') {
                return TOP_RIGHT;
            }
            else if (direction == 'd') {
                return BOTTOM_RIGHT;
            }
            break;
         case BOTTOM_LEFT:
            if(direction == 'u') {
             return LEFT;
            }
            else if (direction == 'd') {
                return BOTTOM;
            }
            break;
         case BOTTOM:
            if (direction == 'u') {
                return CENTER;
            }
            else if(direction == 'l') {
                return BOTTOM_LEFT;
            }
            else if (direction == 'r') {
                return BOTTOM_RIGHT;
            }
            break;
         case BOTTOM_RIGHT:
            if (direction == 'u') {
                return RIGHT;
            }
            else if(direction == 'l') {
                return BOTTOM;
            }
            break;
        } 
        return currentAreaIndex;
    }
    public void setCurrentWorld(int area) {
        this.setBackground(areas.get(area));
        Greenfoot.setWorld(this);
    }
  
    
    /* public void setCurrentArea(int area) {
        currentArea = areas.get(area);
        currentAreaIndex = area;
    }
    
    public Area getCurrentArea() {
     return currentArea;
    } */
}
