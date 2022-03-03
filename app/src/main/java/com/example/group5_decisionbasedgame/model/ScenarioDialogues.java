package com.example.group5_decisionbasedgame.model;

public class ScenarioDialogues {

    public int setnextdlg;
    int nextdlg = 0;

    static String txt0 = "Welcome to the game. Press Next to start.";
    static String txt1 = "A group of friends unknowingly woke up to see an empty world. The city they live in looks like an abandoned ruin. Neither of them knows what happened, nor knows what time or what year it is.";
    static String txt2 = "Alex decides to stop talking. He then went looking for his friends.";
    static String txt3 = "Alex walks toward the voices he heard.";
    static String txt4 = "A tumbleweed passes by.";
    static String txt5 = "Mitsuo laughs.";
    static String txt6 = "The three went to regroup with the others.";

    public ScenarioDialogues () {}

    public static String gettxt0 ()  { return txt0; }
    public static String gettxt1 () { return txt1; }
    public static String gettxt2 () { return txt2; }
    public static String gettxt3 () { return txt3; }
    public static String gettxt4 () { return txt4; }
    public static String gettxt5 () { return txt5; }
    public static String gettxt6 () { return txt6; }

    public int getnextdlg() { return nextdlg; }
    public void setnextdlg(int nextdlg) { this.nextdlg = nextdlg; }
}
