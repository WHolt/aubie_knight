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
    public List<Area> areas = new ArrayList<Area>(9);
    public Area currentArea;
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
    /**
     * Constructor for objects of class Overworld.
     * 
     */
    public Overworld()
    {    
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
       areas.set(TOP_LEFT, new Area("LavaArea.png"));
       areas.set(TOP, new Area("LavaTransition.png"));
       areas.set(TOP_RIGHT, new Area("WaterArea.png"));
       areas.set(LEFT, new Area("DesertTransition.png"));
       areas.set(CENTER, new Area("BeginningArea.png"));
       areas.set(RIGHT, new Area("WaterTransition.png"));
       areas.set(BOTTOM_LEFT, new Area("DesertArea.png"));
       areas.set(BOTTOM, new Area("IceTransition.png"));
       areas.set(BOTTOM_RIGHT, new Area("IceArea.png"));
       currentArea = areas.get(CENTER);
       currentAreaIndex = CENTER;
    }
    public Area getAdjacentArea(char direction) {
        // Do valid cases for all areas //
     switch(currentAreaIndex) {
      case TOP_LEFT:
      if (direction == 'r') {
            return areas.get(TOP);
        }
      else if (direction == 'd') {
            return areas.get(LEFT);
        }
        break;
      case TOP:
      if (direction == 'r') {
          return areas.get(TOP_RIGHT);
        }
      else if(direction == 'l') {
          return areas.get(TOP_LEFT);
        }
      else if (direction == 'd') {
            return areas.get(CENTER);
        }
        break;
      case TOP_RIGHT:
      if (direction == 'l') {
            return areas.get(TOP);
        }
      else if (direction == 'd') {
            return areas.get(RIGHT);
        }
        break;
      case LEFT:
      if (direction == 'r') {
          return areas.get(CENTER);
        }
      else if(direction == 'u') {
          return areas.get(TOP_LEFT);
        }
      else if (direction == 'd') {
            return areas.get(BOTTOM_LEFT);
        }
        break;
      case CENTER:
      if (direction == 'r') {
          return areas.get(RIGHT);
        }
      else if (direction == 'l') {
          return areas.get(LEFT);
        }
      else if (direction == 'd') {
            return areas.get(BOTTOM);
        }
      else if (direction == 'u') {
          return areas.get(TOP);
        }
        break;
      case RIGHT:
      if (direction == 'l') {
          return areas.get(CENTER);
        }
      else if(direction == 'u') {
          return areas.get(TOP_RIGHT);
        }
      else if (direction == 'd') {
            return areas.get(BOTTOM_RIGHT);
        }
        break;
      case BOTTOM_LEFT:
      if(direction == 'u') {
          return areas.get(LEFT);
        }
      else if (direction == 'd') {
            return areas.get(BOTTOM);
        }
        break;
      case BOTTOM:
      if (direction == 'u') {
          return areas.get(CENTER);
        }
      else if(direction == 'l') {
          return areas.get(BOTTOM_LEFT);
        }
      else if (direction == 'r') {
            return areas.get(BOTTOM_RIGHT);
        }
        break;
      case BOTTOM_RIGHT:
      if (direction == 'u') {
          return areas.get(RIGHT);
        }
      else if(direction == 'l') {
          return areas.get(BOTTOM);
        }
        break;
      }
      return currentArea;
    }
    public void setCurrentArea(int area) {
        currentArea = areas.get(area);
        currentAreaIndex = area;
    }
    public Area getCurrentArea() {
     return currentArea;
    }
}
