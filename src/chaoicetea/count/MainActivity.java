package chaoicetea.count;

//import android.R;
//import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (getIntent().getBooleanExtra("EXIT", false)) 
		{
		        finish();
		}
		
		//settext on form
		EditText crew = (EditText) findViewById(R.id.crew_input);
		crew.setText("Name", TextView.BufferType.EDITABLE);
		
		EditText place = (EditText) findViewById(R.id.lokasi_input);
		place.setText("Place", TextView.BufferType.EDITABLE);
	}

	//@Override
	//public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.main, menu);
	//	return true;
	//}

	public void loginOnClicked (View view) {
		//gettext, store to variable
		EditText crew_text = (EditText) findViewById(R.id.crew_input);
		String crew = crew_text.getText().toString();
		
		EditText lokasi_text = (EditText) findViewById(R.id.lokasi_input);
		String lokasi = lokasi_text.getText().toString();
		
		//change activity
        Intent intent = new Intent(this, CountActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("crew", crew);
        intent.putExtra("lokasi", lokasi);
        startActivity(intent);
	}
	public void exit_app (View view) {
		finish();
	
		
	}
}

