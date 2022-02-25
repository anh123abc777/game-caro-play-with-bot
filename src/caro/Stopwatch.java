
package caro;
//*********************************************
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class Stopwatch {
        private Play play;
        private boolean delay;
        private int timeDelay =0;
	private String anti_Player= new String();
        private Color color;
	static int interval; 
        static int noneLimitedTime=-1;
        int timeLimit=0;
	int elapsedTime = 1;
	int hours = 0;
	int minutes = 0;
	int seconds = 0;
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	Timer timer ;
	Stopwatch(JLabel timeLabel, int timeLimit, Play play){
                this.timeLimit=timeLimit;
                this.play=play;
                if(timeLimit==-1){
                    timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
                }
                else{
                elapsedTime=timeLimit*1000;
		hours = (elapsedTime/3600000);
		minutes = (elapsedTime/60000) % 60;
		seconds = (elapsedTime/1000) % 60;
                }
		timer = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (timeLimit!=noneLimitedTime){
			elapsedTime=elapsedTime-1000;
			hours = (elapsedTime/3600000);
			minutes = (elapsedTime/60000) % 60;
			seconds = (elapsedTime/1000) % 60;
			seconds_string = String.format("%02d", seconds);
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
                        if (elapsedTime==0){
                            timer.stop();
                            new End(anti_Player,true,true,color).setVisible(true);
                        }
                        if(delay){
                            timeDelay++;                 
                            if(timeDelay==1){
                                play.mayDanh();
                                if(play.isWin(play.getPlayer())){
                                    play.resetTimeLimit(true);
                                }
                           }
                        }
                    }       
		}		
	});                          
            timer.start();
            timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);     
                
        }	
	
        public void setInfoPlayer(String anti_Player,Color color){
                this.anti_Player= new String(anti_Player);
                this.color = color;
        }
        public void setTimeLimit(int timeLimit){
            this.timeLimit=timeLimit;
        }
        public int getTimeLimit(){
            return timeLimit;
        }
        
	void stop() {
		timer.stop();
	}	
	void reset(JLabel timeLabel,boolean delay) {
            if(timeLimit!=noneLimitedTime){
		timer.stop();
		elapsedTime= timeLimit*1000;
		hours = (elapsedTime/3600000);
                minutes = (elapsedTime/60000) % 60;
		seconds = (elapsedTime/1000) % 60;
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
                timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
                this.delay=delay;
                timeDelay=0;
            }
	}




}// *************************************************