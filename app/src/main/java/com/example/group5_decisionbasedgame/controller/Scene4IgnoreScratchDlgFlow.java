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

public class Scene4IgnoreScratchDlgFlow {
    public Scene4IgnoreScratchDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void thirdscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene4IgnoreScratchDlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt44());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge15());
                break;
            case 2:
                txtname.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt45());
                break;
            case 3:
                dlg.setText(ScenarioDialogues.gettxt46());
                break;
            case 4:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan14());
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 5:
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt47());
                imgBryan.setVisibility(View.INVISIBLE);
                break;
            case 6:
                dlg.setText(ScenarioDialogues.gettxt48());
                break;
            case 7:
                dlg.setText(BryanDialogue.gettxtBryan15());
                imgBryan.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                break;
            case 8:
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt49());
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 9:
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan14());
                imgBryan.setVisibility(View.VISIBLE);
                break;
            case 10:
                txtname.setVisibility(View.INVISIBLE);
                imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt50());
                break;
            case 11:
                txtname.setText("Alex");
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex20());
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 12:
                dlg.setText(ScenarioDialogues.gettxt51());
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                break;
            case 13:
                dlg.setText(ScenarioDialogues.gettxt52());
                break;
            case 14:
                imgAlex.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex21());
                break;
            case 15:
                dlg.setText(ScenarioDialogues.gettxt53());
                imgAlex.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 16:
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge16());
                txtname.setText("LeRodge");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 17:
                imgAlex.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex22());
                txtname.setText("Alex");
                break;
            case 18:
                imgAlex.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt54());
                break;
            case 19:
                dlg.setText(ScenarioDialogues.gettxt55());
                break;
            case 20:
                break;
        }
    }
}
