package com.example.android.cleanvision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ProjectsAdapter extends ArrayAdapter<Projects>{

    public ProjectsAdapter(Context context, ArrayList<Projects> projects) {
        super(context, 0, projects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Projects currentProject = getItem(position);

        TextView projectTitle = (TextView) listItemView.findViewById(R.id.title_issue);
        projectTitle.setText(currentProject.getTitle());

        TextView projectAddress = (TextView) listItemView.findViewById(R.id.address_issue);
        projectAddress.setText(currentProject.getAddress());

        TextView projectDesc = (TextView) listItemView.findViewById(R.id.description_issue);
        projectDesc.setText(currentProject.getDescription());

        TextView projectStartDate = (TextView) listItemView.findViewById(R.id.startData_issue);
        projectStartDate.setText(currentProject.getStartDate());

        TextView projectEndDate = (TextView) listItemView.findViewById(R.id.endData_issue);
        projectEndDate.setText(currentProject.getEndDate());

        //ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //imageView.setImageResource(currentProject.getImageResourceId());

        return listItemView;
    }
}
