package gof.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> vacancies);
}
