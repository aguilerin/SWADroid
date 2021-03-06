/*
 *  This file is part of SWADroid.
 *
 *  Copyright (C) 2010 Juan Miguel Boyero Corral <juanmi1982@gmail.com>
 *
 *  SWADroid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  SWADroid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with SWADroid.  If not, see <http://www.gnu.org/licenses/>.
 */
package es.ugr.swad.swadroid.modules.tests;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.ksoap2.SoapFault;
import org.xmlpull.v1.XmlPullParserException;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import es.ugr.swad.swadroid.Global;
import es.ugr.swad.swadroid.R;
import es.ugr.swad.swadroid.modules.Module;

/**
 * Tests module for download questions and evaluate user skills in a course
 * @author Juan Miguel Boyero Corral <juanmi1982@gmail.com>
 */
public class Tests extends Module {
	/**
	 * Array adapter for showing menu options
	 */
	private ArrayAdapter<String> adapter;
    /**
     * Tests tag name for Logcat
     */
    public static final String TAG = Global.APP_TAG + " Tests";
	
	/* (non-Javadoc)
	 * @see es.ugr.swad.swadroid.modules.Module#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ImageView image;
		TextView text;
		ListView list;
		String[] items = getResources().getStringArray(R.array.testMenuItems);
		OnItemClickListener clickListener = new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent activity;
				switch(position) {
					case 0: activity = new Intent(getBaseContext(), TestsConfigDownload.class);
							startActivityForResult(activity, Global.TESTS_CONFIG_DOWNLOAD_REQUEST_CODE);
							break;
							
					case 1: activity = new Intent(getBaseContext(), TestsMake.class);
							startActivityForResult(activity, Global.TESTS_MAKE_REQUEST_CODE);
							break;
				}
				
			}    	
        };
		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.list_items);
        
        image = (ImageView)this.findViewById(R.id.moduleIcon);
        image.setBackgroundResource(R.drawable.test);
        
        text = (TextView)this.findViewById(R.id.moduleName);
        text.setText(R.string.testsModuleLabel);

        adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item, R.id.listText, items);
        list = (ListView)this.findViewById(R.id.listItems);
        list.setAdapter(adapter);
        list.setOnItemClickListener(clickListener);
	}

	/* (non-Javadoc)
	 * @see es.ugr.swad.swadroid.modules.Module#requestService()
	 */
	@Override
	protected void requestService() throws NoSuchAlgorithmException,
			IOException, XmlPullParserException, SoapFault,
			IllegalAccessException, InstantiationException {

	}

	/* (non-Javadoc)
	 * @see es.ugr.swad.swadroid.modules.Module#connect()
	 */
	@Override
	protected void connect() {

	}

	/* (non-Javadoc)
	 * @see es.ugr.swad.swadroid.modules.Module#postConnect()
	 */
	@Override
	protected void postConnect() {

	}
	
	/* (non-Javadoc)
	 * @see es.ugr.swad.swadroid.modules.Module#onError()
	 */
	@Override
	protected void onError() {

	}
}
