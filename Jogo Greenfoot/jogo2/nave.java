import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave extends Actor
{
    /**
     * Act - do whatever the nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.isKeyDown("right")){
            turn(3);
        } else if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        
        if (Greenfoot.isKeyDown("up")){
            move(4);
        } else if (Greenfoot.isKeyDown("down")) {
            move(-4);
        }
        
        if (Greenfoot.isKeyDown("space")) {
            bola b1 = new bola();
            getWorld().addObject(b1, this.getX(), this.getY());
            b1.move(10);
        }
        
        if (isAtEdge()){
            turn(5);
        }
        
        
        
    }
}
