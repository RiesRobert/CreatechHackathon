package com.usf.toilbowl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class num2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num2);
        
		final ProgressBar progressbar = (ProgressBar) findViewById(R.id.progressBar1);
       
		new CountDownTimer(3000, 1000) {	//will count down from 7000 milliseconds (7 seconds) in increments of 1 second
			@Override
			public void onFinish() {
				// TODO Auto-generated method stub
				progressbar.setVisibility(View.GONE);		//once count down has finished, remove the number "0" from screen
			}

			@Override
			public void onTick(long arg0) {
				// TODO Auto-generated method stub
				
			}

		}.start();	//start the timer
        
        
        
        
        
        
    }
}