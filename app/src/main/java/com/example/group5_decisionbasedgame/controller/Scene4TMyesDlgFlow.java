package com.example.group5_decisionbasedgame.controller;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.group5_decisionbasedgame.model.AlexDialogue;
import com.example.group5_decisionbasedgame.model.BryanDialogue;
import com.example.group5_decisionbasedgame.model.LeRodgeDialogue;
import com.example.group5_decisionbasedgame.model.MitsuoDialogue;
import com.example.group5_decisionbasedgame.model.NatashaDialogue;
import com.example.group5_decisionbasedgame.model.ScenarioDialogues;
import com.example.group5_decisionbasedgame.model.ToniDialogue;

public class Scene4TMyesDlgFlow {

    public Scene4TMyesDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void fourthscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene4TMyesDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt10());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout scene3decision3) {
        switch (next.getnextdlg()) {

            case 1:
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo9());
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 2:
                txtname.setText("Toni");
                dlg.setText(ToniDialogue.gettxtToni10());
                imgToni.setVisibility(View.VISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                break;
            case 3:
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan1());
                imgToni.setVisibility(View.INVISIBLE);
                //pending imgBryan.setVisibility(View.VISIBLE);
                break;
            case 4:
                txtname.setText("Natasha");
                dlg.setText(NatashaDialogue.gettxtNatasha2());
                imgNatasha.setVisibility(View.VISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                break;
            case 5:
               txtname.setText("LeRodge");
               dlg.setText(LeRodgeDialogue.gettxtLeRodge2());
                imgNatasha.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                break;
            case 6:
                txtname.setText("Alex");
                dlg.setText(AlexDialogue.gettxtAlex2());
                imgLeRodge.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 7:
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt11());
                break;
            case 8:
                txtname.setText("Toni");
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(ToniDialogue.gettxtToni11());
                imgToni.setVisibility(View.VISIBLE);
                break;
            case 9:
                txtname.setText("Alex");
                dlg.setText(AlexDialogue.gettxtAlex3());
                imgToni.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 10:
                txtname.setText("Toni");
                dlg.setText(ToniDialogue.gettxtToni12());
                imgToni.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                break;
            case 11:
                txtname.setText("Mitsuo");
                dlg.setText(MitsuoDialogue.gettxtMitsuo10());
                imgToni.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                break;
            case 12:
                txtname.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt23());
                break;
            case 13:
                dlg.setText(ScenarioDialogues.gettxt12());
                break;
            case 14:
                dlg.setText(ScenarioDialogues.gettxt24());
                break;
            case 15:
                dlg.setText(NatashaDialogue.gettxtNatasha6());
                txtname.setVisibility(View.VISIBLE);
                imgNatasha.setVisibility(View.VISIBLE);
                txtname.setText("Natasha");
                break;
            case 16:
                dlg.setText(AlexDialogue.gettxtAlex4());
                txtname.setText("Alex");
                imgNatasha.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 17:
                dlg.setText(NatashaDialogue.gettxtNatasha3());
                txtname.setText("Natasha");
                imgNatasha.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                break;
            case 18:
                dlg.setText(AlexDialogue.gettxtAlex5());
                txtname.setText("Alex");
                imgAlex.setVisibility(View.VISIBLE);
                imgNatasha.setVisibility(View.INVISIBLE);
                break;
            case 19:
                dlg.setText(NatashaDialogue.gettxtNatasha4());
                txtname.setText("Natasha");
                imgAlex.setVisibility(View.INVISIBLE);
                imgNatasha.setVisibility(View.VISIBLE);
                break;
            case 20:
                dlg.setText(MitsuoDialogue.gettxtMitsuo11());
                txtname.setText("Mitsuo");
                imgNatasha.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                break;
            case 21:
                dlg.setText(ScenarioDialogues.gettxt13());
                txtname.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                break;
            case 22:
                txtname.setText("LeRodge");
                txtname.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge3());
                break;
            case 23:
                txtname.setText("Alex");
                imgLeRodge.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex6());
                break;
            case 24:
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt14());
                break;
            case 25:
                dlg.setText(ScenarioDialogues.gettxt15());
                break;
            case 26:
                dlg.setText(LeRodgeDialogue.gettxtLeRodge4());
                txtname.setText("LeRodge");
                txtname.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                break;
            case 27:
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan2());
                imgBryan.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                break;
            case 28:
                txtname.setText("LeRodge");
                dlg.setText(LeRodgeDialogue.gettxtLeRodge5());
                imgBryan.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                break;
            case 29:
                txtname.setText("Natasha");
                dlg.setText(NatashaDialogue.gettxtNatasha5());
                imgLeRodge.setVisibility(View.INVISIBLE);
                imgNatasha.setVisibility(View.VISIBLE);
                break;
            case 30:
                txtname.setText("Alex");
                dlg.setText(AlexDialogue.gettxtAlex7());
                imgNatasha.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 31:
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt16());
                break;
            case 32:
                dlg.setText(ScenarioDialogues.gettxt17());
                break;
            case 33:
                dlg.setText(AlexDialogue.gettxtAlex8());
                txtname.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 34:
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt18());
                break;
            case 35:
                txtname.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex9());
                break;
            case 36:
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan3());
                imgAlex.setVisibility(View.INVISIBLE);
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 37:
                txtname.setText("Alex");
                dlg.setText(AlexDialogue.gettxtAlex10());
                imgBryan.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 38:
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt19());
                imgAlex.setVisibility(View.INVISIBLE);
                break;
            case 39:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan4());
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 40:
               txtname.setText("Alex");
               dlg.setText(AlexDialogue.gettxtAlex11());
               imgBryan.setVisibility(View.INVISIBLE);
               imgAlex.setVisibility(View.VISIBLE);
               break;
            case 41:
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt20());
                imgAlex.setVisibility(View.INVISIBLE);
                break;
            case 42:
                dlg.setText(ScenarioDialogues.gettxt21());
                break;
            case 43:
                dlg.setText(ScenarioDialogues.gettxt22());
                break;
            case 44:
                break;






        }
    }
}
