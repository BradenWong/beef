package com.hfad.beef;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ListFragment extends Fragment implements AdapterView.OnItemClickListener{

    private final AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> listBeef, View itemView, int position, long id) {
            Intent intent = new Intent(getActivity(), beefActivity.class);
            intent.putExtra(beefActivity.EXTRA_BEEFID, (int) id);
            startActivity(intent);
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_beef_list, container, false);

        ArrayAdapter<beef> listAdapter = new ArrayAdapter<beef>(getActivity(), android.R.layout.simple_list_item_1, beef.beefs);
        ListView listBeefs = rootView.findViewById(R.id.list_beefs);
        listBeefs.setAdapter(listAdapter);

        listBeefs.setOnItemClickListener(itemClickListener);

        //sending the view back
        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
