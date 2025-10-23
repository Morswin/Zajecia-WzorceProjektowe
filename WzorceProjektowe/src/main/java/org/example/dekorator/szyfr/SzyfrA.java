package org.example.dekorator.szyfr;

public class SzyfrA extends SzyfrDekorator{
    SzyfrA(SzyfrBaza szyfr) {
        super(szyfr);
    }
    @Override
    public String szyfruj() {
        String ret = "";
        String zaszyfrowane = szyfr.szyfruj();
        for (int i = 0; i < zaszyfrowane.length(); i++) {
            ret += zaszyfrowane.charAt(i) + "A";
        }
        return ret;
    }
}
