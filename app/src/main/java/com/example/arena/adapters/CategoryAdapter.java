package com.example.arena.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arena.Category;
import com.example.arena.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    private final LayoutInflater mInflater;
    private final List<Category> categories;


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
        holder.itemQuantity.setText("0");
        holder.favoriteFood.setImageResource(R.drawable.ic_favorites);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView foodName, foodDescription, foodPrice, itemQuantity;
        ImageView foodImage, minusSymbol, plusSymbol, favoriteFood;
        int count;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.foodName);
            foodDescription = itemView.findViewById(R.id.foodDesc);
            foodPrice =itemView.findViewById(R.id.foodPrice);
            foodImage = itemView.findViewById(R.id.foodImage);
            minusSymbol = itemView.findViewById(R.id.minusSymbol);
            plusSymbol = itemView.findViewById(R.id.plusSymbol);
            itemQuantity =itemView.findViewById(R.id.itemQuantity);
            favoriteFood = itemView.findViewById(R.id.favoriteFood);

            minusSymbol.setOnClickListener(this);
            plusSymbol.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.plusSymbol) increaseQuantityClick();
            if (v.getId() == R.id.minusSymbol) decreaseQuantityClick();
        }

        private void decreaseQuantityClick() {
            if (count <= 0) count = 0;
            else count--;
            String totalQuantity = "" + count;
            itemQuantity.setText(totalQuantity);
        }

        private void increaseQuantityClick() {
            count++;
            String totalQuantity = "" + count;
            itemQuantity.setText(totalQuantity);
        }

    }

}
