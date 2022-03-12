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

public class Scene3ContinueHelpDlgFlow {
    public Scene3ContinueHelpDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void secondscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene3ContinueHelpDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt39());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                dlg.setText(LeRodgeDialogue.gettxtLeRodge14());
                txtname.setText("LeRodge");
                txtname.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                break;
            case 2:
                dlg.setText(ScenarioDialogues.gettxt40());
                txtname.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                break;
            case 3:
                dlg.setText(ScenarioDialogues.gettxt41());
                break;
            case 4:
                dlg.setText(ScenarioDialogues.gettxt42());
                break;
            case 5:
                dlg.setText(NatashaDialogue.gettxtNatasha13());
                imgNatasha.setVisibility(View.VISIBLE);
                txtname.setText("Natasha");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 6:
                imgNatasha.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt43());
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 7:
                break;
        }
    }
}
