package com.omkar.shopherb.activity.ui.shop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.omkar.shopherb.R;


public class ShopFragment extends Fragment {

    EditText symptoms;

    private ShopViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(ShopViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shop, container, false);

        symptoms = root.findViewById(R.id.searchShopEditText);
        String symptomsText = symptoms.getText().toString();




        return root;
    }
}
