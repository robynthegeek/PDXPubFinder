package com.robynandcory.pdxbeerfinder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BarsFragment extends Fragment {
    final PubsDatabase arrayOfBars = new PubsDatabase();
    PubAdapter sortedAdapter;

    public static RestaurantsFragment newInstance() {
        RestaurantsFragment fragment = new RestaurantsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pubs, container, false);
        RecyclerView sortedRecycler = rootView.findViewById(R.id.recycler);
//        View cardview = rootView.findViewById(R.id.cardview);
//        cardview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), "YAY", Toast.LENGTH_LONG).show();
//            }
//        });


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());
        sortedAdapter = new PubAdapter(rootView.getContext(), arrayOfBars.getPubsDatabase());
        Log.e("RestaurantsFragment", "Contents=" + arrayOfBars.getPubsDatabase());
        sortedRecycler.setLayoutManager(linearLayoutManager);
        sortedRecycler.setAdapter(sortedAdapter);
        sortedAdapter.notifyDataSetChanged();

        return rootView;
    }
}