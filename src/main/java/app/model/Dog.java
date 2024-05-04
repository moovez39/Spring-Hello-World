package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private Timer timer;
    @Override
    public String toString() {
        return "Im a Dog";
    }

}

