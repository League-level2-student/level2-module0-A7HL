package arrays;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	public static void main(String[] args) {
		//800 x 600
		Robot[] robs = new Robot[5];
		for(int i =0;i<robs.length;i++) {

			robs[i] =new Robot();
			robs[i].penDown();
			robs[i].moveTo(250,300);
			robs[i].setSpeed(50);
			
			
			
		}
		
		
		boolean b = true;
		
		while(b) {
			ROBS:for(int j =0;j<robs.length;j++) {
				int ran = (int)(Math.random()*50);
				
				
				for(int k = 1;k<ran;k++) {
				
					robs[j].move(1);
					robs[j].turn(1);
					
					//&&robs[j].getY()<301&&robs[j].getY()>298
					if(robs[j].getX()==250&&robs[j].getY()==300) {
						b = false;
						break ROBS;
					}
				}
			
			}
		}
		JOptionPane.showMessageDialog(null, "WINNER!");
	}
	//1. make a main method
	
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
