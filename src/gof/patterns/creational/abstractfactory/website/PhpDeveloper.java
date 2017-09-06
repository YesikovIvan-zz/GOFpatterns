package gof.patterns.creational.abstractfactory.website;

import gof.patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
