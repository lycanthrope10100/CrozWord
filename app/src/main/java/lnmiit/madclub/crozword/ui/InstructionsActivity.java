package lnmiit.madclub.crozword.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import lnmiit.madclub.crozword.R;

/**
 * The activity that explains how to play the game.
 *
 * @author Abhimanyu Singhal
 */
public class InstructionsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_instructions);
	}

}
