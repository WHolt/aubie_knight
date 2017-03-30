import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk(); //Add sound effects.
        transition();
    }
    private int wander = 0;
    private int wanderU = 0;
    private int wanderD = 0;
    private int wanderL = 0;
    private int wanderR = 0;
    GreenfootImage B = new GreenfootImage("B.png");
    GreenfootImage A1 = new GreenfootImage("A1.png");
    GreenfootImage A2 = new GreenfootImage("A2.png");
    GreenfootImage L1 = new GreenfootImage("L1.png");
    GreenfootImage L2 = new GreenfootImage("L2.png");
    GreenfootImage R1 = new GreenfootImage("R1.png");
    GreenfootImage R2 = new GreenfootImage("R2.png");
    GreenfootImage F1 = new GreenfootImage("F1.png");
    GreenfootImage F2 = new GreenfootImage("F2.png");
    GreenfootImage Ai = new GreenfootImage("Ai.png");
    GreenfootImage Li = new GreenfootImage("Li.png");
    GreenfootImage Ri = new GreenfootImage("Ri.png");
    public void walk(){ 
       if(Greenfoot.isKeyDown("up")) {
          setImage(A1);
          wander += 1;
          wanderU = 1;
          wanderD = 0;
          wanderR = 0;
          wanderL = 0;
          setLocation(getX(), getY()-2);
          if (wander > 15) {
            setImage(A2);
            wander -= 2;
        }
        if(wander < 5) {
            setImage(A1);
            wander += 2;
        }
        }
       else if(Greenfoot.isKeyDown("right")) {
        setImage(R1);
        move(2);
        wander += 1;
          wanderU = 0;
          wanderD = 0;
          wanderR = 1;
          wanderL = 0;
        if (wander > 15) {
            setImage(R2);
            wander -= 2;
        }
        if(wander < 5) {
            setImage(R1);
            wander += 2;
        }
        }
       else if(Greenfoot.isKeyDown("left")) {
        setImage(L1);
        move(-2);
        wander += 1;
        wanderU = 0;
        wanderD = 0;
        wanderR = 0;
        wanderL = 1;
          if (wander > 15) {
            setImage(L2);
            wander -= 2;
        }
        if(wander <= 1) {
            setImage(L1);
            wander += 2;
        }
        }
       else if(Greenfoot.isKeyDown("down")) {
        setImage(F1);
        wander += 1;
        setLocation(getX(), getY()+2);
        wanderU = 0;
        wanderD = 1;
        wanderR = 0;
        wanderL = 0;
        if (wander > 15) {
            setImage(F2);
            wander -= 2;
        }
        if(wander < 5) {
            setImage(F1);
            wander += 2;
        }
      }
      if (wanderU == 1 && wander > 6 && wander < 14) {
            setImage(Ai);
        }
      if (wanderD == 1 && wander > 5 && wander < 15) {
            setImage(B);
        }
      if (wanderR == 1 && wander > 5 && wander < 15) {
            setImage(Ri);
        }
      if (wanderL == 1 && wander > 5 && wander < 15) {
            setImage(Li);
        }
    }
    public int W1 = 0;
    public int W2 = 0;
    public int W3 = 0;
    public int W4 = 0;
    public int W5 = 1;
    public int W6 = 0;
    public int W7 = 0;
    public int W8 = 0;
    public int W9 = 0;
    public void transition() {
      int  X = getX();
      int Y = getY();
      World currentWorld = this.getWorld();
      World TRA = Areas.TRA;
      World BA = Areas.BA;
      World BRA = Areas.BRA;
      World LA = Areas.LA;
      World RA = Areas.RA;
      World TLA = Areas.TLA;
      World TA = Areas.TA;
      World CA = Areas.CA;
      World BLA = Areas.BLA;
      if (W1 == 1) {
       if (X == 499) {
          currentWorld.removeObject(this);
          TA.addObject(this, 5, Y);
          Greenfoot.setWorld(TA);
          W2 = 1;
          W1 = 0;
        }
       if (X == 0) {
        setLocation(250,Y);
        }
       if (Y == 499) {
        currentWorld.removeObject(this);
        LA.addObject(this, X, 5);
        Greenfoot.setWorld(LA);
        W4 = 1;
        W1 = 0;
        }
       if (Y == 0) {
        setLocation(X,250);
        }
      }
       else if (W2 == 1) {
       if (X == 499) {
          currentWorld.removeObject(this);
          TLA.addObject(this, 5, Y);
          Greenfoot.setWorld(TLA);
          W3 = 1;
          W2 = 0;
        }
       if (X == 0) {
        currentWorld.removeObject(this);
        TRA.addObject(this, 495, Y);
        Greenfoot.setWorld(TRA);
        W1 = 1;
        W2 = 0;
       }
       if (Y == 499) {
        currentWorld.removeObject(this);
        CA.addObject(this, X, 5);
        Greenfoot.setWorld(CA);
        W5 = 1;
        W2 = 0;
       }
       if (Y == 0) {
        setLocation(250,495);
        }
      }
       else if (W3 == 1) {
       if (X == 499) {
          setLocation(5,Y);
        }
       if (X == 0) {
        currentWorld.removeObject(this);
        TA.addObject(this, 495, Y);
        Greenfoot.setWorld(TA);
        W2 = 1;
        W3 = 0;
       }
       if (Y == 499) {
        currentWorld.removeObject(this);
        RA.addObject(this, X, 5);
        Greenfoot.setWorld(RA);
        W6 = 1;
        W3 = 0; 
       }
       if (Y == 0) {
        setLocation(250,495);
        }
      }
       else if (W4 == 1) {
       if (X == 499) {
        currentWorld.removeObject(this);
        CA.addObject(this, 5, Y);
        Greenfoot.setWorld(CA);
        W5 = 1;
        W4 = 0;
        }
       if (X == 0) {
        setLocation(5,Y);
       }
       if (Y == 499) {
        currentWorld.removeObject(this);
        BLA.addObject(this, X, 5);
        Greenfoot.setWorld(BLA);
        W7 = 1;
        W4 = 0; 
       }
       if (Y == 0) {
        currentWorld.removeObject(this);
        TRA.addObject(this, X, 495);
        Greenfoot.setWorld(TRA);
        W1 = 1;
        W4 = 0;
        }
      }
      else if (W5 == 1) {
       if (X == 499) {
          currentWorld.removeObject(this);
          RA.addObject(this, 5, Y);
          Greenfoot.setWorld(RA);
          W6 = 1;
          W5 = 0;
        }
       if (X == 0) {
        currentWorld.removeObject(this);
        LA.addObject(this, 495, Y);
        Greenfoot.setWorld(LA);
        W4 = 1;
        W5 = 0;
        }
       if (Y == 499) {
        currentWorld.removeObject(this);
        BA.addObject(this, X, 5);
        Greenfoot.setWorld(BA);
        W8 = 1;
        W5 = 0;
       }
       if (Y == 0) {
        currentWorld.removeObject(this);
        TA.addObject(this, X, 495);
        Greenfoot.setWorld(TA);
        W2 = 1;
        W5 = 0;
        }
      }
      else if (W6 == 1) {
       if (X == 499) {
          setLocation(5,Y);
        }
       if (X == 0) {
        currentWorld.removeObject(this);
        CA.addObject(this, 495, Y);
        Greenfoot.setWorld(CA);
        W5 = 1;
        W6 = 0;
        }
       if (Y == 499) {
        currentWorld.removeObject(this);
        BRA.addObject(this, X, 5);
        Greenfoot.setWorld(BRA);
        W9 = 1;
        W6 = 0;
        }
       if (Y == 0) {
        currentWorld.removeObject(this);
        TLA.addObject(this, X, 495);
        Greenfoot.setWorld(TLA);
        W3 = 1;
        W6 = 0;
       }
      }
      else if (W7 == 1) {
       if (X == 499) {
        currentWorld.removeObject(this);
        BA.addObject(this, 5, Y);
        Greenfoot.setWorld(BA);
        W8 = 1;
        W7 = 0;
        }
       if (X == 0) {
        setLocation(495,Y);
        }
       if (Y == 499) {
        setLocation(X,5);
        }
       if (Y == 0) {
        currentWorld.removeObject(this);
        LA.addObject(this, X, 495);
        Greenfoot.setWorld(LA);
        W4 = 1;
        W7 = 0;
        }
      }
      else if (W8 == 1) {
       if (X == 499) {
        currentWorld.removeObject(this);
        BRA.addObject(this, 5, Y);
        Greenfoot.setWorld(BRA);
        W9 = 1;
        W8 = 0;
        }
       if (X == 0) {
        currentWorld.removeObject(this);
        BLA.addObject(this, 495, Y);
        Greenfoot.setWorld(BLA);
        W7 = 1;
        W8 = 0;
        }
       if (Y == 499) {
        setLocation(X,5);
        }
       if (Y == 0) {
        currentWorld.removeObject(this);
        CA.addObject(this, X, 495);
        Greenfoot.setWorld(CA);
        W5 = 1;
        W8 = 0;
        }
      }
      else if (W9 == 1) {
       if (X == 499) {
        setLocation(5,Y);
        }
       if (X == 0) {
        currentWorld.removeObject(this);
        BA.addObject(this, 495, Y);
        Greenfoot.setWorld(BA);
        W8 = 1;
        W9 = 0;
        }
       if (Y == 499) {
        setLocation(X,5);
        }
       if (Y == 0) {
        currentWorld.removeObject(this);
        RA.addObject(this, X, 495);
        Greenfoot.setWorld(RA);
        W6 = 1;
        W9 = 0;
        }
      }
    }
   }
