package com.xeelotapps.soundboardtemplate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	//Buttons
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button button10;
	private Button button11;
	private Button button12;
	private Button button13;
	private Button button14;
	private Button button15;
	private Button button16;
	private Button button17;
	private Button button18;
	private Button button19;
	private Button button20;
	private Button button21;
	private Button button22;
	private Button button23;
	private Button button24;
	private Button button25;
	private Button button26;
	private Button button27;
	private Button button28;
	private Button button29;
	private Button button30;
	private Button button31;
	private Button button32;
	private Button button33;
	private Button button34;
	private Button button35;
	private Button button36;
	private Button button37;
	private Button button38;
	private Button button39;
	
	//SoundboardManager
	private SoundboardManager sounds;
	
	
	//**********Constructor**********
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Remove TitleBar on older OS
        if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB)
        {
        	requestWindowFeature(Window.FEATURE_NO_TITLE);
        }
        //Set content view to main_layout
        setContentView(R.layout.activity_main);
        //Set the volume stream controller to music
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        
        
        //Set SoundboardManager
        sounds = new SoundboardManager(getBaseContext());
        
        
        //Set Buttons
        button1 = (Button)findViewById(R.id.button1);
        button1.setId(R.raw.sound1);
        registerForContextMenu(button1);
        button1.setOnClickListener(this);
        button2 = (Button)findViewById(R.id.button2);
        button2.setId(R.raw.sound2);
        registerForContextMenu(button2);
        button2.setOnClickListener(this);
        button3 = (Button)findViewById(R.id.button3);
        button3.setId(R.raw.sound3);
        registerForContextMenu(button3);
        button3.setOnClickListener(this);
        button4 = (Button)findViewById(R.id.button4);
        button4.setId(R.raw.sound4);
        registerForContextMenu(button4);
        button4.setOnClickListener(this);
        button5 = (Button)findViewById(R.id.button5);
        button5.setId(R.raw.sound5);
        registerForContextMenu(button5);
        button5.setOnClickListener(this);
        button6 = (Button)findViewById(R.id.button6);
        button6.setId(R.raw.sound6);
        registerForContextMenu(button6);
        button6.setOnClickListener(this);
        button7 = (Button)findViewById(R.id.button7);
        button7.setId(R.raw.sound7);
        registerForContextMenu(button7);
        button7.setOnClickListener(this);
        button8 = (Button)findViewById(R.id.button8);
        button8.setId(R.raw.sound8);
        registerForContextMenu(button8);
        button8.setOnClickListener(this);
        button9 = (Button)findViewById(R.id.button9);
        button9.setId(R.raw.sound9);
        registerForContextMenu(button9);
        button9.setOnClickListener(this);
        button10 = (Button)findViewById(R.id.button10);
        button10.setId(R.raw.sound10);
        registerForContextMenu(button10);
        button10.setOnClickListener(this);
        
        button11 = (Button)findViewById(R.id.button11);
        button11.setId(R.raw.sound11);
        registerForContextMenu(button11);
        button11.setOnClickListener(this);
        button12 = (Button)findViewById(R.id.button12);
        button12.setId(R.raw.sound12);
        registerForContextMenu(button12);
        button12.setOnClickListener(this);
        button13 = (Button)findViewById(R.id.button13);
        button13.setId(R.raw.sound13);
        registerForContextMenu(button13);
        button13.setOnClickListener(this);
        button14 = (Button)findViewById(R.id.button14);
        button14.setId(R.raw.sound14);
        registerForContextMenu(button14);
        button14.setOnClickListener(this);
        button15 = (Button)findViewById(R.id.button15);
        button15.setId(R.raw.sound15);
        registerForContextMenu(button15);
        button15.setOnClickListener(this);
        button16 = (Button)findViewById(R.id.button16);
        button16.setId(R.raw.sound16);
        registerForContextMenu(button16);
        button16.setOnClickListener(this);
        button17 = (Button)findViewById(R.id.button17);
        button17.setId(R.raw.sound17);
        registerForContextMenu(button17);
        button17.setOnClickListener(this);
        button18 = (Button)findViewById(R.id.button18);
        button18.setId(R.raw.sound18);
        registerForContextMenu(button18);
        button18.setOnClickListener(this);
        button19 = (Button)findViewById(R.id.button19);
        button19.setId(R.raw.sound19);
        registerForContextMenu(button19);
        button19.setOnClickListener(this);
        button20 = (Button)findViewById(R.id.button20);
        button20.setId(R.raw.sound20);
        registerForContextMenu(button20);
        button20.setOnClickListener(this);
        
        button21 = (Button)findViewById(R.id.button21);
        button21.setId(R.raw.sound21);
        registerForContextMenu(button21);
        button21.setOnClickListener(this);
        button22 = (Button)findViewById(R.id.button22);
        button22.setId(R.raw.sound22);
        registerForContextMenu(button22);
        button22.setOnClickListener(this);
        button23 = (Button)findViewById(R.id.button23);
        button23.setId(R.raw.sound23);
        registerForContextMenu(button23);
        button23.setOnClickListener(this);
        button24 = (Button)findViewById(R.id.button24);
        button24.setId(R.raw.sound24);
        registerForContextMenu(button24);
        button24.setOnClickListener(this);
        button25 = (Button)findViewById(R.id.button25);
        button25.setId(R.raw.sound25);
        registerForContextMenu(button25);
        button25.setOnClickListener(this);
        button26 = (Button)findViewById(R.id.button26);
        button26.setId(R.raw.sound26);
        registerForContextMenu(button26);
        button26.setOnClickListener(this);
        button27 = (Button)findViewById(R.id.button27);
        button27.setId(R.raw.sound27);
        registerForContextMenu(button27);
        button27.setOnClickListener(this);
        button28 = (Button)findViewById(R.id.button28);
        button28.setId(R.raw.sound28);
        registerForContextMenu(button28);
        button28.setOnClickListener(this);
        button29 = (Button)findViewById(R.id.button29);
        button29.setId(R.raw.sound29);
        registerForContextMenu(button29);
        button29.setOnClickListener(this);
        button30 = (Button)findViewById(R.id.button30);
        button30.setId(R.raw.sound30);
        registerForContextMenu(button30);
        button30.setOnClickListener(this);
        
        button31 = (Button)findViewById(R.id.button31);
        button31.setId(R.raw.sound31);
        registerForContextMenu(button31);
        button31.setOnClickListener(this);
        button32 = (Button)findViewById(R.id.button32);
        button32.setId(R.raw.sound32);
        registerForContextMenu(button32);
        button32.setOnClickListener(this);
        button33 = (Button)findViewById(R.id.button33);
        button33.setId(R.raw.sound33);
        registerForContextMenu(button33);
        button33.setOnClickListener(this);
        button34 = (Button)findViewById(R.id.button34);
        button34.setId(R.raw.sound34);
        registerForContextMenu(button34);
        button34.setOnClickListener(this);
        button35 = (Button)findViewById(R.id.button35);
        button35.setId(R.raw.sound35);
        registerForContextMenu(button35);
        button35.setOnClickListener(this);
        button36 = (Button)findViewById(R.id.button36);
        button36.setId(R.raw.sound36);
        registerForContextMenu(button36);
        button36.setOnClickListener(this);
        button37 = (Button)findViewById(R.id.button37);
        button37.setId(R.raw.sound37);
        registerForContextMenu(button37);
        button37.setOnClickListener(this);
        button38 = (Button)findViewById(R.id.button38);
        button38.setId(R.raw.sound38);
        registerForContextMenu(button38);
        button38.setOnClickListener(this);
        button39 = (Button)findViewById(R.id.button39);
        button39.setId(R.raw.sound39);
        registerForContextMenu(button39);
        button39.setOnClickListener(this);
    }

    
    //**********Button Handler**********
	public void onClick(View v) {
		sounds.playSound(v.getId());
	}
	
	
	//**********Window Closed**********
	@Override
	public void onStop() {
		super.onStop();
		sounds.cancelSound();
	}
	
	
    //**********Menu Inflater**********
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    //Menu buttons selector
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
    	switch (item.getItemId()) {
    	case R.id.menu_ringtone:
    		AlertDialog.Builder rt = new AlertDialog.Builder(this);
    		rt.setTitle("Instructions");
    		rt.setMessage("1. Hold down the button for the sound you wish to save as a ringtone or notification.\n2. A popup should appear allowing you to select Save as Ringtone or Save as Notification.\n3. You're all set, enjoy!");
    		rt.setPositiveButton("Done", null);
    		rt.show();
    		return true;
    		
    	case R.id.menu_about:
    		AlertDialog.Builder about = new AlertDialog.Builder(this);
			about.setTitle("Xeelot Apps");
			about.setMessage("www.xeelotapps.com\n\nxeelotapps@gmail.com");
			about.setPositiveButton("Done", null);
			about.show();
    		return true;
    		
    	case R.id.menu_quit:
    		sounds.cancelSound();
    		finish();
    		return true;
    	default:
    		return super.onOptionsItemSelected(item);
    	}
    }
    
    
    //**********Context Menu**********
    @Override
    public void onCreateContextMenu(ContextMenu cMenu, View v, ContextMenuInfo menuInfo) {  
    	super.onCreateContextMenu(cMenu, v, menuInfo);
    	cMenu.setHeaderTitle("Sound Options");
    	cMenu.add(0, v.getId(), 0, "Save as Ringtone");
    	cMenu.add(0, v.getId(), 0, "Save as Notification");
    	cMenu.add(0, v.getId(), 0, "Cancel");
    }  
    
    //Context Menu Clicked
    @Override  
    public boolean onContextItemSelected(MenuItem item) {  
    	if(item.getTitle() == "Save as Ringtone"){
    		if(setSomething(item.getItemId(), true, false) == false){
    			Toast.makeText(this, "Save failed. Please try again.", Toast.LENGTH_LONG).show();
    		} else {
    			Toast.makeText(this, "Ringtone saved!", Toast.LENGTH_LONG).show();
    		}
    	}else if(item.getTitle() == "Save as Notification"){
    		if(setSomething(item.getItemId(), false, true) == false){
    			Toast.makeText(this, "Save failed. Please try again.", Toast.LENGTH_LONG).show();
    		} else {
    			Toast.makeText(this, "Notification Saved!", Toast.LENGTH_LONG).show();
    		}
    	}else{
    		return false;
    	}  
        return true;  
    }
    
    
    //**********Set Ringtone/Notification**********
    public boolean setSomething(int id, boolean ringtone, boolean notification){
    	//Create buffer
    	byte[] buffer = null;  
    	InputStream fIn = getBaseContext().getResources().openRawResource(id);  
    	int size = 0;  
    	
    	//Check space, read in file
    	try{  
    		size = fIn.available();  
    	    buffer = new byte[size];  
    	    fIn.read(buffer);  
    	    fIn.close();  
    	}catch(IOException e){ 
    		Log.i("failed", "IOE1");
    	    return false;  
    	}  
    	   
    	//Set parameters
    	Button temp = (Button)findViewById(id);
    	String path;
    	if(ringtone)
    	{
    		path = Environment.getExternalStorageDirectory().getPath() + "/media/audio/ringtones/";
    	} else {
    		path = Environment.getExternalStorageDirectory().getPath() + "/media/audio/notifications/";
    	}
    	Log.i("path", path);
    	String filename = getString(R.string.save_as) + temp.getText();
    	Log.i("filename", filename);
    	String filetype = getString(R.string.filetype);
    	
    	//Check if folder exists
    	boolean exists = (new File(path)).exists(); 
    	if(!exists){
    		new File(path).mkdirs();
    	}  
    	
    	//Write file to SD Card
    	FileOutputStream save;  
    	try{  
    		save = new FileOutputStream(path + filename + filetype);  
    	    save.write(buffer);  
    	    save.flush();  
    	    save.close();  
    	}catch(FileNotFoundException e){  
    		Log.i("failed", "FNFE1");
    		return false;  
    	}catch(IOException e){ 
    		Log.i("failed", "IOE2");
    		return false;  
    	}      
    	
    	//Notify phone that new ringtone/notification is being added
    	sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + path + filename + filetype)));  
    	 
    	File k = new File(path, filename + filetype);  
    	   
    	ContentValues values = new ContentValues();
    	values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
    	values.put(MediaStore.MediaColumns.TITLE, filename);
    	values.put(MediaStore.MediaColumns.MIME_TYPE, getString(R.string.filetype_desc));
    	values.put(MediaStore.Audio.Media.ARTIST, "XeelotApps");
    	values.put(MediaStore.Audio.Media.IS_RINGTONE, ringtone);
    	values.put(MediaStore.Audio.Media.IS_NOTIFICATION, notification);
    	values.put(MediaStore.Audio.Media.IS_ALARM, false);
    	values.put(MediaStore.Audio.Media.IS_MUSIC, false);
    	
    	//Grab uri for the ringtone file saved
    	Uri uri = MediaStore.Audio.Media.getContentUriForPath(k.getAbsolutePath());
    	//Delete the existing entry in the ringtone datastore (if it doesnt exist, does nothing)
    	this.getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + k.getAbsolutePath() + "\"", null);
    	//Insert the new entry into the ringtone datastore
    	Uri saveUri = this.getContentResolver().insert(uri, values);
    	
    	//Verify some uri settings and save default.
    	if(uri != null)
    	{
    		if(uri.getPath() != null)
    		{
    			if(ringtone)
    			{
    				RingtoneManager.setActualDefaultRingtoneUri(this, RingtoneManager.TYPE_RINGTONE, saveUri);
    			} else {
    				RingtoneManager.setActualDefaultRingtoneUri(this, RingtoneManager.TYPE_NOTIFICATION, saveUri);
    			}
    		}
    	}
    	return true;
    }
    
}
