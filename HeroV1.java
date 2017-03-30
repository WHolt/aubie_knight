import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroV1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroV1 extends Actor
{
    /**
     * Act - do whatever the HeroV1 wants to do. This method is called whenever
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
    public void transition() {
      int  X = getX();
      int Y = getY();
      World newWorld;
      World currentWorld = this.getWorld();
      Actor tr = getOneIntersectingObject(Tree.class);
      if (X == 499 && tr != null) {
          currentWorld.removeObject(this);
          newWorld = Areas.RA;
          newWorld.addObject(this, X, Y);
          Greenfoot.setWorld(newWorld);
        }
      if (X == 0) {
        setLocation(500,Y);
        }
      if (Y == 499) {
          setLocation(X,0);
        }
      if (Y == 0) {
        setLocation(X,500);
        }
    }
      public void moveArea() {
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
        if (currentWorld == CA) {
       if (X == 499) {
          currentWorld.removeObject(this);
          RA.addObject(this, 5, Y);
          Greenfoot.setWorld(RA);
        }
       if (X == 0) {
        setLocation(500,Y);
        }
       if (Y == 499) {
          setLocation(X,0);
        }
       if (Y == 0) {
        setLocation(X,500);
        }
      }
    }
}
