package org.example.dekorator.szyfr;

public class Main {
    public static void main(String[] args) {
        SzyfrBaza szyfr = new SzyfrA(
                new SzyfrZ(
                        new SzyfrOdwrotny("Test, Test")
                )
        );
        System.out.println(szyfr.szyfruj());
        SzyfrBaza szyfr2 = new SzyfrZ(
                new SzyfrA(
                        new SzyfrOdwrotny("Test, Test")
                )
        );
        System.out.println(szyfr2.szyfruj());
    }
}
