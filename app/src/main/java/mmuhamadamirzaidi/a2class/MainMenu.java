package mmuhamadamirzaidi.a2class;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button b_shadowgame, b_memorygame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        b_shadowgame = (Button) findViewById(R.id.b_shadowgame);
        b_shadowgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShadowGame();
            }
        });

        b_memorygame = (Button) findViewById(R.id.b_memorygame);
        b_memorygame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMemoryGame();
            }
        });
    }

    public void openShadowGame(){
        Intent intent = new Intent(this, ShadowGame.class);
        startActivity(intent);
    }

    public void openMemoryGame(){
        Intent intent = new Intent(this, MemoryGame.class);
        startActivity(intent);
    }
}
