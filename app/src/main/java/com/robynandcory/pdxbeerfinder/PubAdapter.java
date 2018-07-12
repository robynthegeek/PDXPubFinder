package com.robynandcory.pdxbeerfinder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PubAdapter extends RecyclerView.Adapter<PubAdapter.PubHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Pub> PubsDatabase;

    //create a new recycler
    public PubAdapter(Context context, ArrayList<Pub> PubsDatabase){
        this.layoutInflater = LayoutInflater.from(context);
        this.PubsDatabase = PubsDatabase;
    }

    //create a view and inflate it with the recycler
    @Override
    public PubHolder  onCreateViewHolder (ViewGroup parent, int viewType){
        View view = layoutInflater.inflate(R.layout.card_layout, parent, false);
        return new PubHolder(view);
    }

    //Bind the array to the layout view indicated
    @Override
    public void onBindViewHolder(PubHolder holder, int position){
        final Pub currentPub = PubsDatabase.get(position);

        //assign the pub in the arraylist to the holder views
        holder.pubName.setText(currentPub.getPubName());
        //TODO add pub type: holder.pubType.setText(currentPub.getPubType());
        holder.pubImageID.setImageResource(currentPub.getImageResource());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"HELP", Toast.LENGTH_LONG).show();
                //Intent viewRestaurant = new Intent(this)
            }
        });
    }

    class PubHolder extends RecyclerView.ViewHolder {
        private TextView pubName;
        //TODO add star: private ImageView pubIsStarred;
        //TODO add pub type: private TextView pubType;
        private ImageView pubImageID;

        private PubHolder (View pubCardView){
            super (pubCardView);
            pubName = pubCardView.findViewById(R.id.cardTextView);
            pubImageID = pubCardView.findViewById(R.id.cardImageView);
            //TODO add pub type: pubType = pubCardView.findViewById(R.id.);
            //TODO add star: pubIsStarred = pubCardView.findViewById(R.id.star);
        }

    }

    //gets the size of the current array
    @Override
    public int getItemCount() {
        return PubsDatabase.size();
    }
}
