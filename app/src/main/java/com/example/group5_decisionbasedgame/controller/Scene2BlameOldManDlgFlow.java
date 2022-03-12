package com.example.group5_decisionbasedgame.controller;

import android.annotation.SuppressLint;
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

public class Scene2BlameOldManDlgFlow {
    public Scene2BlameOldManDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void secondscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene2BlameOldManDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt1D4());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo) {
        switch (next.getnextdlg()) {
            case 1:
                dlg.setText(ToniDialogue.getSC2DC4_Toni1());
                imgToni.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Toni");
                break;
            case 2:
                dlg.setText(ScenarioDialogues.gettxtOldMan1());
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setText("Old Man");
                break;
            case 3:
                dlg.setText(MitsuoDialogue.getSC2D4_Mitsuo1());
                //pending imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 4:
                dlg.setText(ToniDialogue.getSC2DC4_Toni2());
                imgToni.setVisibility(View.VISIBLE);
                txtname.setText("Toni");
                break;
            case 5:
                dlg.setText(NatashaDialogue.getSC2D4_Natasha1());
                imgToni.setVisibility(View.INVISIBLE);
                imgNatasha.setVisibility(View.VISIBLE);
                txtname.setText("Natasha");
                break;
            case 6:
                imgNatasha.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
