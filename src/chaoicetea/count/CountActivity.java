package chaoicetea.count;

//import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;

//gesture




public class CountActivity extends Activity{
	
	
	//declare variables
	String crew = "";
	String lokasi = "";
	Integer x = 0;
	Integer x_0 = 0;
	Integer x_1 = 0;
	Integer x_2 = 0;
	Integer x_3 = 0;
	Integer x_4 = 0;
	Integer x_5 = 0;
	Integer x_6 = 0;
	Integer x_7 = 0;
	Integer x_8 = 0;
	
	//disable back button
	@Override
	public void onBackPressed() {
	}
	
	//option menu handler
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.resetcounter:
        	AlertDialog resetDialog = new AlertDialog.Builder(CountActivity.this).create(); //Read Update
            //resetDialog.setTitle("Hey, Dude...");
            resetDialog.setMessage("Are you sure?");
            resetDialog.setButton( Dialog.BUTTON_POSITIVE, "Reset", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
            	   x_0 = 0;
               	x_1 = 0;
               	x_2 = 0;
               	x_3 = 0;
               	x_4 = 0;
               	x_5 = 0;
               	x_6 = 0;
               	x_7 = 0;
               	x_8 = 0;
               	
               	TextView count0x = (TextView) findViewById(R.id.count_0_text);
               	TextView count1x = (TextView) findViewById(R.id.count_1_text);
               	TextView count2x = (TextView) findViewById(R.id.count_2_text);
               	TextView count3x = (TextView) findViewById(R.id.count_3_text);
               	TextView count4x = (TextView) findViewById(R.id.count_4_text);
               	TextView count5x = (TextView) findViewById(R.id.count_5_text);
               	TextView count6x = (TextView) findViewById(R.id.count_6_text);
               	TextView count7x = (TextView) findViewById(R.id.count_7_text);
               	TextView count8x = (TextView) findViewById(R.id.count_8_text);
           		
           		count0x.setText(x.toString());
           		count1x.setText(x.toString());
           		count2x.setText(x.toString());
           		count3x.setText(x.toString());
           		count4x.setText(x.toString());
           		count5x.setText(x.toString());
           		count6x.setText(x.toString());
           		count7x.setText(x.toString());
           		count8x.setText(x.toString());
            	   
               
               }
               });

            resetDialog.setButton( Dialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener()    {
              public void onClick(DialogInterface dialog, int which) {
              }
              });

            resetDialog.show();  //<-- See This!
        
                  	
                	

        	
        return true;
        case R.id.report:
        	//change activity
            Intent intent2report = new Intent(this, ReportActivity.class);
            //EditText editText = (EditText) findViewById(R.id.edit_message);
            //String message = editText.getText().toString();
            intent2report.putExtra("x_0", x_0);
            intent2report.putExtra("x_1", x_1);
            intent2report.putExtra("x_2", x_2);
            intent2report.putExtra("x_3", x_3);
            intent2report.putExtra("x_4", x_4);
            intent2report.putExtra("x_5", x_5);
            intent2report.putExtra("x_6", x_6);
            intent2report.putExtra("x_7", x_7);
            intent2report.putExtra("x_8", x_8);
            intent2report.putExtra("crew", crew);
            intent2report.putExtra("lokasi", lokasi);
            startActivity(intent2report);

        return true;

        default:
        return super.onOptionsItemSelected(item);
        }
    }
	
	
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		setContentView(R.layout.activity_count);
		
		//ambil variabel nama crew dan lokasi dari main activity
		Bundle extras = getIntent().getExtras();
		crew = extras.getString("crew");
		lokasi = extras.getString("lokasi");
		
		//tekan lama untuk minus 1
		Button button0minus = (Button) findViewById(R.id.Button0);
		button0minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count0x = (TextView) findViewById(R.id.count_0_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_0 = x_0 - 1;
		    		count0x.setText(x_0.toString());
		            return true;
		        }
		    });
		
		Button button1minus = (Button) findViewById(R.id.Button1);
		button1minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count1x = (TextView) findViewById(R.id.count_1_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_1 = x_1 - 1;
		    		count1x.setText(x_1.toString());
		            return true;
		        }
		    });
		Button button2minus = (Button) findViewById(R.id.Button2);
		button2minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count2x = (TextView) findViewById(R.id.count_2_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_2 = x_2 - 1;
		    		count2x.setText(x_2.toString());
		            return true;
		        }
		    });
		Button button3minus = (Button) findViewById(R.id.Button3);
		button3minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count3x = (TextView) findViewById(R.id.count_3_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_3 = x_3 - 1;
		    		count3x.setText(x_3.toString());
		            return true;
		        }
		    });
		Button button4minus = (Button) findViewById(R.id.Button4);
		button4minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count4x = (TextView) findViewById(R.id.count_4_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_4 = x_4 - 1;
		    		count4x.setText(x_4.toString());
		            return true;
		        }
		    });
		Button button5minus = (Button) findViewById(R.id.Button5);
		button5minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count5x = (TextView) findViewById(R.id.count_5_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_5 = x_5 - 1;
		    		count5x.setText(x_5.toString());
		            return true;
		        }
		    });
		Button button6minus = (Button) findViewById(R.id.Button6);
		button6minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count6x = (TextView) findViewById(R.id.count_6_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_6 = x_6 - 1;
		    		count6x.setText(x_6.toString());
		            return true;
		        }
		    });
		Button button7minus = (Button) findViewById(R.id.Button7);
		button7minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count7x = (TextView) findViewById(R.id.count_7_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_7 = x_7 - 1;
		    		count7x.setText(x_7.toString());
		            return true;
		        }
		    });
		Button button8minus = (Button) findViewById(R.id.Button8);
		button8minus.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		TextView count8x = (TextView) findViewById(R.id.count_8_text);
		    		//y = Integer.valueOf(R.id.count0);
		    		x_8 = x_8 - 1;
		    		count8x.setText(x_8.toString());
		            return true;
		        }
		    });
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.count, menu);
		return true;
	}

	public void button0_onclicked (View view) {
		TextView count0x = (TextView) findViewById(R.id.count_0_text);
		//y = Integer.valueOf(R.id.count0);
		x_0 = x_0 + 1;
		count0x.setText(x_0.toString());
	}
	public void button1_onclicked (View view) {
		TextView count1x = (TextView) findViewById(R.id.count_1_text);
		//y = Integer.valueOf(R.id.count0);
		x_1 = x_1 + 1;
		count1x.setText(x_1.toString());
	}
	public void button2_onclicked (View view) {
		TextView count2x = (TextView) findViewById(R.id.count_2_text);
		//y = Integer.valueOf(R.id.count0);
		x_2 = x_2 + 1;
		count2x.setText(x_2.toString());
	}
	public void button3_onclicked (View view) {
		TextView count0x = (TextView) findViewById(R.id.count_3_text);
		//y = Integer.valueOf(R.id.count0);
		x_3 = x_3 + 1;
		count0x.setText(x_3.toString());
	}
	public void button4_onclicked (View view) {
		TextView count4x = (TextView) findViewById(R.id.count_4_text);
		//y = Integer.valueOf(R.id.count0);
		x_4 = x_4 + 1;
		count4x.setText(x_4.toString());
	}
	public void button5_onclicked (View view) {
		TextView count5x = (TextView) findViewById(R.id.count_5_text);
		//y = Integer.valueOf(R.id.count0);
		x_5 = x_5 + 1;
		count5x.setText(x_5.toString());
	}
	public void button6_onclicked (View view) {
		TextView count6x = (TextView) findViewById(R.id.count_6_text);
		//y = Integer.valueOf(R.id.count0);
		x_6 = x_6 + 1;
		count6x.setText(x_6.toString());
	}
	public void button7_onclicked (View view) {
		TextView count7x = (TextView) findViewById(R.id.count_7_text);
		//y = Integer.valueOf(R.id.count0);
		x_7 = x_7 + 1;
		count7x.setText(x_7.toString());
	}
	public void button8_onclicked (View view) {
		TextView count8x = (TextView) findViewById(R.id.count_8_text);
		//y = Integer.valueOf(R.id.count0);
		x_8 = x_8 + 1;
		count8x.setText(x_8.toString());
	}
	public void button0_minus (View view) {
		TextView count0x = (TextView) findViewById(R.id.count_0_text);
		//y = Integer.valueOf(R.id.count0);
		x_0 = x_0 - 1;
		count0x.setText(x_0.toString());
	}
	
	{
		
	}

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	
	}

	
	
	

}
