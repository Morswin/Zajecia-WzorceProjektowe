package org.example.fabryka.czekoladek;

public abstract class Czekolada {
    String nazwaCzekolady;
    double cenaSzt;
    int zawartoscKakao;

    public void opisz() {
        System.out.println(nazwaCzekolady + " (" + zawartoscKakao + "% kakao) w cenie: " + cenaSzt + " za sztukę.");
    }
}
