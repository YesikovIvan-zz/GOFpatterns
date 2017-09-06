package gof.patterns.creational.abstractfactory.banking;

import gof.patterns.creational.abstractfactory.ProjectManger;

public class BankingPM implements ProjectManger{
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
