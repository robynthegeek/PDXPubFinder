package com.robynandcory.pdxbeerfinder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PubAdapter extends RecyclerView.Adapter<PubAdapter.PubHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Pub> pubsDatabase;

    //create a new recycler
    public PubAdapter(Context context, ArrayList<Pub> PubsDatabase) {
        this.layoutInflater = LayoutInflater.from(context);
        this.pubsDatabase = PubsDatabase;
    }

    //gets the size of the current array
    @Override
    public int getItemCount() {
        return pubsDatabase.size();
    }

    //create a view and inflate it with the recycler
    @Override
    public PubHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.card_layout, parent, false);
        return new PubHolder(view);
    }

    //set up variables for the card views
    class PubHolder extends RecyclerView.ViewHolder {
        private TextView pubName;
        private ImageView pubIsStarred;
        private ImageView pubImageView;

        private PubHolder(View pubCardView) {
            super(pubCardView);
            pubName = pubCardView.findViewById(R.id.cardTextView);
            pubImageView = pubCardView.findViewById(R.id.cardImageView);
            pubIsStarred = pubCardView.findViewById(R.id.cardLayoutFavorite);
        }
    }

    //Bind the array to the layout views indicated
    @Override
    public void onBindViewHolder(PubHolder holder, int position) {
        final Pub currentPub = pubsDatabase.get(position);

        //assign the pub in the ArrayList to the holder views
        holder.pubName.setText(currentPub.getPubName());
        holder.pubImageView.setImageResource(currentPub.getImageResource());
        //check database for star status, set image to filled heart if starred is true.
        if (currentPub.getIsStarred()) {
            holder.pubIsStarred.setImageResource(R.drawable.ic_favorite_white_24dp);
        }
    }

}
