package net.fz.computer;

import net.fz.computer.adapter.HdmiVgaAdapter;

public class SuperVga implements VGA , Hdmi{

    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("====== SuperVga ======");
        System.out.println(message);
        System.out.println("====== SuperVga ======");
    }


    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
