package sylvain.toutdouxliste.fr.tout_doux_liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodoActivity extends AppCompatActivity {
    //Création des Attributs
    private Intent intention;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        //Instanciation des attributs

        intention = new Intent(this.getBaseContext(), TodoActivity.class);

    }

    public void onClickNouvelleTache(View view) {
       // Intent intention = new Intent();
        intention.setClass(this, NouvelleTacheActivity.class);
        startActivity(intention);
    }
}
