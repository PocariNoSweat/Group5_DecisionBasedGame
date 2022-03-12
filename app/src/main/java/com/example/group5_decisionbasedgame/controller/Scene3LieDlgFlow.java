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

public class Scene3LieDlgFlow {

    public Scene3LieDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void firstscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene3LieDlgFlow kenjigwapo, ImageView imgToni) {
        dlg.setText(ToniDialogue.gettxtToni21());
        txtname.setText("Toni");
        txtname.setVisibility(View.VISIBLE);
        imgToni.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                txtname.setVisibility(View.INVISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt30());
                break;
            case 2:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan10());
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 3:
                txtname.setVisibility(View.INVISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt31());
                break;
            case 4:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                dlg.setText(ToniDialogue.gettxtToni22());
                break;
            case 5:
                txtname.setVisibility(View.INVISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt32());
                break;
            case 6:
                break;
        }
    }
}
