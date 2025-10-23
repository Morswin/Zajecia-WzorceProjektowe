package org.example.dekorator.szyfr;

public class SzyfrOdwrotny extends SzyfrBaza{
    SzyfrOdwrotny(String dane) {
        super(dane);
    }
    @Override
    public String szyfruj() {
        StringBuilder ret = new StringBuilder(dane);
        ret.reverse();
        return ret.toString();
    }
}
