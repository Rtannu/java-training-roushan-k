package rtn.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class StrLen {

    static OptionalInt getLen(String input){
        if(input==null)
            return OptionalInt.empty();
        else
            return OptionalInt.of(input.length());
    }

    static Optional<String> getUpperCase(String input){
        if(input==null)
            return Optional.empty();
        else
            return Optional.of(input.toUpperCase());
    }
}
