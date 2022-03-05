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
    static String txt1D4 = "After helping the old man, Toni notices a scratch on her arm. She went towards the old man and interrogated him furiously.";
    static String txtOldMan1 = "*cries* I didn't do anything!";
    static String txtOldMan2 = "Thank you...";
    //TELL MITSUO txts
    static String txt7 = "Toni took a step back.";
    static String txt8 = "The group decides to come back for the old man. They traveled without a sense of direction. As they wander around, Toni approaches Mitsuo.";
    static String txt9 = "Toni reveals her scratch to Mitsuo.";
    //TELL MITSUO 1st scenario ends here

    //TELL MITSUO_YES txts
    static String txt10 = "Mitsuo feels scared. He decides to tell it to everyone.";
    static String txt11 = "Mitsuo nods slowly.";
    static String txt12 = "Everybody ran away. Mitsuo wanted to go back for Toni, but Alex interfered, leaving Toni behind. Toni sobs as she felt betrayed.";
    static String txt13 = "Mitsuo runs to go back for Toni.";
    static String txt14 = "While walking, the group of friends found a backpack. LeRodge opens the bag.";
    static String txt15 = "You have received the following items: Inhaler, painkillers, blue shirt, a book about Geometry.";
    static String txt16 = "LeRodge uses his inhaler.";
    static String txt17 = "LeRodge struggles to breath.";
    static String txt18 = "Natasha runs away.";
    static String txt19 = "A horde of zombies appears.";
    static String txt20 = "Bryan and Alex runs away from the horde while carrying LeRodge, leaving Natasha behind.";
    static String txt21 = "Bryan tripped on a lump. Bryan and LeRodge falls to the ground";
    static String txt22 = "Alex decides to run away, leaving Bryan and LeRodge behind.";
    static String txt23 = "Toni starts to act weird.";
    static String txt24 = "The group of friends continues to find for shelter and help.";
    //YES txts
    static String txt25 = "Toni agrees for Bryan to inspect the scratch.";
    static String txt26 = "The group of friends walked away from the scene.";
    static String txt27 = "You have received the following items: Inhaler, antiviral drug, water, a book about Geometry.";
    static String txt28 = "The group of friends went back to Toni and Mitsuo.";
    static String txt29 = "Bryan used the antiviral drug on Toni.";
    //END OF YES txts



    public ScenarioDialogues () {}

    public static String gettxt0 () { return txt0; }
    public static String gettxt1 () { return txt1; }
    public static String gettxt2 () { return txt2; }
    public static String gettxt3 () { return txt3; }
    public static String gettxt4 () { return txt4; }
    public static String gettxt5 () { return txt5; }
    public static String gettxt6 () { return txt6; }
    public static String gettxt1D4 () { return txt1D4; }
    public static String gettxtOldMan1() { return txtOldMan1; }
    public static String gettxtOldMan2() { return txtOldMan2; }
    public static String gettxt7() { return txt7; }
    public static String gettxt8() { return txt8; }
    public static String gettxt9() { return txt9; }
    public static String gettxt10() { return txt10; }
    public static String gettxt11() { return txt11; }
    public static String gettxt12() { return txt12; }
    public static String gettxt13() { return txt13; }
    public static String gettxt14() { return txt14; }
    public static String gettxt15() { return txt15; }
    public static String gettxt16() { return txt16; }
    public static String gettxt17() { return txt17; }
    public static String gettxt18() { return txt18; }
    public static String gettxt19() { return txt19; }
    public static String gettxt20() { return txt20; }
    public static String gettxt21() { return txt21; }
    public static String gettxt22() { return txt22; }
    public static String gettxt23() { return txt23; }
    public static String gettxt24() { return txt24; }
    public static String gettxt25() { return txt25; }
    public static String gettxt26() { return txt26; }
    public static String gettxt27() { return txt27; }
    public static String gettxt28() { return txt28; }
    public static String gettxt29() { return txt29; }

    public int getnextdlg() { return nextdlg; }
    public void setnextdlg(int nextdlg) { this.nextdlg = nextdlg; }
}
