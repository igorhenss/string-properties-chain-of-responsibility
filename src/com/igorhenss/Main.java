package com.igorhenss;

import com.igorhenss.domain.Quote;
import com.igorhenss.domain.property.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        HasNoDigits p1 = new HasNoDigits();
        HasNoLetters p2 = new HasNoLetters();
        HasSpaces p3 = new HasSpaces();
        HasSymbols p4 = new HasSymbols();
        LengthBiggerThanTwenty p5 = new LengthBiggerThanTwenty();
        FinalProperty finalProperty = new FinalProperty();

        p1.nextProperty(p2);
        p2.nextProperty(p3);
        p3.nextProperty(p4);
        p4.nextProperty(p5);
        p5.nextProperty(finalProperty);

        Quote quote = new Quote("     107.463.599-00     ");

        p1.verifyProperty(quote);

        out.println(quote.getProperties());
    }

}
