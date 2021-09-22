import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
      World world = new World(300,300);
      Turtle builder = new Turtle(50, 200, world);

      // define constants for heights and widths to use
      final int houseSideInPixels = 100;
      final int windowSideInPixels = 25;
      final int doorWidthInPixels = 30;
      final int doorHeightInPixels = 45;

      // define colors to use
      final Color lightBlue = new Color(0x00, 0xa2, 0xe8);
      final Color purple = new Color(0xa3, 0x49, 0xa4);

      // set a wider pen width for house
      builder.setPenWidth(3);

      // draw main box for house
      builder.setColor(Color.black);
      builder.forward(houseSideInPixels);
      builder.turnRight();
      builder.forward(houseSideInPixels);
      builder.turnRight();
      builder.forward(houseSideInPixels);
      builder.turnRight();
      builder.forward(houseSideInPixels);

      // draw window 1
      builder.penUp();
      builder.moveTo(60, 140);
      builder.setHeading(0);
      builder.penDown();
      builder.setColor(lightBlue);
      builder.forward(windowSideInPixels);
      builder.turnRight();
      builder.forward(windowSideInPixels);
      builder.turnRight();
      builder.forward(windowSideInPixels);
      builder.turnRight();
      builder.forward(windowSideInPixels);

      // draw window 2
      builder.penUp();
      builder.moveTo(115, 140);
      builder.setHeading(0);
      builder.penDown();
      builder.setColor(lightBlue);
      builder.forward(windowSideInPixels);
      builder.turnRight();
      builder.forward(windowSideInPixels);
      builder.turnRight();
      builder.forward(windowSideInPixels);
      builder.turnRight();
      builder.forward(windowSideInPixels);

      // draw door
      builder.penUp();
      builder.moveTo(85, 198);
      builder.setHeading(0);
      builder.penDown();
      builder.setColor(purple);
      builder.forward(doorHeightInPixels);
      builder.turnRight();
      builder.forward(doorWidthInPixels);
      builder.turnRight();
      builder.forward(doorHeightInPixels);
      builder.turnRight();
      builder.forward(doorWidthInPixels);

      // draw roof
      builder.penUp();
      builder.moveTo(51, 97);
      builder.setHeading(0);
      builder.penDown();
      builder.setColor(Color.red);
      builder.turn(30);
      builder.forward(houseSideInPixels);
      builder.turn(120);
      builder.forward(houseSideInPixels);
      builder.turn(120);
      builder.forward(houseSideInPixels);

      // let's hide the turtle so we only see house
      builder.hide();

      world.show(true);
  }
}
