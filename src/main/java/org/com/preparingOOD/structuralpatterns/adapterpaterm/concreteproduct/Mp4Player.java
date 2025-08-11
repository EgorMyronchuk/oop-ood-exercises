package org.com.preparingOOD.structuralpatterns.adapterpaterm.concreteproduct;

import org.com.preparingOOD.structuralpatterns.adapterpaterm.abstracrtproduct.AdvancedAudioPlayer;

public class Mp4Player implements AdvancedAudioPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Sorry , this player doesn`t work with VLC file");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file:" + fileName);
    }
}
