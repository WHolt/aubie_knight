import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    GreenfootImage heroImg = new GreenfootImage("B.png");
    int pos_x;
    int pos_y;
    
    final int MAX_X = 500;
    final int MAX_Y = 500;
    final int MIN_X = 0;
    final int MIN_Y = 0;
    
    public Hero(int x, int y) {
     pos_x = x;
     pos_y = y;
     setImage(heroImg);
     
     setLocation(x, y);
    }
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk(); //Add sound effects.
    }
    public void walk(){ 
       if(Greenfoot.isKeyDown("up")) {
        pos_y -= 1;
        }
       else if(Greenfoot.isKeyDown("right")) {
        pos_x +=1;
        }
       else if(Greenfoot.isKeyDown("left")) {
        pos_x -=1;
        }
       else if(Greenfoot.isKeyDown("down")) {
        pos_y += 1;
        }
       if(pos_x > MAX_X) {
        pos_x = MAX_X;
        }
       if (pos_y > MAX_Y) {
        pos_y = MAX_Y;
        }
       if(pos_x < MIN_X) {
        pos_x = MIN_X;
        }
       if (pos_y < MIN_Y) {
        pos_y = MIN_Y;
        }
       
       setLocation(pos_x, pos_y);
    }
    
    public int GetPosX() {
        return pos_x;
    }
    public int GetPosY() {
        return pos_y;
    }
    public void SetPosX(int x) {
        pos_x = x;
        setLocation(pos_x, pos_y);
    }

    public void SetPosY(int y) {
        pos_y = y;
        setLocation(pos_x, pos_y);
    }
   }
