package com.example.alhuda.ui.Surah;

import android.content.Intent;
import android.os.Bundle;
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
import com.example.alhuda.R;
import com.example.alhuda.SurahActivity;
import com.example.alhuda.SurahModel;
import com.example.alhuda.databinding.FragmentHomeBinding;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_home, container, false);

        ListView listView = contentView.findViewById(R.id.listview);
        DbHelper dbHelper = new DbHelper(getContext());
        List<SurahModel> list = dbHelper.getAllSurahNames();
        ArrayAdapter ad =new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String res = adapterView.getItemAtPosition(i).toString();
                String arr[] =res.split(" ");
                String id= arr[0];
                String name = arr[1];
                Intent intent = new Intent(getContext(), SurahActivity.class);
                intent.putExtra("name",name);
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