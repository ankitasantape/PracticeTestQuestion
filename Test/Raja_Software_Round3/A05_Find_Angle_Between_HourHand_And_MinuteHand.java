/*
5)find the angle between hr hand and min hand of a clock
e.g int CalculateAngle(int hr_hand, int min_hand){}

This problem is known as Clock angle problem where we need to find angle between hands of an analog clock at a given time.
Examples: 

Input:  
h = 12:00
m = 30.00
Output: 
165 degree

Input:  
h = 3.00
m = 30.00
Output: 
75 degree

The idea is to take 12:00 (h = 12, m = 0) as a reference. Following are detailed steps.

1. Calculate the angle made by hour hand with respect to 12:00 in h hours and m minutes. 
2. Calculate the angle made by minute hand with respect to 12:00 in h hours and m minutes. 
3. The difference between the two angles is the angle between the two hands.

How to calculate the two angles with respect to 12:00? 
The minute hand moves 360 degrees in 60 minute(or 6 degrees in one minute) and hour hand moves 360 degrees in 12 hours(or 0.5 degrees in 1 minute). In h hours and m minutes, the minute hand would move (h*60 + m)*6 and hour hand would move (h*60 + m)*0.5.
*/

package Raja_Software_Round3;

public class A05_Find_Angle_Between_HourHand_And_MinuteHand {

	public static void main(String[] args) {
		int hr_hand = 12;
		int min_hand = 23;
		int angle = CalculateAngle(hr_hand, min_hand);
		System.out.println(angle + " degree");
	}

	public static int CalculateAngle(int hr_hand, int min_hand) {
		if(hr_hand < 0 || min_hand < 0 || hr_hand > 12 || min_hand > 60) {
			System.out.println("Wrong input");
		}
		if(hr_hand == 12) {
			hr_hand = 0;
		}
		if(min_hand == 60) {
			hr_hand += 1;
			min_hand = 0;
			if( hr_hand > 12 ) {
				hr_hand = hr_hand - 12;
			}
		}
		int hr_angle = (int) (0.5 * hr_hand * 60 + min_hand);
		int min_angle = (int) (min_hand * 6);
//		System.out.println(hr_angle + " " + min_angle);
		int angle = Math.abs(min_angle - hr_angle);
		angle = Math.min(360 - angle, angle);
		return angle;
	}
}
