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
import com.example.group5_decisionbasedgame.view.Scene3TellTruth;

public class Scene3TellTruthDlgFlow {
    public Scene3TellTruthDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void firstscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene3TellTruthDlgFlow kenjigwapo, ImageView imgToni) {
        dlg.setText(ToniDialogue.gettxtToni26());
        txtname.setText("Toni");
        txtname.setVisibility(View.VISIBLE);
        imgToni.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                dlg.setText(NatashaDialogue.gettxtNatasha11());
                txtname.setText("Natasha");
                imgNatasha.setVisibility(View.VISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                break;
            case 2:
                dlg.setText(ScenarioDialogues.gettxt37());
                imgNatasha.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 3:
                dlg.setText(NatashaDialogue.gettxtNatasha12());
                txtname.setVisibility(View.VISIBLE);
                imgNatasha.setVisibility(View.VISIBLE);
                break;
            case 4:
                dlg.setText(ScenarioDialogues.gettxt38());
                txtname.setVisibility(View.INVISIBLE);
                imgNatasha.setVisibility(View.INVISIBLE);
                break;
            case 5:
                dlg.setText(BryanDialogue.gettxtBryan13());
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 6:
                dlg.setText(AlexDialogue.gettxtAlex19());
                txtname.setText("Alex");
                imgBryan.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 7:
                break;

        }
    }
}
