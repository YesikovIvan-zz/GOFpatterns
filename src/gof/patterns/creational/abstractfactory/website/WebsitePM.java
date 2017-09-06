package gof.patterns.creational.abstractfactory.website;

import gof.patterns.creational.abstractfactory.ProjectManger;

public class WebsitePM implements ProjectManger{
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
