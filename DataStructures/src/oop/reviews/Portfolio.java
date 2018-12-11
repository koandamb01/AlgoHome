package oop.reviews;

import java.util.ArrayList;

public class Portfolio {
    ArrayList<Project> projects = new ArrayList<Project>();

    public double getPortfolioCost(){
        double sum = 0;
        for(Project p : this.projects){
            sum += p.getInitialCost();
        }
        return sum;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void addProjects(Project p){
        this.projects.add( p );
    }

    public void showPortfolio(){
        for(Project p : this.projects){
            System.out.println( "Project Name: " + p.getName() + " Cost: " + p.getInitialCost());
        }
        System.out.println( "Total Cost: " + this.getPortfolioCost());
    }


}
