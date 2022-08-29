package com.example.arena;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    private LayoutInflater mInflater;
    private List<Category> categories;
    private int counta = 0, countr = 0, sum = 0;
    private String add, remove;


    public CategoryAdapter(Context context, List<Category> categories) {
        this.mInflater = LayoutInflater.from(context);
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycler_view_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {


        holder.foodName.setText(categories.get(position).getName());
        holder.foodDescription.setText(categories.get(position).getDescription());
        holder.foodPrice.setText(categories.get(position).getPrice());
        holder.foodImage.setImageResource(categories.get(position).getFoodImage());
        holder.minusSymbol.setImageResource(R.drawable.ic_minus);
        holder.plusSymbol.setImageResource(R.drawable.ic_add);
        holder.numberOfProducts.setText("0");
        holder.favoriteFood.setImageResource(R.drawable.ic_favorites);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView foodName, foodDescription, foodPrice, numberOfProducts;
        ImageView foodImage, minusSymbol, plusSymbol, favoriteFood;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodName = (TextView) itemView.findViewById(R.id.foodName);
            foodDescription = (TextView) itemView.findViewById(R.id.foodDesc);
            foodPrice = (TextView) itemView.findViewById(R.id.foodPrice);
            foodImage = (ImageView) itemView.findViewById(R.id.foodImage);
            minusSymbol = (ImageView) itemView.findViewById(R.id.minusSymbol);
            plusSymbol = (ImageView) itemView.findViewById(R.id.plusSymbol);
            numberOfProducts = (TextView) itemView.findViewById(R.id.numberOfProducts);
            favoriteFood = (ImageView) itemView.findViewById(R.id.favoriteFood);

            plusSymbol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addition();
                    sum();
                    String s = Integer.toString(sum());
                    numberOfProducts.setText(s);
                }
            });

            minusSymbol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    subtraction();
                    sum();
                    String s = Integer.toString(sum());
                    numberOfProducts.setText(s);
                }
            });




        }

    }

    private int addition() {
        counta++;
        return counta;
    }

    private int subtraction() {
        countr++;
        return countr;
    }

    private int sum() {
        sum = counta - countr;
        if (sum < 0) {
            sum = 0;
        }
        return sum;
    }

}
