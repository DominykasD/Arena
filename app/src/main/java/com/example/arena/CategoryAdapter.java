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
        holder.imageView.setImageResource(categories.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView foodName, foodDescription, foodPrice;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodName = (TextView) itemView.findViewById(R.id.foodName);
            foodDescription = (TextView) itemView.findViewById(R.id.foodDesc);
            foodPrice = (TextView) itemView.findViewById(R.id.foodPrice);
            imageView = (ImageView) itemView.findViewById(R.id.foodImage);

        }

    }

}
