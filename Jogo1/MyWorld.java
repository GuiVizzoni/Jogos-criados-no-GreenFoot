import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        borboleta borboleta = new borboleta();
        addObject(borboleta,91,89);
        borboleta.setLocation(134,78);
        borboleta borboleta2 = new borboleta();
        addObject(borboleta2,132,168);
        borboleta borboleta3 = new borboleta();
        addObject(borboleta3,133,287);
        borboleta borboleta4 = new borboleta();
        addObject(borboleta4,135,364);
        borboleta3.setLocation(142,260);
        borboleta4.setLocation(143,332);
        borboleta.setLocation(119,80);
        borboleta borboleta5 = new borboleta();
        addObject(borboleta5, 109,234);
        borboleta5.setLocation(140,120);
        borboleta5.setLocation(212,75);
        canguru canguru = new canguru();
        addObject(canguru,457,104);
    }

   public void act(){
       
    }
    
}
