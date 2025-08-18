package org.com.preparingOOD.structuralpatterns.adapterpatterm.concreteproduct;

import org.com.preparingOOD.structuralpatterns.adapterpatterm.adapter.AudioPlayerAdapter;
import org.com.preparingOOD.structuralpatterns.adapterpatterm.clientinterface.AudioPlayer;

public class OldAudioPlayer implements AudioPlayer {
    public void play (String audioType , String filename ) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 audio " + filename);
        }
        else {
            AudioPlayerAdapter adapter = new AudioPlayerAdapter() ;
            if (audioType.equalsIgnoreCase("mp4")) {
                adapter.play(audioType, filename);
            }
            else if (audioType.equalsIgnoreCase("VLC")) {
                adapter.play(audioType, filename);
            }
            else {
                System.out.println("Invalid audio type");
            }
        }

    }
}
