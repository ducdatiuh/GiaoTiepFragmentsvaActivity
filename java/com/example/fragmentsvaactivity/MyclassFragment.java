package com.example.fragmentsvaactivity;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyclassFragment extends Fragment {


    public interface GiaoTiepGiuaFragmentvaActivity{
        public void thaydoitext(String chuoi);
    }
    Button btThaydoitext;
    GiaoTiepGiuaFragmentvaActivity mCallback;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_myclass, container, false);
        btThaydoitext = view.findViewById(R.id.bt1);

        btThaydoitext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallback.thaydoitext("Vừa mới thay đổi text ");

            }
        });

        return view;
    }


}
