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
import com.example.group5_decisionbasedgame.view.Scene3AvoidQues;

public class Scene3AvoidQuesDlgFlow {
    public Scene3AvoidQuesDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void firstscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene3AvoidQuesDlgFlow kenjigwapo, ImageView imgToni) {
        dlg.setText(ToniDialogue.gettxtToni24());
        txtname.setText("Toni");
        txtname.setVisibility(View.VISIBLE);
        imgToni.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt35());
                imgToni.setVisibility(View.INVISIBLE);
                break;
            case 2:
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan13());
               imgBryan.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                break;
            case 3:
                dlg.setText(ToniDialogue.gettxtToni25());
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
               imgBryan.setVisibility(View.INVISIBLE);
                break;
            case 4:
                dlg.setText(ScenarioDialogues.gettxt36());
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 5:
                dlg.setText(AlexDialogue.gettxtAlex18());
                imgToni.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Alex");
                break;
            case 6:
                break;
        }
    }
}
