package jp.oops.kazu.kkb.screen.top;

import java.io.InputStream;
import java.util.Calendar;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

import jp.oops.kazu.kkb.R;
import jp.oops.kazu.kkb.dao.xml.parser.RecordParser;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;

public class TopActivity extends Activity {

	final String TAG = TopActivity.class.getSimpleName();

	DatePickerDialog datePickerDialog;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);


		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			DefaultHandler handler = new RecordParser();

			AssetManager as = getResources().getAssets();
			InputStream is = as.open("record.xml");

			parser.parse(is, handler);

		} catch (Exception e) {
			Log.e(TAG, e.getMessage());
		}

		//日付設定時のリスナ作成
		DatePickerDialog.OnDateSetListener DateSetListener = new DatePickerDialog.OnDateSetListener(){
			public void onDateSet(android.widget.DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
				Button btn = (Button) findViewById(R.id.selectDate);
				btn.setText(String.format("%04d年%02d月%02d日", year, monthOfYear+1, dayOfMonth));
			}
		};
		//日付情報の初期設定
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int monthOfYear = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

		Button btn = (Button) findViewById(R.id.selectDate);
		btn.setText(String.format("%04d年%02d月%02d日", year, monthOfYear+1, dayOfMonth));

		//日付設定ダイアログの作成
		datePickerDialog = new DatePickerDialog(this, R.style.MyDialog, DateSetListener, year, monthOfYear, dayOfMonth);

//		AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//		builder.setTitle("dialog");
//		builder.setMessage("test!");
//		builder.setPositiveButton("OK", null);
//		builder.show();
	}

	public void onClickSelectDate(View view) {
		//日付設定ダイアログの表示
		datePickerDialog.show();
	}
	public void showMyDialog(View v) {
		Dialog myDialog = new Dialog(this, R.style.MyDialog);
        myDialog.setTitle("dialog");
        myDialog.setMessage("test!");
        myDialog.setButton("OK", (OnClickListener)null);
        myDialog.show();
    }
}