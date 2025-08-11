package org.com.preparingOOD.structuralpatterns.adapterpaterm.adapter;

import org.com.preparingOOD.structuralpatterns.adapterpaterm.abstracrtproduct.AdvancedAudioPlayer;
import org.com.preparingOOD.structuralpatterns.adapterpaterm.clientinterface.AudioPlayer;
import org.com.preparingOOD.structuralpatterns.adapterpaterm.concreteproduct.Mp4Player;
import org.com.preparingOOD.structuralpatterns.adapterpaterm.concreteproduct.VlcPlayer;

public class AudioPlayerAdapter implements AudioPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            VlcPlayer vlcPlayer = new VlcPlayer();
            vlcPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            Mp4Player mp4Player = new Mp4Player();
            mp4Player.playMp4(fileName);
        }
    }
}
