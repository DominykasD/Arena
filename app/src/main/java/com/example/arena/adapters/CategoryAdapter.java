package com.example.arena.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arena.activities.BaseActivity;
import com.example.arena.models.Cart;
import com.example.arena.models.Category;
import com.example.arena.R;
import com.example.arena.utils.LocalStorage;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    private LocalStorage localStorage;
    private final Gson gson = new Gson();

    private final List<Category> categories;
    private List<Cart> cartList = new ArrayList<>();
    private final Context context;

    private int timesClicked = 0;
    private String _subtotal;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, @SuppressLint("RecyclerView")  int position) {

        localStorage = new LocalStorage(context);
        cartList = ((BaseActivity) context).getCartList();

        holder.foodName.setText(categories.get(position).getName());
        holder.foodDescription.setText(categories.get(position).getDescription());
        holder.foodPrice.setText(categories.get(position).getPrice());

        if (!cartList.isEmpty()) {
            for (int i = 0; i < cartList.size(); i++) {
                if (cartList.get(i).getId().equalsIgnoreCase(categories.get(position).getId())) {
                    holder.itemQuantity.setText(cartList.get(i).getFoodQuantity());

                }
            }
        }


        holder.plusSymbol.setOnClickListener(v -> {
            if (Integer.parseInt(categories.get(position).getItemQuantity()) == 0) {
                Cart cart = new Cart();
                cart.setId(categories.get(position).getId());
                cart.setFoodName(categories.get(position).getName());
                cart.setFoodPrice(categories.get(position).getPrice());
                cart.setFoodQuantity(holder.itemQuantity.getText().toString());
                cart.setSubTotal(Integer.parseInt(cart.getFoodPrice()) * Integer.parseInt(cart.getFoodQuantity()));
                cartList = ((BaseActivity) context).getCartList();
                cartList.add(cart);

                String cartString = gson.toJson(cartList);
                localStorage.setCart(cartString);


                timesClicked++;
            }

            if (timesClicked != 0) {
                for (int i = 0; i < cartList.size(); i++) {
                    if(cartList.get(i).getId().equalsIgnoreCase(categories.get(position).getId())) {
                        int count = Integer.parseInt(cartList.get(i).getFoodQuantity());
                        count++;
                        String totalQuantity = "" + count;
                        holder.itemQuantity.setText(totalQuantity);
                        cartList.get(i).setFoodQuantity(holder.itemQuantity.getText().toString());

                        _subtotal = String.valueOf(Double.parseDouble(holder.foodPrice.getText().toString()) * Double.parseDouble(totalQuantity));
                        cartList.get(i).setSubTotal(Double.parseDouble(_subtotal));

                        categories.get(position).setItemQuantity(holder.itemQuantity.getText().toString());

                        String cartString = gson.toJson(cartList);
                        localStorage.setCart(cartString);
                    }
                }
            }

        });

        holder.minusSymbol.setOnClickListener(v -> {
            for (int i = 0; i < cartList.size(); i++) {
                if(cartList.get(i).getId().equalsIgnoreCase(categories.get(position).getId())) {
                    int count = Integer.parseInt(cartList.get(i).getFoodQuantity());
                    if (count <= 0) {
                        count = 0;
                    }
                    else count--;
                    String totalQuantity = "" + count;
                    holder.itemQuantity.setText(totalQuantity);
                    cartList.get(i).setFoodQuantity(holder.itemQuantity.getText().toString());

                    _subtotal = String.valueOf(Double.parseDouble(holder.foodPrice.getText().toString()) * Double.parseDouble(totalQuantity));
                    cartList.get(i).setSubTotal(Double.parseDouble(_subtotal));

                    categories.get(position).setItemQuantity(holder.itemQuantity.getText().toString());

                    String cartString = gson.toJson(cartList);
                    localStorage.setCart(cartString);

                    if (count == 0) {
                        cartList.remove(position);
                        Gson gson = new Gson();
                        String cartStr = gson.toJson(cartList);
                        localStorage.setCart(cartStr);
                    }

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView foodName, foodDescription, foodPrice, itemQuantity;
        ImageView foodImage, minusSymbol, plusSymbol, favoriteFood;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.foodName);
            foodDescription = itemView.findViewById(R.id.foodDesc);
            foodPrice =itemView.findViewById(R.id.foodPrice);
            foodImage = itemView.findViewById(R.id.foodImage);
            minusSymbol = itemView.findViewById(R.id.minusSymbol);
            plusSymbol = itemView.findViewById(R.id.plusSymbol);
            itemQuantity = itemView.findViewById(R.id.itemQuantity);
            favoriteFood = itemView.findViewById(R.id.favoriteFood);

        }

    }

}
