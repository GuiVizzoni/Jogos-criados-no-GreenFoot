import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tiro extends Actor
{
    /**
     * Act - do whatever the tiro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void turn()
    {
        turn(90);
    }
    
    public void turn(int angle)
    {
    setRotation(getRotation() + angle);
    }
    
}
