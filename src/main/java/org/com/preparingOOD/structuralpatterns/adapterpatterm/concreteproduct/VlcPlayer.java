package org.com.preparingOOD.structuralpatterns.adapterpatterm.concreteproduct;

import org.com.preparingOOD.structuralpatterns.adapterpatterm.abstracrtproduct.AdvancedAudioPlayer;

public class VlcPlayer implements AdvancedAudioPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Sorry , this players does not support MP4.");
    }
}
