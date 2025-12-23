package java10;

import java.util.Optional;

public class OrElseThrow {

    public static void main(String[] args) {
        Optional op = Optional.ofNullable(null);
        op.orElseThrow();// NoSuchElementException
    }
}
