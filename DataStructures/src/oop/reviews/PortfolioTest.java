package oop.reviews;

public class PortfolioTest {
    public static void main(String[] args){
        Portfolio portfolio = new Portfolio();
        Project project = new Project("MD-Document", "Online live document editor");
        project.setInitialCost( 600 );
        portfolio.addProjects( project );

        portfolio.showPortfolio();
    }
}
