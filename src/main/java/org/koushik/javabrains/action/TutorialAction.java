package org.koushik.javabrains.action;

import org.koushik.javabrains.service.TutorialFinderService;

public class TutorialAction {
    private String bestTutorialSite;

    public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }

    public String execute(){

        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        setBestTutorialSite(tutorialFinderService.getBestTutorialSite());
        return "success";
    }
}