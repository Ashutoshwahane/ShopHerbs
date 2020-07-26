package com.omkar.shopherb.activity.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.omkar.shopherb.R;
import com.omkar.shopherb.activity.MainActivity;
import com.omkar.shopherb.activity.ui.HospitalFragment;

public class HomeFragment extends Fragment implements View.OnClickListener {

    Button hospitalButton;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        hospitalButton = root.findViewById(R.id.hospital_button);
        hospitalButton.setOnClickListener(this);







        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.hospital_button : {
                HospitalFragment hospitalFragment = new HospitalFragment();
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.homeframelayout,hospitalFragment).commit();

            }
        }

    }
}
