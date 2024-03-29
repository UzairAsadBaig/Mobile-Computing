package com.example.alhuda.ui.Parah;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.alhuda.DbHelper;
import com.example.alhuda.ParahActivity;
import com.example.alhuda.R;
import com.example.alhuda.SurahModel;
import com.example.alhuda.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_gallery, container, false);
        ListView listView = contentView.findViewById(R.id.listview2);
        DbHelper dbHelper = new DbHelper(getContext());
        List list = new ArrayList();
        for (int i = 1; i < 31; i++) {
            list.add("Para "+i);
        }
        ArrayAdapter ad =new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String res = adapterView.getItemAtPosition(i).toString();
                String arr[] =res.split(" ");
                String id = arr[1];
                Intent intent = new Intent(getContext(), ParahActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });

        return contentView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}