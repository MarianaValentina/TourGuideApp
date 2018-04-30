package com.example.marry.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class OutdoorFragment extends Fragment {

    public OutdoorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflate the list_view
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create an ArrayList with Info elements
        final ArrayList<Info> infos = new ArrayList<Info>();

        //we use the object of the arrayList, the function add() and the constructor of the Info class to populate the arrayList
        infos.add(new Info(R.drawable.aventura_parc, R.string.aventura_parc));
        infos.add(new Info(R.drawable.bran_castle, R.string.bran));
        infos.add(new Info(R.drawable.cantacuzino_castle, R.string.cantacuzino));
        infos.add(new Info(R.drawable.dino_parc, R.string.dino));
        infos.add(new Info(R.drawable.paradisul_acvatic, R.string.paradisul));
        infos.add(new Info(R.drawable.peles_castle, R.string.peles));
        infos.add(new Info(R.drawable.rasnov, R.string.rasnov));
        infos.add(new Info(R.drawable.zoo, R.string.zoo));
        infos.add(new Info(R.drawable.super_land, R.string.superland));
        infos.add(new Info(R.drawable.ursi, R.string.bears));

        // Create an object of InfoAdapter, whose data source is a list of Info.
        // The adapter knows how to create list items for each item in the list.
        OutdoorAdapter outdoorAdapter = new OutdoorAdapter(getActivity(), infos);

        // Find the ListView object in the view hierarchy
        // There should be a ListView with the view ID called list in the list_view.xml
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the  InfoAdapter we created above, so that the
        // ListView will display list items for each info in the list.
        listView.setAdapter(outdoorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);

                switch (position) {
                    case 0:
                        intent.setData(Uri.parse("http://www.parc-aventura.ro/en"));
                        startActivity(intent);
                        break;
                    case 1:
                        intent.setData(Uri.parse("http://www.castelulbran.ro"));
                        startActivity(intent);
                        break;
                    case 2:
                        intent.setData(Uri.parse("http://www.cantacuzinocastle.com"));
                        startActivity(intent);
                        break;
                    case 3:
                        intent.setData(Uri.parse("http://www.dinoparc.ro"));
                        startActivity(intent);
                        break;
                    case 4:
                        intent.setData(Uri.parse("http://www.paradisulacvatic.ro/en"));
                        startActivity(intent);
                        break;
                    case 5:
                        intent.setData(Uri.parse("http://www.peles.ro"));
                        startActivity(intent);
                        break;
                    case 6:
                        intent.setData(Uri.parse("http://www.rasnov-turism.ro/tourisme/Cetatea%20Rasnov"));
                        startActivity(intent);
                        break;
                    case 7:
                        intent.setData(Uri.parse("https://coroana-brasovului.ro/program-vizitare-gradina-zoologica-brasov"));
                        startActivity(intent);
                        break;
                    case 8:
                        intent.setData(Uri.parse("http://www.superland.ro/"));
                        startActivity(intent);
                        break;
                    case 9:
                        intent.setData(Uri.parse("https://www.ampbears.ro/visit"));
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

        return rootView;
    }
}
