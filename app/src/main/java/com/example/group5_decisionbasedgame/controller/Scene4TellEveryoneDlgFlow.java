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

public class Scene4TellEveryoneDlgFlow {

    public Scene4TellEveryoneDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void thirdscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene4TellEveryoneDlgFlow kenjigwapo, ImageView imgMitsuo) {
        dlg.setText(MitsuoDialogue.gettxtMitsuo19());
        imgMitsuo.setVisibility(View.VISIBLE);
        txtname.setText("Mitsuo");
        txtname.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt56());
                break;
            case 2:
                dlg.setText(MitsuoDialogue.gettxtMitsuo20());
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                break;
            case 3:
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt57());
                break;
            case 4:
                dlg.setText(NatashaDialogue.gettxtNatasha14());
                imgNatasha.setVisibility(View.VISIBLE);
                txtname.setText("Natasha");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 5:
                imgNatasha.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo21());
                txtname.setText("Mitsuo");
                break;
            case 6:
                dlg.setText(ScenarioDialogues.gettxt58());
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 7:
                dlg.setText(BryanDialogue.gettxtBryan14());
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 8:
                imgToni.setVisibility(View.VISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.gettxtToni27());
                txtname.setText("Toni");
                break;
            case 9:
                dlg.setText(ScenarioDialogues.gettxt59());
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 10:
                dlg.setText(BryanDialogue.gettxtBryan15());
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 11:
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt49());
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 12:
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan16());
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 13:
                txtname.setVisibility(View.INVISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt50());
                break;
            case 14:
                txtname.setText("Alex");
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex20());
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 15:
                dlg.setText(ScenarioDialogues.gettxt51());
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                break;
            case 16:
                dlg.setText(ScenarioDialogues.gettxt52());
                break;
            case 17:
                imgAlex.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex21());
                break;
            case 18:
                dlg.setText(ScenarioDialogues.gettxt53());
                imgAlex.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 19:
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge16());
                txtname.setText("LeRodge");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 20:
                imgAlex.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex22());
                txtname.setText("Alex");
                break;
            case 21:
                imgAlex.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt54());
                break;
            case 22:
                dlg.setText(ScenarioDialogues.gettxt55());
                break;
            case 23:
                break;

        }
    }
}
