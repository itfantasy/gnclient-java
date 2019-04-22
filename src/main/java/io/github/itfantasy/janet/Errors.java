package io.github.itfantasy.janet;

/**
 * Created by jgao on 2019/4/22.
 */
public class Errors {

    public static Error nil() {
        return new Error("");
    }


    public static Error newErr(String text)
    {
        return new Error(text);
    }
}
