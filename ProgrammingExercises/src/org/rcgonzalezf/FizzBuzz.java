package org.rcgonzalezf;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder value = new StringBuilder();
        for(int i = 1; i <=n ; ++i) {

            if (i%3== 0) {
                value.append("Fizz");
            }
            if (i%5==0) {
                value.append("Buzz");
            }

            if (value.length() <= 0) {
                value.append(i);
                result.add(value.toString());
            } else {
                result.add(value.toString());
            }

            value.setLength(0);
        }
        return result;
    }
}
