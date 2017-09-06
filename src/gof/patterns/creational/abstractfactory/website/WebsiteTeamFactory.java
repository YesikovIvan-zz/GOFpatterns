package gof.patterns.creational.abstractfactory.website;

import gof.patterns.creational.abstractfactory.Developer;
import gof.patterns.creational.abstractfactory.ProjectManger;
import gof.patterns.creational.abstractfactory.ProjectTeamFactory;
import gof.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
