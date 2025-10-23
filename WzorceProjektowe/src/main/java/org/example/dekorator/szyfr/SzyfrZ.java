package org.example.dekorator.szyfr;

public class SzyfrZ extends SzyfrDekorator{
    SzyfrZ(SzyfrBaza szyfr) {
        super(szyfr);
    }
    @Override
    public String szyfruj() {
        String ret = "";
        String zaszyfrowane = szyfr.szyfruj();
        for (int i = 0; i < zaszyfrowane.length(); i++) {
            ret += "Z" + zaszyfrowane.charAt(i) + "Z";
        }
        return ret;
    }
}
