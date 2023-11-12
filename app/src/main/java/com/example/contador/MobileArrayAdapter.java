package com.example.contador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public MobileArrayAdapter(Context context, String[] values) {
        super(context, R.layout.list_mobile, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_mobile, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        if (s.equals("Doomsday Clock")) {
            imageView.setImageResource(R.drawable.corrosion_impending_day_sinclair);
        } else if (s.equals("Golden Apple/False Apple")) {
            imageView.setImageResource(R.drawable.corrosion_legerdemain_gregor);
        } else if (s.equals("My Form Empties")) {
            imageView.setImageResource(R.drawable.corrosion_ya_3fnyat3fpam_outis);
        } else if (s.equals("Forsaken Murderer")) {
            imageView.setImageResource(R.drawable.corrosion_regret_meursault);
        } else if (s.equals("Have You Become Strong")) {
            imageView.setImageResource(R.drawable.corrosion_screwloose_wallop_meursault);
        } else if (s.equals("Ebony´s Queen Apple")) {
            imageView.setImageResource(R.drawable.corrosion_ebony_stem_outis);
        } else if (s.equals("Aleway Watchdog")) {
            imageView.setImageResource(R.drawable.corrosion_telepole_don_quixote);
        } else if (s.equals("Pink Shoes")) {
            imageView.setImageResource(R.drawable.corrosion_roseate_desire_ishmael);
        } else if (s.equals("Baba Yaga")) {
            imageView.setImageResource(R.drawable.corrosion_rime_shank_rodion);
        } else if (s.equals("Drifting Fox")) {
            imageView.setImageResource(R.drawable.corrosion_sunshower_yi_sang);
        } else if (s.equals("Shock Centipide")) {
            imageView.setImageResource(R.drawable.corrosion_aedd_heathcliff);
        } else if (s.equals("Fairy Gentleman")) {
            imageView.setImageResource(R.drawable.fa);
        } else if (s.equals("Fairy Long-Legs")) {
            imageView.setImageResource(R.drawable.fa3);
        } else if (s.equals("So That No One Will Cry")) {
            imageView.setImageResource(R.drawable.stnowc);
        } else if (s.equals("Brazen Bull")) {
            imageView.setImageResource(R.drawable.corrosion_capote_meursault);
        } else if (s.equals("Fairy Lantern")) {
            imageView.setImageResource(R.drawable.corrosion_lantern_sinclair);
        } else if (s.equals("Headless Ithchys")) {
            imageView.setImageResource(R.drawable.corrosion_fluid_sac_faust);
        } else if (s.equals("KQE-1J-23")) {
            imageView.setImageResource(R.drawable.kq);
        } else if (s.equals("Wayward Pasenger")) {
            imageView.setImageResource(R.drawable.corrosion_dimension_shredder_hong_lu);
        } else if (s.equals("Steam Transport Machine")) {
            imageView.setImageResource(R.drawable.steam);
        } else if (s.equals("Sign of Roses")) {
            imageView.setImageResource(R.drawable.roses);
        } else if (s.equals("Bluebbering Toad")) {
            imageView.setImageResource(R.drawable.blue);
        } else if (s.equals("Kromer the Dreamer of Human Wholeness")) {
            imageView.setImageResource(R.drawable.kromer);
        } else if (s.equals("Who Denies All")) {
            imageView.setImageResource(R.drawable.don);
        } else if (s.equals("Scorched Girl")) {
            imageView.setImageResource(R.drawable.corrosion_4th_match_flame_rodion);
        } else if (s.equals("Spider Bud")) {
            imageView.setImageResource(R.drawable.corrosion_red_eyes_29_ry3f);
        } else if (s.equals("Opened Can of WellCheers")) {
            imageView.setImageResource(R.drawable.corrosion_soda_rysh);
        } else if (s.equals("Ardor Blossom Moth")) {
            imageView.setImageResource(R.drawable.corrosion_ardor_blossom_star_ishmael);
        } else if (s.equals("Basilisoup")) {
            imageView.setImageResource(R.drawable.corrosion_lifetime_stew_sinclair);
        } else if (s.equals("Heavenly Executor´s Scribe")) {
            imageView.setImageResource(R.drawable.corrosion_pursuance_meursault);
        } else if (s.equals("Hurting Teddy Bear")) {
            imageView.setImageResource(R.drawable.corrosion_hex_nail_faust);
        } else if (s.equals("Pagoda Veneration")) {
            imageView.setImageResource(R.drawable.corrosion_wishing_cairn_yi_sang);
        }
            return rowView;
        }
    }

