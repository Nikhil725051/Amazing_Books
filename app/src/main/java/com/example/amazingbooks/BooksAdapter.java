package com.example.amazingbooks;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksViewHolder>{

    int[] books;
    BooksAdapter(int[] books)
    {
        this.books =books;
    }

    //RecyclerView will call this method when it needs to create a ViewHolder
    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView=(CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.books_card,parent,false);
        return new BooksViewHolder(cardView);
    }

    //RecyclerView will call this method when it needs a ViewHolder for new piece of data.
    //This method will set the data to the ViewHolder.
    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {

        ImageView bookImage=holder.bookCard.findViewById(R.id.book_image);
        bookImage.setImageDrawable(ContextCompat.getDrawable(bookImage.getContext(),books[position]));

    }


    @Override
    // Number of items to display
    public int getItemCount() {
        return books.length;
    }

    //Each ViewHolder will hold a CardView
    public static class BooksViewHolder extends RecyclerView.ViewHolder
    {
        private CardView bookCard;

        public BooksViewHolder(@NonNull CardView v) {
            super(v);
            bookCard =v;
        }
    }
}


