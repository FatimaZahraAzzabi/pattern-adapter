package net.fz.computer.adapter;

import net.fz.computer.Hdmi;
import net.fz.computer.TV;
import net.fz.computer.VGA;

public class HdmiVgaAdapter implements VGA {

    public Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("====== Adapter ======");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("====== / Adapter ======");

    }


}
