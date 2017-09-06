package gof.patterns.creational.abstractfactory.website;

import gof.patterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester{
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
