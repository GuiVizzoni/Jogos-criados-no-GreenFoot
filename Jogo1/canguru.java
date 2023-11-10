import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class canguru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class canguru extends Actor
{
    /**
     * Act - do whatever the canguru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(3);
        if(Greenfoot.isKeyDown("left")){
            turn(-2);
        } else if (Greenfoot.isKeyDown("right")){
                turn(2);
            }
            myRemove();
        }
        public void myRemove(){
            
            if(isTouching(borboleta.class)){
                removeTouching(borboleta.class);
                //cont = cont+1;
            }
        }
    }

