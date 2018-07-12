package com.robynandcory.pdxbeerfinder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    final PubsDatabase arrayOfRestaurants = new PubsDatabase();
    PubAdapter sortedAdapter;

    public static RestaurantsFragment newInstance() {
        RestaurantsFragment fragment = new RestaurantsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurants, container, false);
        RecyclerView sortedRecycler = rootView.findViewById(R.id.recycler);
//        View cardview = rootView.findViewById(R.id.cardview);
//        cardview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), "YAY", Toast.LENGTH_LONG).show();
//            }
//        });



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());
        sortedAdapter = new PubAdapter(rootView.getContext(), arrayOfRestaurants.getPubsDatabase());
        Log.e("RestaurantsFragment", "Contents="+ arrayOfRestaurants.getPubsDatabase());
        sortedRecycler.setLayoutManager(linearLayoutManager);
        sortedRecycler.setAdapter(sortedAdapter);
        sortedAdapter.notifyDataSetChanged();

        return rootView;
    }

}
