package org.com.preparingOOD.structuralpatterns.adapterpatterm;

import org.com.preparingOOD.structuralpatterns.adapterpatterm.clientinterface.AudioPlayer;
import org.com.preparingOOD.structuralpatterns.adapterpatterm.concreteproduct.OldAudioPlayer;

public class Application {

    public static void main(String[] args) {
        AudioPlayer player = new OldAudioPlayer();

        player.play("mp3", "song.mp3");
        player.play("vlc", "movie.vlc");
        player.play("mp4", "video.mp4");
        player.play("avi", "file.avi");
    }

}
