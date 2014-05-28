package com.sunmiyo.lockscreen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class Lock extends Activity {
	private static int toastHasBeenShown = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_lock);
		if(toastHasBeenShown == 0) {
			Toast.makeText(getApplicationContext(), "LockScreen be gone" , Toast.LENGTH_SHORT).show();
		} else if(toastHasBeenShown == 1) {
			Toast.makeText(getApplicationContext(), "by littlegreenishrobot" , Toast.LENGTH_SHORT).show();
		}
		
		toastHasBeenShown++;
		
		this.finish();
//		this.setVisible(false);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lock, menu);
		return true;
	}

}
