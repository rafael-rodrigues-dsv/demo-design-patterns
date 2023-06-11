package org.example.model.remotes;

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
