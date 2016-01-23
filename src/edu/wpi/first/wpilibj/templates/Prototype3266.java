/*
Ignore this this just names the package that contains the templates were using 
along with our code.
*/

package edu.wpi.first.wpilibj.templates;

/*
Ignore these, these are templates that will be imported.
*/

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive; 
import edu.wpi.first.wpilibj.SimpleRobot; 
import edu.wpi.first.wpilibj.Timer;

/*
Ignore this as well this just allows us to use the simplerobot template along 
with our custom code.
*/

public class Prototype3266 extends SimpleRobot
        
/*
        This is a list of all objects that will be used in the code motors,
        joysticks, cameras, gyros, etc.  
        */
        
{ RobotDrive drive;
    Joystick leftStick = new Joystick(1);
    Joystick rightStick = new Joystick(2);
    

    /*
    Here Prototype 3266 is the name of our project
    */
    
    public Prototype3266()
            
/* (1) represents PWM Port 1, Thus (2) represents PWM Port 2, (3) is port 3 and 
            finialy (4) is port 4 after that RobotDrive is 
            obviosly the drivetrain name.
    */            
            
 {this.drive = new RobotDrive(0, 2, 1, 3);
    }
    
 /**
     * This is where the robot is pre-programmed to preform a certain move 
     * without any driver control.
     */

    public void autonomous() {
        
    }

    /**
     * This is where the driver has full control.
     */
    
    public void operatorControl() {
while (true && isOperatorControl() && isEnabled()) // loop until change
    
    /*
    Here we are defining what tank drive does.
    */
    
    {drive.tankDrive(leftStick, rightStick); // drive with joysticks
            Timer.delay(0.005); 
    }
    }
};
