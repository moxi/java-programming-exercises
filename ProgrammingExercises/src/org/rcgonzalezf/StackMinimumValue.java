package org.rcgonzalezf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StackMinimumValue <T extends Integer> {
    T minimumValue;
    List<T> stack = new ArrayList<>();

    private List<T> minimumValues = new ArrayList<>();

    public StackMinimumValue(T defaultValue) {
        this.minimumValue = defaultValue;
    }

    public void push(T t) {

        if(t.compareTo(minimumValue) == -1) {
            minimumValue = t;
            minimumValues.add(t);
        }
        stack.add(t);
    }

    public T pop() {
        int position = stack.size() - 1;
        T t = stack.get(position);
        stack.remove(position);
        tryToUpdateMinimum(t);
        return t;
    }

    private void tryToUpdateMinimum(T t) {
        if(Objects.equals(t, minimumValue)) {
            int position = minimumValues.size() - 1;
            minimumValues.remove(position);
            if(!minimumValues.isEmpty()) {
                int newLastPosition = minimumValues.size() - 1;
                minimumValue = minimumValues.get(newLastPosition);
            }
        }
    }

    public T getMinimumValue() {
        return minimumValue;
    }

}
