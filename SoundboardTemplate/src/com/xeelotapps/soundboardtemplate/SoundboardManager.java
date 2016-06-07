package com.xeelotapps.soundboardtemplate;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class SoundboardManager {

	private Context c;
	private MediaPlayer player;
	
	
	//Constructor
	public SoundboardManager(Context context)
	{
		c = context;
	    player = new MediaPlayer();
	    player.setAudioStreamType(AudioManager.STREAM_MUSIC);
	    player.setOnCompletionListener(new OnCompletionListener() {
			//Release when audio completes
			public void onCompletion(MediaPlayer mp) {
				player.release();
				player = null;
			}
		});
	}
	
	
	//Method for playing sounds
	public void playSound(int soundID)
	{
		//Check if player is currently playing
		if(player != null)
		{
			if(player.isPlaying())
			{
				//Stop and Release
				player.stop();
				player.release();
			}
		}
		//Create player based on sound that was pressed and Start
		player = MediaPlayer.create(c, soundID);
		player.start();
	}
	
	
	//Method to stop sound on app exit
	public void cancelSound()
	{
		if(player != null)
		{
			if(player.isPlaying())
			{
				player.stop();
			}
			player.release();
			player = null;
		}
	}
}
