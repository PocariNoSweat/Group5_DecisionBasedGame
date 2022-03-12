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
import com.example.group5_decisionbasedgame.view.Scene4AskBryan;

public class Scene4AskBryanDlgFlow {
    public Scene4AskBryanDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void thirdscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene4AskBryanDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt60());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan17());
                break;
            case 2:
                imgBryan.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt61());
                break;
            case 3:
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan18());
                break;
            case 4:
                imgBryan.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                dlg.setText(MitsuoDialogue.gettxtMitsuo22());
                break;
            case 5:
                dlg.setText(ScenarioDialogues.gettxt62());
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 6:
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan19());
                txtname.setText("Bryan");
                break;
            case 7:
                imgBryan.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                dlg.setText(MitsuoDialogue.gettxtMitsuo23());
                break;
            case 8:
                dlg.setText(ScenarioDialogues.gettxt58());
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 9:
                dlg.setText(BryanDialogue.gettxtBryan14());
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 10:
                imgToni.setVisibility(View.VISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.gettxtToni27());
                txtname.setText("Toni");
                break;
            case 11:
                dlg.setText(ScenarioDialogues.gettxt59());
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 12:
                dlg.setText(BryanDialogue.gettxtBryan15());
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 13:
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt49());
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 14:
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan16());
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 15:
                txtname.setVisibility(View.INVISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt50());
                break;
            case 16:
                txtname.setText("Alex");
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex20());
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 17:
                dlg.setText(ScenarioDialogues.gettxt51());
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                break;
            case 18:
                dlg.setText(ScenarioDialogues.gettxt52());
                break;
            case 19:
                imgAlex.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex21());
                break;
            case 20:
                dlg.setText(ScenarioDialogues.gettxt53());
                imgAlex.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 21:
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge16());
                txtname.setText("LeRodge");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 22:
                imgAlex.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex22());
                txtname.setText("Alex");
                break;
            case 23:
                imgAlex.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt54());
                break;
            case 24:
                dlg.setText(ScenarioDialogues.gettxt55());
                break;
            case 25:
                break;

        }
    }
}
