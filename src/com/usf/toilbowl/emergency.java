package com.usf.toilbowl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class emergency extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency);
        
        
        
        
        
		final ProgressBar progressbar = (ProgressBar) findViewById(R.id.progressBar1);
		final TextView text3 = (TextView) findViewById(R.id.textView3);
		final TextView text6 = (TextView) findViewById(R.id.textView6);
		final TextView text5 = (TextView) findViewById(R.id.textView5);
		final TextView text4 = (TextView) findViewById(R.id.textView4);
		final TextView text7 = (TextView) findViewById(R.id.textView7);
		final ImageView image1 = (ImageView) findViewById(R.id.imageView1);

		text3.setVisibility(View.GONE);
		text6.setVisibility(View.GONE);
		text5.setVisibility(View.GONE);
		text4.setVisibility(View.GONE);
		text7.setVisibility(View.GONE);
		image1.setVisibility(View.GONE);
		
		
		new CountDownTimer(3000, 1000) {	//will count down from 7000 milliseconds (7 seconds) in increments of 1 second
			@Override
			public void onFinish() {
				// TODO Auto-generated method stub
				progressbar.setVisibility(View.GONE);		//once count down has finished, remove the number "0" from screen
				text3.setVisibility(View.VISIBLE);
				text6.setVisibility(View.VISIBLE);
				text5.setVisibility(View.VISIBLE);
				text4.setVisibility(View.VISIBLE);
				text7.setVisibility(View.VISIBLE);
				image1.setVisibility(View.VISIBLE);
			}

			@Override
			public void onTick(long arg0) {
				// TODO Auto-generated method stub
				
			}

		}.start();	//start the timer
        
        
        
        
        
        
    }
}