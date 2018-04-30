package com.example.marry.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class RestaurantsAdapter extends ArrayAdapter<Info>{

    /**
     * the constructor of the class
     * @param context - the current layout that will be inflated
     * @param infos - the infos that will be used to inflate the layout
     */
    public RestaurantsAdapter (Context context, ArrayList<Info>infos){
        super(context, 0, infos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //make the view recyclable
        View listItemView = convertView;
        //if the view is null - that means it is not used - than we can inflate it
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_list, parent, false);
        }

        /*
          let's inflate it with all the infos found in the Info Class
         */

        //get the Info object from a specific pozition
        Info currentInfo = getItem(position);

        //find the imageView in the restaurant_list.xml that has the id: image, and that will display the presentation image
        ImageView imageView = listItemView.findViewById(R.id.image);
        //and use the function from the class Info to display it according to the current position
        imageView.setImageResource(currentInfo.getmImage());

        //find the name of the restaurant and display it
        TextView nameView = listItemView.findViewById(R.id.name);
        nameView.setText(currentInfo.getmName());

        //find the address of the restaurant and display it
        TextView addressView = listItemView.findViewById(R.id.address);
        addressView.setText(currentInfo.getmAdress());

        //find the phone number of the restaurant and display it
        TextView phoneView = listItemView.findViewById(R.id.phone);
        phoneView.setText(currentInfo.getmPhone());

        return listItemView;
    }
}

