package com.igorhenss.domain.property;

import com.igorhenss.domain.Quote;

public class FinalProperty implements StringProperty {

    @Override
    public void verifyProperty(Quote quote) {}

    @Override
    public void nextProperty(StringProperty next) {}

}
