package net.fz;

import net.fz.computer.Ecran;
import net.fz.computer.TV;
import net.fz.computer.UniteCentral;
import net.fz.computer.VideoProjecteur;
import net.fz.computer.adapter.HdmiVgaAdapter;


public class Main {
    public static void main(String[] args) {


        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVga(new Ecran());
        uniteCentral.print("Bonjour");
        uniteCentral.setVga(new VideoProjecteur());
        uniteCentral.print("Bonjour");
        uniteCentral.setVga(new HdmiVgaAdapter());

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentral.print("Bonjour Fatima Zahra");

    }
}