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

public class Scene4AskToniDlgFlow {
    public Scene4AskToniDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void thirdscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene4AskToniDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt63());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                dlg.setText(MitsuoDialogue.gettxtMitsuo24());
                imgMitsuo.setVisibility(View.VISIBLE);
                break;
            case 2:
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt64());
                imgMitsuo.setVisibility(View.INVISIBLE);
                break;
            case 3:
                txtname.setText("Toni");
                dlg.setText(ToniDialogue.gettxtToni28());
                txtname.setVisibility(View.VISIBLE);
                imgToni.setVisibility(View.VISIBLE);
                break;
            case 4:
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setText("Mitsuo");
                dlg.setText(MitsuoDialogue.gettxtMitsuo25());
                imgMitsuo.setVisibility(View.VISIBLE);
                break;
            case 5:
                txtname.setText("Toni");
                dlg.setText(ToniDialogue.gettxtToni29());
                imgMitsuo.setVisibility(View.INVISIBLE);
                imgToni.setVisibility(View.VISIBLE);
                break;
            case 6:
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setText("Mitsuo");
                dlg.setText(MitsuoDialogue.gettxtMitsuo26());
                imgMitsuo.setVisibility(View.VISIBLE);
                break;
            case 7:
                dlg.setText(ScenarioDialogues.gettxt65());
                txtname.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                break;
            case 8:
                break;

        }
    }
}
