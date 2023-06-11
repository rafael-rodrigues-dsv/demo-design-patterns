package org.example;

import org.example.models.AudioPlayer;

/** Adapter in Java.
 * @author Rafael Rodrigues
 * @reference https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 * @version 1.0
 * @since 1.0
 */
public class MainAdapter {
    public static void main(String[] args) {
        testAdapter();
    }

    private static void testAdapter() {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}