package com.example.group5_decisionbasedgame.controller;

import android.annotation.SuppressLint;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.group5_decisionbasedgame.model.AlexDialogue;
import com.example.group5_decisionbasedgame.model.BryanDialogue;
import com.example.group5_decisionbasedgame.model.LeRodgeDialogue;
import com.example.group5_decisionbasedgame.model.MitsuoDialogue;
import com.example.group5_decisionbasedgame.model.NatashaDialogue;
import com.example.group5_decisionbasedgame.model.ScenarioDialogues;
import com.example.group5_decisionbasedgame.model.ToniDialogue;
//TODO : All pendings are character models that aren't done
public class FirstSceneDlgFlow {
    public FirstSceneDlgFlow () {
        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void firstscene(TextView dlg, TextView txtname, ScenarioDialogues next, FirstSceneDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt0());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo) {
        switch (next.getnextdlg()) {
            case 1:
                dlg.setText(ScenarioDialogues.gettxt1());
                break;
            case 2:
                dlg.setText(AlexDialogue.getSC1_Alex1());
                imgAlex.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Alex");
                break;
            case 3:
                dlg.setText(AlexDialogue.getSC1_Alex2());
                break;
            case 4:
                dlg.setText(AlexDialogue.getSC1_Alex3());
                break;
            case 5:
                dlg.setText(AlexDialogue.getSC1_Alex4());
                break;
            case 6:
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt2());
                break;
            case 7:
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge1());
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                break;
            case 8:
                dlg.setText(MitsuoDialogue.getSC1_Mitsuo1());
              //pending  imgMitsuo.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 9:
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge2());
               //pending imgMitsuo.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                txtname.setText("LeRodge");
                break;
            case 10:
                dlg.setText(AlexDialogue.getSC1_Alex5());
                imgAlex.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                txtname.setText("Alex");
                break;
            case 11:
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt3());
                break;
            case 12:
                txtname.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                txtname.setText("LeRodge");
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge3());
                break;
            case 13:
                txtname.setText("Mitsuo");
              //pending  imgMitsuo.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(MitsuoDialogue.getSC1_Mitsuo2());
                break;
            case 14:
                txtname.setText("Alex");
              //pending  imgMitsuo.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.getSC1_Alex6());
                break;
            case 15:
                txtname.setText("LeRodge");
                imgAlex.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge4());
                break;
            case 16:
                txtname.setText("Mitsuo");
                imgLeRodge.setVisibility(View.INVISIBLE);
              //pending  imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.getSC1_Mitsuo3());
                break;
            case 17:
                txtname.setText("Alex");
                imgAlex.setVisibility(View.VISIBLE);
               //pending imgMitsuo.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.getSC1_Alex7());
                break;
            case 18:
                txtname.setText("LeRodge");
                imgAlex.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge5());
                break;
            case 19:
                txtname.setText("Alex");
                imgLeRodge.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.getSC1_Alex8());
                break;
            case 20:
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge6());
                break;
            case 21:
                txtname.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt4());
                break;
            case 22:
                txtname.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge7());
                break;
            case 23:
                txtname.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt5());
                break;
            case 24:
                txtname.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                txtname.setText("Alex");
                dlg.setText(AlexDialogue.getSC1_Alex9());
                break;
            case 25:
                txtname.setText("Mitsuo");
                imgAlex.setVisibility(View.INVISIBLE);
              //pending  imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.getSC1_Mitsuo4());
                break;
            case 26:
                txtname.setText("Alex");
                imgAlex.setVisibility(View.VISIBLE);
               //pending imgMitsuo.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.getSC1_Alex10());
                break;
            case 27:
                txtname.setText("Mitsuo");
                imgAlex.setVisibility(View.INVISIBLE);
               //pending imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.getSC1_Mitsuo5());
                break;
            case 28:
                txtname.setText("Alex");
                imgAlex.setVisibility(View.VISIBLE);
                //pending imgMitsuo.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.getSC1_Alex11());
                break;
            case 29:
                txtname.setText("LeRodge");
                imgAlex.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge8());
                break;
            case 30:
                imgLeRodge.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt6());
                break;
            case 31:
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(ToniDialogue.getSC1_Toni1());
                break;
            case 32:
                imgAlex.setVisibility(View.VISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setText("Alex");
                dlg.setText(AlexDialogue.getSC1_Alex12());
                break;
            case 33:
                txtname.setText("Natasha");
                imgAlex.setVisibility(View.INVISIBLE);
               //pending imgNatasha.setVisibility(View.VISIBLE);
                dlg.setText(NatashaDialogue.getSC1_Natasha1());
                break;
            case 34:
                txtname.setText("Bryan");
               //pending imgBryan.setVisibility(View.VISIBLE);
               //pending imgNatasha.setVisibility(View.INVISIBLE);
                dlg.setText(BryanDialogue.getSC1_Bryan1());
                break;
            case 35:
                txtname.setText("Alex");
                imgAlex.setVisibility(View.VISIBLE);
               //pending imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.getSC1_Alex13());
                break;
            case 36:
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.getSC1_Toni2());
                break;
            case 37:
                txtname.setText("Natasha");
                //pending imgNatasha.setVisibility(View.VISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                dlg.setText(NatashaDialogue.getSC1_Natasha2());
                break;
            case 38:
                txtname.setText("LeRodge");
                //pending imgLeRodge.setVisibility(View.VISIBLE);
               //pending imgNatasha.setVisibility(View.INVISIBLE);
                dlg.setText(LeRodgeDialogue.getSC1_LeRodge9());
                break;
            case 39:
                txtname.setText("Mitsuo");
                //pending imgMitsuo.setVisibility(View.VISIBLE);
                //pending imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(MitsuoDialogue.getSC1_Mitsuo6());
                break;
            case 40:
                //pending imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;

        }
    }
}
