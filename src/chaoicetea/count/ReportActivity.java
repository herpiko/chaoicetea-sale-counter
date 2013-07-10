package chaoicetea.count;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;

public class ReportActivity extends Activity {

	//private static class reportlogsOpenHelper extends  SQLiteOpenHelper {
	//	reportlogsOpenHelper(Context context){
	//	super(context, "chao_count.db", null, 1);
	//	}
	//	public void onCreate(SQLiteDatabase database){
	//		database.execSQL(
	//		"create table reportlogs " + 
	//		"(id integer primary key, name text, place text, date text, jumlah_0 integer, jumlah_1 integer, jumlah_2 integer, jumlah_3 integer, jumlah_4 integer, jumlah_5 integer, jumlah_6 integer, jumlah_7 integer, jumlah_8 integer)"
	//		);
//		}
//		public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion){
//			
//		}
//	}
	
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
	Integer t_0 = 0;
	Integer t_1 = 0;
	Integer t_2 = 0;
	Integer t_3 = 0;
	Integer t_4 = 0;
	Integer t_5 = 0;
	Integer t_6 = 0;
	Integer t_7 = 0;
	Integer t_8 = 0;
	Integer t_penjualan = 0;
	Integer harga25 = 2500;
	Integer harga3 = 3000;
	Integer harga35 = 3500;
	Integer harga4 = 4000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_report);
		
		//sqlite
		//reportlogsOpenHelper openHelper = new reportlogsOpenHelper(this);
		
		//get extras data from count.activity
		Bundle extras = getIntent().getExtras();
		x_0 = extras.getInt("x_0");
		x_1 = extras.getInt("x_1");
		x_2 = extras.getInt("x_2");
		x_3 = extras.getInt("x_3");
		x_4 = extras.getInt("x_4");
		x_5 = extras.getInt("x_5");
		x_6 = extras.getInt("x_6");
		x_7 = extras.getInt("x_7");
		x_8 = extras.getInt("x_8");
		crew = extras.getString("crew");
		lokasi = extras.getString("lokasi");
		

		String crew_lokasi = "Crew : " + crew + " @ " + lokasi;
		
		//SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss", Locale.US);
		//String setjam =  sdfTime.format(new Date(System.currentTimeMillis()));
		
		SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
		String settanggal =  sdfDate.format(new Date(System.currentTimeMillis()));
		
		//set variable nama crew dan lokasi to textview
		TextView report_crew_text = (TextView) findViewById(R.id.report_crew_text);
		report_crew_text.setText(crew_lokasi.toString());
		
						
		//set variabel waktu
		settanggal = "Date : " + settanggal;
		TextView report_waktu = (TextView) findViewById(R.id.report_waktu);
		report_waktu.setText(settanggal.toString());
		
		//hitung harga
		t_0 = x_0 * harga25;
		t_1 = x_1 * harga3;
		t_2 = x_2 * harga3;
		t_3 = x_3 * harga35;
		t_4 = x_4 * harga35;
		t_5 = x_5 * harga35;
		t_6 = x_6 * harga35;
		t_7 = x_7 * harga4;
		t_8 = x_8 * harga4;
		t_penjualan = t_0 + t_1 + t_2 + t_3 + t_4 + t_5 + t_6 + t_7 + t_8;
		String t_rp = "Rp. ";
		t_rp = "Rp. " + t_penjualan;
		
		//set jumlah
		TextView jumlah_0_text = (TextView) findViewById(R.id.jumlah_0);
		jumlah_0_text.setText(x_0.toString());

		TextView jumlah_1_text = (TextView) findViewById(R.id.jumlah_1);
		jumlah_1_text.setText(x_1.toString());

		TextView jumlah_2_text = (TextView) findViewById(R.id.jumlah_2);
		jumlah_2_text.setText(x_2.toString());

		TextView jumlah_3_text = (TextView) findViewById(R.id.jumlah_3);
		jumlah_3_text.setText(x_3.toString());

		TextView jumlah_4_text = (TextView) findViewById(R.id.jumlah_4);
		jumlah_4_text.setText(x_4.toString());

		TextView jumlah_5_text = (TextView) findViewById(R.id.jumlah_5);
		jumlah_5_text.setText(x_5.toString());

		TextView jumlah_6_text = (TextView) findViewById(R.id.jumlah_6);
		jumlah_6_text.setText(x_6.toString());

		TextView jumlah_7_text = (TextView) findViewById(R.id.jumlah_7);
		jumlah_7_text.setText(x_7.toString());

		TextView jumlah_8_text = (TextView) findViewById(R.id.jumlah_8);
		jumlah_8_text.setText(x_8.toString());

		//set total harga
		TextView totalmenu0_text = (TextView) findViewById(R.id.totalmenu0_text);
		totalmenu0_text.setText(t_0.toString());
	
		TextView totalmenu1_text = (TextView) findViewById(R.id.totalmenu1_text);
		totalmenu1_text.setText(t_1.toString());

		TextView totalmenu2_text = (TextView) findViewById(R.id.totalmenu2_text);
		totalmenu2_text.setText(t_2.toString());
		
		TextView totalmenu3_text = (TextView) findViewById(R.id.totalmenu3_text);
		totalmenu3_text.setText(t_3.toString());
		
		TextView totalmenu4_text = (TextView) findViewById(R.id.totalmenu4_text);
		totalmenu4_text.setText(t_4.toString());
		
		TextView totalmenu5_text = (TextView) findViewById(R.id.totalmenu5_text);
		totalmenu5_text.setText(t_5.toString());
		
		TextView totalmenu6_text = (TextView) findViewById(R.id.totalmenu6_text);
		totalmenu6_text.setText(t_6.toString());
		
		TextView totalmenu7_text = (TextView) findViewById(R.id.totalmenu7_text);
		totalmenu7_text.setText(t_7.toString());
		
		TextView totalmenu8_text = (TextView) findViewById(R.id.totalmenu8_text);
		totalmenu8_text.setText(t_8.toString());
		
		TextView total_penjualan = (TextView) findViewById(R.id.total_penjualan);
		total_penjualan.setText(t_rp.toString());
		
	
		}

	//option menu handler
		public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	        case R.id.exit:
	            AlertDialog endSessionDialog = new AlertDialog.Builder(ReportActivity.this).create(); //Read Update
	            //endSessionDialog.setTitle("Hey, Dude...");
	            endSessionDialog.setMessage("Are you sure?");
	            endSessionDialog.setButton( Dialog.BUTTON_POSITIVE, "End Session", new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int which) {
	            	   finish();
	            	   
	            	   Intent intent2main = new Intent(getApplicationContext(), MainActivity.class);
	            	   intent2main.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	            	   intent2main.putExtra("EXIT", true);
	            	   startActivity(intent2main);
	               
	               }
	               });

	            endSessionDialog.setButton( Dialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener()    {
	              public void onClick(DialogInterface dialog, int which) {
	              }
	              });

	            endSessionDialog.show();  //<-- See This!
	        	
	        //return true;
	        //case R.id.export:
	        	//do

	        //return true;
	        //case R.id.report_logs:
	        	//do

	        return true;

	        default:
	        return super.onOptionsItemSelected(item);
	        }
	    }
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.report, menu);
		return true;
	}

}
