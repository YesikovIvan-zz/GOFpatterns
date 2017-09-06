package gof.patterns.creational.abstractfactory.banking;

import gof.patterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
