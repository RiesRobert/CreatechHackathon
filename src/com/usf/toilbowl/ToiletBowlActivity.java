package com.usf.toilbowl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletBowlActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        
        
        
		final Button button1 = (Button) findViewById(R.id.button1);		//same code as above but for button3 (help section)
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity((new Intent(getBaseContext(),
						num1.class)));

			}
		});
		
		final Button button2 = (Button) findViewById(R.id.button2);		//same code as above but for button3 (help section)
		button2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity((new Intent(getBaseContext(),
						num2.class)));

			}
		});
			
		final Button button3 = (Button) findViewById(R.id.button3);		//same code as above but for button3 (help section)
		button3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity((new Intent(getBaseContext(),
						emergency.class)));

			}
		});
		
		
		
		};
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
