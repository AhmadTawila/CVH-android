package com.example.android.cleanvision;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentFragment extends Fragment {


    public CurrentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Projects> projects = new ArrayList<Projects>();
        projects.add(new Projects("Bridge Reconstruct","Puumiehenkuja 5, 02150 Espoo","there is build any bridge","11/11/2018","11/12/2018"/*,R.drawable.blue*/));
        projects.add(new Projects("Bridge Reconstruct","Puumiehenkuja 5, 02150 Espoo","there is build any bridge","11/11/2018","11/12/2018"/*,R.drawable.red*/));
        projects.add(new Projects("Bridge Reconstruct","Puumiehenkuja 5, 02150 Espoo","there is build any bridge","11/11/2018","11/12/2018"/*,R.drawable.green*/));
        projects.add(new Projects("Bridge Reconstruct","Puumiehenkuja 5, 02150 Espoo","there is build any bridge","11/11/2018","11/12/2018"/*,R.drawable.red*/));

        ProjectsAdapter adapter = new ProjectsAdapter(getActivity(), projects);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(this, "List item Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
