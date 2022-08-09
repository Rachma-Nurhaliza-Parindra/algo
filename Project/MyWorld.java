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
        super(800, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Roket roket = new Roket();
        addObject(roket,87,203);
        Object object = new Object();
        addObject(object,228,150);
        Object object2 = new Object();
        addObject(object2,380,98);
        Object object3 = new Object();
        addObject(object3,313,308);
        Object object4 = new Object();
        addObject(object4,484,221);
        Object object5 = new Object();
        addObject(object5,395,374);
        Object object6 = new Object();
        addObject(object6,133,352);
        Object object7 = new Object();
        addObject(object7,617,329);
        Object object8 = new Object();
        addObject(object8,621,142);
        Object object9 = new Object();
        addObject(object9,649,517);
        Object object10 = new Object();
        addObject(object10,239,491);
        Object object11 = new Object();
        addObject(object11,479,461);
        Object object12 = new Object();
        addObject(object12,539,65);
        Object object13 = new Object();
        addObject(object13,90,75);
        Object object14 = new Object();
        addObject(object14,117,486);
        Object object15 = new Object();
        addObject(object15,675,246);
        Object object16 = new Object();
        addObject(object16,693,75);
        object13.setLocation(82,72);
    }
}
