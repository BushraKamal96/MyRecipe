package com.example.acer.myrecipe.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.acer.myrecipe.Model.RecipeCatagory;
import com.example.acer.myrecipe.R;

import java.util.ArrayList;

/**
 * Created by acer on 7/10/2018.
 */

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.MyViewHolder> {
ArrayList<RecipeCatagory> arrayList = new ArrayList<>();
    Context context;

    public RecipeAdapter(ArrayList<RecipeCatagory> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
final RecipeCatagory catagory = arrayList.get(position);
        holder.button.setText(catagory.getButton());

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
//                Toast.makeText(context, "" +holder.button.getText(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, Recipe.class);

                intent.putExtra("name", holder.button.getText());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        Button button;
View holdeView;

        public MyViewHolder(View view) {
            super(view);
holdeView = view;
            button = (Button) view.findViewById(R.id.button);
        }
    }
}
