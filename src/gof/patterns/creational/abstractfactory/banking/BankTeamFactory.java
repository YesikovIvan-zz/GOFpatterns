package gof.patterns.creational.abstractfactory.banking;

import gof.patterns.creational.abstractfactory.Developer;
import gof.patterns.creational.abstractfactory.ProjectManger;
import gof.patterns.creational.abstractfactory.ProjectTeamFactory;
import gof.patterns.creational.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
