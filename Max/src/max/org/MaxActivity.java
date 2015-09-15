package max.org;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.LinearLayout;

@SuppressWarnings("deprecation")
public class MaxActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		LinearLayout a = (LinearLayout) findViewById(R.id.List);
		Button David = new Button(a.getContext());
		David.setTextColor(Color.RED);
		David.setText("David");
		a.addView(David);
		Button Mher = (Button) findViewById(R.id.Mher);
		Button clear = (Button) findViewById(R.id.clear);
		final EditText David_T = new EditText(a.getContext());
		David_T.setHeight(100);
		a.addView(David_T);
		David.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				David_T.setText(David_T.getText() + "DavidMher");
				// TODO Auto-generated method stub
			}
		});

		final EditText Mher_T = (EditText) findViewById(R.id.Mher_TEXT);
		Mher.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Mher_T.setText(Mher_T.getText() + "MherDavid");

				// TODO Auto-generated method stub
			}
		});

		clear.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Mher_T.setText("");
			}
		});
		DigitalClock Clock_D = (DigitalClock) findViewById(R.id.Clock_D);
		Clock_D.setBackgroundColor(Color.GREEN);
		Clock_D.setSoundEffectsEnabled(true);
		Clock_D.setTextColor(Color.BLUE);
		Clock_D.setTextSize(60);
	}
}