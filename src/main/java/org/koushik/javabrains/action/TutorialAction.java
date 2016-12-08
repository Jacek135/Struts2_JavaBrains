package org.koushik.javabrains.action;

public class TutorialAction {
    private final static String msg = "success";
//    private final static String msg = "failure";

    public String execute(){

        System.out.println("Hello from execute" + msg.toUpperCase());
        return msg;
    }
}