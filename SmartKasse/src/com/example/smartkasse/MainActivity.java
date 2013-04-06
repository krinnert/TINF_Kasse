package com.example.smartkasse;

import android.os.Bundle;
import android.widget.Toast;


import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.lib.SlidingMenu;
import com.slidingmenu.lib.app.SlidingActivity;
//Reward Testing
public class MainActivity extends SlidingActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setBehindContentView(R.layout.behind_layout);
        
        
        
        SlidingMenu slidingMenu = getSlidingMenu();
        ActionBar actionBar = getSupportActionBar();
        
        //SlidingMenu einrichten
        slidingMenu.setBehindWidth(330);
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.setTouchModeBehind(SlidingMenu.TOUCHMODE_FULLSCREEN);
        
        //ActionBar einrichten
        actionBar.setHomeButtonEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()) {
			case R.id.action_settings:
			Toast.makeText(this, "Settings gedr�ckt", Toast.LENGTH_SHORT).show();
			break;
			case android.R.id.home:
			toggle();
			break;
		
			default:
			super.onOptionsItemSelected(item);
			break;
		}
    	return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
