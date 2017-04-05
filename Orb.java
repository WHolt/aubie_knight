import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
     public int W1 = 0;
    public int W2 = 0;
    public int W3 = 0;
    public int W4 = 0;
    public int W5 = 1;
    public int W6 = 0;
    public int W7 = 0;
    public int W8 = 0;
    public int W9 = 0;
    /**
     * Act - do whatever the Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     transition();
    }
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
