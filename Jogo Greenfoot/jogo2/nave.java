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
    private SimpleTimer timer = new SimpleTimer();
    
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
        
        if (timer.millisElapsed() > 400 && Greenfoot.isKeyDown("space")) {
            bola b1 = new bola();
            getWorld().addObject(b1, this.getX(), this.getY());
            //tiro
            b1.setRotation(this.getRotation());
            timer.mark();
        }
        
        if (isAtEdge()){
            turn(5);
        }
        
        
        
    }
}
