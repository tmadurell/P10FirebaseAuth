package com.main.p10firebaseauth;

import android.os.Bundle;

import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.navigation.*;
import android.view.*;


public class RegisterFragment extends Fragment {

    NavController navController;   // <-----------------

    public RegisterFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);  // <-----------------
    }
}