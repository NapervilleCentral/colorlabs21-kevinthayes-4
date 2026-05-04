
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;//the color class in awt lib
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17_2
{
    //Picture apic = new Picture("images\\starwars.jpg");
    //Picture canvas = new Picture("images\\canvas.jpg");

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /*
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();*/

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");

     //Know it, Love it, Live it!!!!!!!!!!!!!!!!!
     //relative path            dir/folder/file
     Picture apic = new Picture("images\\starwars.jpg");
     Picture canvas = new Picture("images\\canvas.jpg");
     //Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture moto = new Picture("images/redMotorcycle.jpg");
     //Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
     
     
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture apic = new Picture("images\\beach.jpg");


     mirrorVertical(apic);
     apic.explore();//!!!!!!!!!!!displays the pic
     copytoCanvas(apic,canvas);
     canvas.explore();
     //ferris1.explore();
     //moto.explore();
    

     //to change color of pic get all of the pixels!!!!!!!!!
     //makes an array of pixels
     //Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     //pixels = ferris1.getPixels();
     
     
     //Pixel[] mpixels;
     //mpixels = moto.getPixels();

     //how many pixels or how large array
    //System.out.println("This is a large array"+pixels.length  );


    /*
    //access each index,array note
    System.out.println(pixels[17]);
    //access each pixel pic.methos.getPixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel spot2 = ferris1.getPixel(433,283);
    Pixel ferr17 = pixels[17];
    
    ferr17.setRed(240);
    ferr17.setGreen(160);
    ferr17.setBlue(200);
    
    Color newColor = new Color(255,99,71);
    spot2.setColor(Color.blue);
    
    spot.setColor(newColor);
    
    
    ferris1.explore();
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);

    for(int i =0; i<5000; i++)
    {
        Pixel yuck = ferris1.getPixel((int)(Math.random()*600), (int)(Math.random()*+600));
        yuck.setColor(Color.green);
    }
    ferris1.explore();

    
    
    
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    int red;
    for (Pixel spot1 : mpixels){
        //System.out.println( spot1 );
        red = spot1.getRed();
        
        red = (int)(red * .25);
        
        spot1.setRed(red);
        
        
        
    }
    moto.explore();
    
    int blue,green;
    for (Pixel spot1 : mpixels){
        //System.out.println( spot1 );
        blue= spot1.getBlue();
        green = spot1.getGreen();
        
        blue = (int)(blue * Math.random());
        green = (int)(green * Math.random());
        
        spot1.setBlue(blue);
        spot1.setGreen(green);
        
        
        
    }
    //moto.explore();
    
    
    
    
    
    
    
    



 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value


        }
    ferris1.explore();

/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%

        //set the red value of the current pixel to the new value


    }
    // use new picture when changing or it will make changes to
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");

    /**/
  }//main
  
  /**
   * Mehod to mirror abound a vertica line in the middle
   * of the picture based on the width
   */
  public static void mirrorVertical(Picture apic)
  {
      int width = apic.getWidth();
      int mirrorPoint = width/2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop throught all the rows
      for(int y = 0; y < apic.getHeight();y++)
      {      
      //loop form 0 to the middle (mirror point)
          for (int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = apic.getPixel(x,y);
              rightPixel = apic.getPixel(width -1 -x,y);
              rightPixel.setColor(leftPixel.getColor());
            }
      
      }
    }
    /**
     * add two ints to params and place you want target to go onto the canvas
     */
    public static void copytoCanvas(Picture source, Picture target)
    {
        Pixel sourcePix = null;
        Pixel targetPix = null;
        
        //loop thru the columns (targetX is starting point on Canvas)
        for (int sourceX = 0,targetX = 0;sourceX < source.getWidth(); sourceX++, targetX++)
        {
            //loop thru the rows
            for (int sourceY = 0,targetY = 0;sourceY < source.getHeight(); sourceY++, targetY++)
            {
                sourcePix = source.getPixel(sourceX,sourceY);
                targetPix = target.getPixel(targetX,targetY);
                targetPix.setColor(sourcePix.getColor());
            }
            
        }
        
    }
  
  
  
  
  
  
  
  
  
  
  
}//class
