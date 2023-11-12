package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Mirror extends ListActivity {
    Button Retornar;
    ListView mirrorView;
    static final String[] IMAGES =
            new String[] { "Doomsday Clock", "Golden Apple/False Apple", "My Form Empties", "Forsaken Murderer", "Have You Become Strong", "Ebony´s Queen Apple"
    , "Aleway Watchdog", "Pink Shoes", "Baba Yaga", "Drifting Fox", "Shock Centipide", "Fairy Gentleman", "Fairy Long-Legs", "So That No One Will Cry", "Fairy Lantern", "Headless Ithchys",
                    "KQE-1J-23", "Wayward Pasenger", "Steam Transport Machine", "Sign of Roses", "Bluebbering Toad", "Kromer the Dreamer of Human Wholeness", "Who Denies All",
                    "Scorched Girl", "Spider Bud", "Opened Can of WellCheers", "Ardor Blossom Moth", "Basilisoup", "Heavenly Executor´s Scribe", "Hurting Teddy Bear", "Pagoda Veneration"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md);
        mirrorView = findViewById(android.R.id.list);
        mirrorView.setAdapter(new MobileArrayAdapter(this, IMAGES));
        Retornar = findViewById(R.id.button21);
        Retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irRetornar();

            }
        });
    }
    public void irRetornar () {
        Intent intent = new Intent(this, Logs.class);
        startActivity(intent);

    }

}