package org.example.model.remote;

import org.example.contract.Device;
import org.example.contract.Remote;

public class BasicRemote implements Remote {
    protected Device Device;

    public BasicRemote() {}

    public BasicRemote(Device Device) {
        this.Device = Device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (Device.isEnabled()) {
            Device.disable();
        } else {
            Device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        Device.setVolume(Device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        Device.setVolume(Device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        Device.setChannel(Device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        Device.setChannel(Device.getChannel() + 1);
    }
}
