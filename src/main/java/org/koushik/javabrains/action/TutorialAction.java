package org.koushik.javabrains.action;

import org.koushik.javabrains.service.TutorialFinderService;

public class TutorialAction {
    private String bestTutorialSite;
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }

    public String execute(){
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        System.out.println(getLanguage());
        setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
        return "success";
    }

    public String getTutorial(){
        System.out.println("Get Tutorial Colled");
        return "success";
    }

    public String addTutorial(){
        System.out.println("Add Tutorial Colled");
        return "success";
    }

    public String someOtherMethod(){
        System.out.println("Some other method executed.");
        return "success";
    }

}