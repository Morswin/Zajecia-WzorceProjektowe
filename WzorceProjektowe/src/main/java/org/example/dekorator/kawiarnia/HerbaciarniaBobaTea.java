package org.example.dekorator.kawiarnia;

public class HerbaciarniaBobaTea {
    public static void main(String[] args) {
        BobaTea b1 = new DodatkowaBoba(
                new DodatkowySyrop(
                        new TruskawkowaBobaTea()
                )
        );
        b1.opisz();
        BobaTea b2 = new DodatkowyLod(
                new DodatkowySyrop(
                        new CzekoladowaBobaTea()
                )
        );
        b2.opisz();
    }
}
