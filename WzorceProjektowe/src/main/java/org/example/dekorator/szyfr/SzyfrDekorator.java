package org.example.dekorator.szyfr;

public class SzyfrDekorator extends SzyfrBaza{
    public SzyfrBaza szyfr;
    SzyfrDekorator(SzyfrBaza szyfr) {
        super(szyfr.dane);
        this.szyfr = szyfr;
    }
}
