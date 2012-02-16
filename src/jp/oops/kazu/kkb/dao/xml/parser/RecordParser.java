package jp.oops.kazu.kkb.dao.xml.parser;

import java.util.ArrayList;
import java.util.List;

import jp.oops.kazu.kkb.dao.entity.Record;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import android.util.Log;

public class RecordParser extends DefaultHandler {
	final String TAG = RecordParser.class.getSimpleName();
	private List<Record> records = null;

	private final String ROW = "row";
	private final String ID = "id";
	private final String ACCOUNT_ID = "account_id";
	private final String ITEM_ID = "item_id";
	private final String BALANCE_FLAG = "balance_flag";
	private final String AMOUNT = "amount";
	private final String MEMO = "memo";

	public void startDocument() {
		Log.i(TAG, "startDocument");
		records = new ArrayList<Record>();
	}

	public void endDocument() {
		Log.i(TAG,"endDocument");
	}

	public void startElement(String namespaceURI,
			String localName,
			String qName,
			Attributes atts) {

		Log.i(TAG,"startElement: " + qName);
		if (ID.equals(qName)) {

		} else if (ACCOUNT_ID.equals(qName)) {

		} else if (ITEM_ID.equals(qName)) {

		} else if (BALANCE_FLAG.equals(qName)) {

		} else if (AMOUNT.equals(qName)) {

		} else if (MEMO.equals(qName)) {

		}
	}

	public void endElement(String namespaceURI,
			String localName,
			String qName) {

		Log.i(TAG,"endElement: " + qName);
	}

	public void characters(char[] ch, int start, int length) {
		Log.i(TAG,"characters: ");
		for (int i = 0; i < length; i++) {
			System.out.print(ch[start + i]);
		}
		System.out.println();
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}
}
