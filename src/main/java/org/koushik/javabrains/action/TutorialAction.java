package org.koushik.javabrains.action;

import org.koushik.javabrains.service.TutorialFinderService;

public class TutorialAction {
    private final static String msg = "success";
//    private final static String msg = "failure";

    public String execute(){

        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        String bestTutorialSite = tutorialFinderService.getBestTutorialSite();
        System.out.println(bestTutorialSite);
        return msg;
    }
}