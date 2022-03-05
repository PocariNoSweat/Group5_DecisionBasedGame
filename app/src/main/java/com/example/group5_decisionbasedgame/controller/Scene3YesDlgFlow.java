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

public class Scene3YesDlgFlow {

    public Scene3YesDlgFlow() {

        new AlexDialogue();
        new ToniDialogue();
        new LeRodgeDialogue();
        new NatashaDialogue();
        new MitsuoDialogue();
        new BryanDialogue();
    }

    public static void fourthscene(TextView dlg, TextView txtname, ScenarioDialogues next, Scene3YesDlgFlow kenjigwapo) {
        txtname.setText("Toni");
        txtname.setVisibility(View.VISIBLE);
        dlg.setText(ToniDialogue.gettxtToni13());
    }

    @SuppressLint("SetTextI18n")
    public void nextdlg(TextView dlg, TextView txtname, ScenarioDialogues next, ImageView imgAlex, ImageView imgLeRodge, ImageView imgToni, ImageView imgBryan, ImageView imgNatasha, ImageView imgMitsuo, ConstraintLayout dlgscene) {
        switch (next.getnextdlg()) {
            case 1:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge6());
                break;
            case 2:
                txtname.setText("Natasha");
                imgLeRodge.setVisibility(View.INVISIBLE);
               // imgNatasha.setVisibility(View.VISIBLE);
                dlg.setText(NatashaDialogue.gettxtNatasha7());
                break;
            case 3:
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
               // imgNatasha.setVisibility(View.INVISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge7());
                break;
            case 4:
                txtname.setText("Alex");
                imgLeRodge.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex12());
                break;
            case 5:
                txtname.setText("Mitsuo");
                imgAlex.setVisibility(View.INVISIBLE);
              //  imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo12());
                break;
            case 6:
                txtname.setText("Bryan");
               // imgMitsuo.setVisibility(View.INVISIBLE);
                //imgBryan.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan5());
                break;
            case 7:
                txtname.setVisibility(View.INVISIBLE);
              //  imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt25());
                break;
            case 8:
                txtname.setVisibility(View.VISIBLE);
               // imgBryan.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan6());
                break;
            case 9:
                txtname.setText("Mitsuo");
               // imgBryan.setVisibility(View.INVISIBLE);
             //   imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo18());
                break;
            case 10:
                txtname.setText("Toni");
             //   imgMitsuo.setVisibility(View.INVISIBLE);
                imgToni.setVisibility(View.VISIBLE);
                dlg.setText(ToniDialogue.gettxtToni14());
            case 11:
                txtname.setText("LeRodge");
                imgToni.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge8());
                break;
            case 12:
                txtname.setText("Alex");
                imgLeRodge.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex13());
                break;
            case 13:
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.gettxtToni15());
                break;
            case 14:
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
                imgToni.setVisibility(View.INVISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge9());
                break;
            case 15:
                txtname.setText("Mitsuo");
                imgLeRodge.setVisibility(View.INVISIBLE);
               // imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo13());
                break;
            case 16:
                txtname.setText("Natasha");
               // imgMitsuo.setVisibility(View.INVISIBLE);
               // imgNatasha.setVisibility(View.VISIBLE);
                dlg.setText(NatashaDialogue.gettxtNatasha8());
                break;
            case 17:
                txtname.setText("Alex");
                imgAlex.setVisibility(View.VISIBLE);
               // imgNatasha.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex14());
                break;
            case 18:
                txtname.setText("Natasha");
               // imgNatasha.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(NatashaDialogue.gettxtNatasha9());
                break;
            case 19:
                txtname.setText("Alex");
                imgAlex.setVisibility(View.VISIBLE);
              //  imgNatasha.setVisibility(View.INVISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex15());
                break;
            case 20:
                txtname.setText("Mitsuo");
                //imgMitsuo.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo14());
                break;
            case 21:
                txtname.setVisibility(View.INVISIBLE);
              //  imgMitsuo.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt26());
                break;
            case 22:
                dlg.setText(ScenarioDialogues.gettxt14());
                dlgscene.setBackgroundResource(R.drawable.backgroundscene1_2);
                break;
            case 23:
                dlg.setText(ScenarioDialogues.gettxt27());
                break;
            case 24:
                txtname.setVisibility(View.VISIBLE);
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge10());
                break;
            case 25:
                txtname.setText("Bryan");
                imgLeRodge.setVisibility(View.INVISIBLE);
               // imgBryan.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan7());
                break;
            case 26:
                dlg.setText(LeRodgeDialogue.gettxtLeRodge4());
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
              //  imgBryan.setVisibility(View.INVISIBLE);
                break;
            case 27:
                txtname.setText("Bryan");
                dlg.setText(BryanDialogue.gettxtBryan2());
                //  imgBryan.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                break;
            case 28:
                txtname.setText("LeRodge");
                dlg.setText(LeRodgeDialogue.gettxtLeRodge5());
                // imgBryan.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                break;
            case 29:
                txtname.setText("Natasha");
                dlg.setText(NatashaDialogue.gettxtNatasha5());
                imgLeRodge.setVisibility(View.INVISIBLE);
                //  imgNatasha.setVisibility(View.VISIBLE);
                break;
            case 30:
                txtname.setText("Alex");
                dlg.setText(AlexDialogue.gettxtAlex7());
                //   imgNatasha.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                break;
            case 31:
                dlgscene.setBackgroundResource(R.drawable.background1stscene);
                txtname.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt26());
                break;
            case 32:
                txtname.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex16());
                break;
            case 33:
                txtname.setText("Mitsuo");
                imgAlex.setVisibility(View.INVISIBLE);
             //   imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo15());
                break;
            case 34:
                txtname.setText("LeRodge");
               // imgMitsuo.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge11());
                break;
            case 35:
                txtname.setText("Mitsuo");
                imgLeRodge.setVisibility(View.INVISIBLE);
                //imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo16());
                break;
            case 36:
                txtname.setText("Bryan");
               // imgMitsuo.setVisibility(View.INVISIBLE);
             //   imgBryan.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan8());
                break;
            case 37:
                txtname.setVisibility(View.INVISIBLE);
              //  imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ScenarioDialogues.gettxt29());
                break;
            case 38:
                txtname.setVisibility(View.VISIBLE);
                dlg.setText(ToniDialogue.gettxtToni16());
                txtname.setText("Toni");
                break;
            case 39:
                txtname.setText("Bryan");
                //imgBryan.setVisibility(View.VISIBLE);
                dlg.setText(BryanDialogue.gettxtBryan9());
                break;
            case 40:
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
               // imgBryan.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.gettxtToni17());
                break;
            case 41:
                txtname.setText("Natasha");
                imgToni.setVisibility(View.INVISIBLE);
              // imgNatasha.setVisibility(View.VISIBLE);
                dlg.setText(NatashaDialogue.gettxtNatasha10());
                break;
            case 42:
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                // imgNatasha.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.gettxtToni18());
                break;
            case 43:
                txtname.setText("LeRodge");
                imgToni.setVisibility(View.INVISIBLE);
                imgLeRodge.setVisibility(View.VISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge12());
                break;
            case 44:
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.gettxtToni19());
                break;
            case 45:
                txtname.setText("Mitsuo");
                imgToni.setVisibility(View.INVISIBLE);
              //  imgMitsuo.setVisibility(View.VISIBLE);
                dlg.setText(MitsuoDialogue.gettxtMitsuo17());
                break;
            case 46:
                txtname.setText("Alex");
               // imgMitsuo.setVisibility(View.INVISIBLE);
                imgAlex.setVisibility(View.VISIBLE);
                dlg.setText(AlexDialogue.gettxtAlex17());
                break;
            case 47:
                txtname.setText("LeRodge");
                imgLeRodge.setVisibility(View.VISIBLE);
                imgAlex.setVisibility(View.INVISIBLE);
                dlg.setText(LeRodgeDialogue.gettxtLeRodge13());
                break;
            case 48:
                txtname.setText("Toni");
                imgToni.setVisibility(View.VISIBLE);
                imgLeRodge.setVisibility(View.INVISIBLE);
                dlg.setText(ToniDialogue.gettxtToni20());
                break;
            case 49:
                break;
        }
    }
}
