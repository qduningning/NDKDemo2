package com.znn.ndkdemo2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView txtTextView;
	private Button button;
	
	public native String Hello();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtTextView = (TextView) findViewById(R.id.txt);
		button = (Button) findViewById(R.id.btn);
		
	}

}
