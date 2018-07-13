package com.robynandcory.pdxbeerfinder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BreweriesFragment extends Fragment {
    final PubsDatabase pubsDatabase = new PubsDatabase();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //When fragment is created run the inflater and RecyclerView
        View rootView = inflater.inflate(R.layout.fragment_pubs, container, false);
        RecyclerView pubRecycler = rootView.findViewById(R.id.recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());
        PubAdapter pubAdapter = new PubAdapter(rootView.getContext(), pubsDatabase.getBreweriesDatabase());
        pubRecycler.setLayoutManager(linearLayoutManager);
        pubRecycler.setAdapter(pubAdapter);
        pubAdapter.notifyDataSetChanged();

        return rootView;
    }

}