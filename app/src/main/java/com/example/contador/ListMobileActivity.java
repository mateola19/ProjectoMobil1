package com.example.contador;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

public class ListMobileActivity extends ListActivity {

    static final String[] MOBILE_OS =
            new String[] { "Doomsday Clock", "Golden Apple/False Apple", "My Form Empties", "Forsaken Murderer", "Have You Become Strong", "Ebony´s Queen Apple"
    , "Aleway Watchdog", "Pink Shoes", "Baba Yaga", "Drifting Fox", "Shock Centipide", "Fairy Gentleman", "Fairy Long-Legs", "So That No One Will Cry", "Fairy Lantern", "Headless Ithchys",
                    "KQE-1J-23", "Wayward Pasenger", "Steam Transport Machine", "Sign of Roses", "Bluebbering Toad", "Kromer the Dreamer of Human Wholeness", "Who Denies All",
                    "Scorched Girl", "Spider Bud", "Opened Can of WellCheers", "Ardor Blossom Moth", "Basilisoup", "Heavenly Executor´s Scribe", "Hurting Teddy Bear", "Pagoda Veneration"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new MobileArrayAdapter(this, MOBILE_OS));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        //get selected items
        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

    }

}
