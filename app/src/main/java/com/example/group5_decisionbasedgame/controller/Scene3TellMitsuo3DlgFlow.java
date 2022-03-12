package com.example.group5_decisionbasedgame.controller;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.group5_decisionbasedgame.R;
import com.example.group5_decisionbasedgame.model.AlexDialogue;
import com.example.group5_decisionbasedgame.model.BryanDialogue;
import com.example.group5_decisionbasedgame.model.LeRodgeDialogue;
import com.example.group5_decisionbasedgame.model.MitsuoDialogue;
import com.example.group5_decisionbasedgame.model.NatashaDialogue;
import com.example.group5_decisionbasedgame.model.ScenarioDialogues;
import com.example.group5_decisionbasedgame.model.ToniDialogue;

public class Scene3TellMitsuo3DlgFlow {
    public Scene3TellMitsuo3DlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void thirdscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene3TellMitsuo3DlgFlow kenjigwapo) {
        dlg.setText(ScenarioDialogues.gettxt7());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                dlg.setText(ToniDialogue.gettxtToni1());
                imgToni.setVisibility(View.VISIBLE);
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("Toni");
                break;
            case 2:
                dlg.setText(NatashaDialogue.gettxtNatasha1());
                imgNatasha.setVisibility(View.VISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setText("Natasha");
                break;
            case 3:
                dlg.setText(ToniDialogue.gettxtToni2());
                imgNatasha.setVisibility(View.INVISIBLE);
                imgToni.setVisibility(View.VISIBLE);
                txtname.setText("Toni");
                break;
            case 4:
                dlg.setText(AlexDialogue.gettxtAlex1());
                imgToni.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                txtname.setText("Alex");
                break;
            case 5:
                dlg.setText(ScenarioDialogues.gettxtOldMan2());
                imgAlex.setVisibility(View.INVISIBLE);
                txtname.setText("Old man");
                break;
            case 6:
                dlg.setText(LeRodgeDialogue.gettxtLeRodge1());
                imgLeRodge.setVisibility(View.VISIBLE);
                txtname.setText("LeRodge");
                break;
            case 7:
                dlg.setText(MitsuoDialogue.gettxtMitsuo1());
                imgLeRodge.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 8:
                dlg.setText(ScenarioDialogues.gettxt8());
                dlgscene.setBackgroundResource(R.drawable.backgroundscene1_2);
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 9:
                dlg.setText(ToniDialogue.gettxtToni3());
                imgToni.setVisibility(View.VISIBLE);
                txtname.setText("Toni");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 10:
                dlg.setText(MitsuoDialogue.gettxtMitsuo2());
                imgMitsuo.setVisibility(View.VISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 11:
                dlg.setText(ToniDialogue.gettxtToni4());
                imgMitsuo.setVisibility(View.INVISIBLE);
                imgToni.setVisibility(View.VISIBLE);
                txtname.setText("Toni");
                break;
            case 12:
                dlg.setText(MitsuoDialogue.gettxtMitsuo3());
                imgToni.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 13:
                dlg.setText(ToniDialogue.gettxtToni5());
                imgToni.setVisibility(View.VISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setText("Toni");
                break;
            case 14:
                dlg.setText(MitsuoDialogue.gettxtMitsuo4());
                imgToni.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 15:
                dlg.setText(ToniDialogue.gettxtToni6());
                imgToni.setVisibility(View.VISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setText("Toni");
                break;
            case 16:
                dlg.setText(MitsuoDialogue.gettxtMitsuo5());
                imgToni.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 17:
                dlg.setText(ToniDialogue.gettxtToni7());
                imgToni.setVisibility(View.VISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setText("Toni");
                break;
            case 18:
                dlg.setText(ScenarioDialogues.gettxt9());
                imgToni.setVisibility(View.INVISIBLE);
                txtname.setVisibility(View.INVISIBLE);
                break;
            case 19:
                dlg.setText(MitsuoDialogue.gettxtMitsuo6());
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                txtname.setVisibility(View.VISIBLE);
                break;
            case 20:
                dlg.setText(ToniDialogue.gettxtToni8());
                imgToni.setVisibility(View.VISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setText("Toni");
                break;
            case 21:
                dlg.setText(MitsuoDialogue.gettxtMitsuo7());
                imgToni.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 22:
                dlg.setText(ToniDialogue.gettxtToni9());
                imgToni.setVisibility(View.VISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                txtname.setText("Toni");
                break;
            case 23:
                dlg.setText(MitsuoDialogue.gettxtMitsuo8());
                imgToni.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.VISIBLE);
                txtname.setText("Mitsuo");
                break;
            case 24:
                txtname.setVisibility(View.INVISIBLE);
                imgMitsuo.setVisibility(View.INVISIBLE);
                break;



        }
    }
}
