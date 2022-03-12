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

    //LIE txts
    static String txt30 = "Bryan was not convinced.";
    static String txt31 = "Toni hesitates and Bryan noticed it.";
    static String txt32 = "After this exchange, LeRodge walks back to the Old Man.";
    //END OF LIE txts

    //IGNORE QUES txts
    static String txt33 = "Toni ignored the question.";
    static String txt34 = "Toni sighs. Bryan was still waiting for a response.";
    //use txt32
    //END OF IGNORE QUES txts

    //AVOID QUES txts
    static String txt35 = "Bryan's question was avoided. Bryan got distracted by the opinion.";
    static String txt36 = "Alex overheard the conversation.";
    //END OF AVOID QUES txts

    //TELL TRUTH txts
    static String txt37 = "Bryan sends Natasha a glare.";
    static String txt38 = "Bryan inspects the scratch.";
    //END OF TELL TRUTH txts

    //CONTINUE HELP txts
    static String txt39 = "LeRodge grabs the old man's arm to help him stand.";
    static String txt40 = "Mitsuo follows";
    static String txt41 = "The old man loses his control for a second and scratches Mitsuo.";
    static String txt42 = "Mitsuo yelps and lets go of the old man.";
    static String txt43 = "Mitsuo inspects his scratch and starts to feel dizzy.";
    //END OF CONTINUE HELP txts

    //IGNORE SCRATCH txts
    static String txt44 = "Mitsuo takes a look at his scratch again. It was probably nothing, he thought.";
    static String txt45 = "As Mitsuo took his steps, a commotion started beside them.";
    static String txt46 = "Toni was spitting blood out of nowhere.";
    static String txt47 = "Everyone took a step back.";
    static String txt48 = "Toni started acting weird.";
    static String txt49 = "With a sudden change in her eyes, Toni screeched. She then begins to scratch those near her.";
    static String txt50 = "Bryan tried to hold Toni down.";
    static String txt51 = "Chaos starts to arise.";
    static String txt52 = "Mitsuo started coughing blood and went out of control.";
    static String txt53 = "Mitsuo attacked Alex and dropped him to the floor.";
    static String txt54 = "Alex tried to get loose of the restraints.";
    static String txt55 = "Mitsuo, however was not himself. He starts to attack LeRodge too.";
    //END OF IGNORE SCRATCH txts

    //TELL EVERYONE txts
    static String txt56 = "No one heard Mitsuo.";
    static String txt57 = "Natasha glances at Mitsuo.";
    static String txt58 = "Mitsuo stopped talking when Toni spat blood out of nowhere.";
    static String txt59 = "Toni started to cough more blood.";
    //END OF TELL EVERYONE txts

    //ASK BRYAN txts
    static String txt60 = "Mitsuo walks to Bryan.";
    static String txt61 = "Bryan looks at Mitsuo's arm. He sees a scratch.";
    static String txt62 = "Bryan realizes something.";
    //END OF ASK BRYAN txts

    //ASK TONI txts
    static String txt63 = "Mitsuo approaches Toni.";
    static String txt64 = "Toni looks at him, and understood what he was trying to say.";
    static String txt65 = "Toni nods slowly.";
    //END OF ASK TONI txts

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
    public static String gettxt30() { return txt30; }
    public static String gettxt31() { return txt31; }
    public static String gettxt32() { return txt32; }
    public static String gettxt33() { return txt33; }
    public static String gettxt34() { return txt34; }
    public static String gettxt35() { return txt35; }
    public static String gettxt36() { return txt36; }
    public static String gettxt37() { return txt37; }
    public static String gettxt38() { return txt38; }
    public static String gettxt39() { return txt39; }
    public static String gettxt40() { return txt40; }
    public static String gettxt41() { return txt41; }
    public static String gettxt42() { return txt42; }
    public static String gettxt43() { return txt43; }
    public static String gettxt44() { return txt44; }
    public static String gettxt45() { return txt45; }
    public static String gettxt46() { return txt46; }
    public static String gettxt47() { return txt47; }
    public static String gettxt48() { return txt48; }
    public static String gettxt49() { return txt49; }
    public static String gettxt50() { return txt50; }
    public static String gettxt51() { return txt51; }
    public static String gettxt52() { return txt52; }
    public static String gettxt53() { return txt53; }
    public static String gettxt54() { return txt54; }
    public static String gettxt55() { return txt55; }
    public static String gettxt56() { return txt56; }
    public static String gettxt57() { return txt57; }
    public static String gettxt58() { return txt58; }
    public static String gettxt59() { return txt59; }
    public static String gettxt60() { return txt60; }
    public static String gettxt61() { return txt61; }
    public static String gettxt62() { return txt62; }
    public static String gettxt63() { return txt63; }
    public static String gettxt64() { return txt64; }
    public static String gettxt65() { return txt65; }

    public int getnextdlg() { return nextdlg; }
    public void setnextdlg(int nextdlg) { this.nextdlg = nextdlg; }
}
