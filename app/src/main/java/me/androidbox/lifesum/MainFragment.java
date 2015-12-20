package me.androidbox.lifesum;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.main_fragment, container, false);

        final TextView tvTitle = (TextView)view.findViewById(R.id.tvTitle);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "CalligraphyFLF.ttf");
        tvTitle.setTypeface(typeface);

        final LinearLayout beHealtheir = (LinearLayout)view.findViewById(R.id.be_healthier);
        beHealtheir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Be Healthier", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
