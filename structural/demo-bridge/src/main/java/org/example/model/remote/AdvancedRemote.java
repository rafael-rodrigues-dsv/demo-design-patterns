package org.example.model.remote;

import org.example.contract.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device Device) {
        super.Device = Device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        Device.setVolume(0);
    }
}
