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

public class Scene3IgnoreQuesDlgFlow {
    public Scene3IgnoreQuesDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void firstscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene3IgnoreQuesDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt33());
        txtname.setVisibility(View.INVISIBLE);
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                dlg.setText(BryanDialogue.gettxtBryan11());
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                break;
            case 2:
                dlg.setText(ToniDialogue.gettxtToni23());
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                break;
            case 3:
                dlg.setText(BryanDialogue.gettxtBryan12());
                imgToni.setVisibility(View.INVISIBLE);
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                break;
            case 4:
                dlg.setText(ScenarioDialogues.gettxt34());
                imgBryan.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 5:
                dlg.setText(ScenarioDialogues.gettxt32());
                break;
            case 6:
                break;
        }
    }
}
