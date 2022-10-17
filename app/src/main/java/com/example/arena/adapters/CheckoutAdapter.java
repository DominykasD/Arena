package com.example.arena.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arena.R;
import com.example.arena.activities.CheckoutActivity;
import com.example.arena.models.Cart;
import com.example.arena.utils.LocalStorage;
import com.google.gson.Gson;

import java.util.List;

public class CheckoutAdapter extends RecyclerView.Adapter<CheckoutAdapter.ViewHolder> {

    private LocalStorage localStorage;
    private final Context context;
    private final List<Cart> cartList;
    private String _subtotal;

    public CheckoutAdapter(Context context, List<Cart> cartList) {
        this.context = context;
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CheckoutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_checkout, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull CheckoutAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        localStorage = new LocalStorage(context);
        Cart cart = cartList.get(position);
        Gson gson = new Gson();

        String _price = cart.getFoodPrice();
        String _quantity = cart.getFoodQuantity();
        _subtotal = String.format("%.2f", Double.parseDouble(_price) * Integer.parseInt(_quantity));
        holder.textProductPrice.setText(_subtotal);

        holder.textFoodName.setText(cartList.get(position).getFoodName());
        holder.textQuantity.setText(cartList.get(position).getFoodQuantity());

        holder.imagePlus.setOnClickListener(v -> {
            for (int i = 0; i < cartList.size(); i++) {
                if(cartList.get(i).getId().equalsIgnoreCase(cart.getId())) {
                    int count = Integer.parseInt(cartList.get(i).getFoodQuantity());
                    count++;
                    String totalQuantity = "" + count;
                    holder.textQuantity.setText(totalQuantity);
                    cartList.get(i).setFoodQuantity(holder.textQuantity.getText().toString());

                    _subtotal = String.format("%.2f", Double.parseDouble(String.valueOf(Double.parseDouble(cart.getFoodPrice()) * Double.parseDouble(holder.textQuantity.getText().toString()))));
                    cartList.get(i).setSubTotal(Double.parseDouble(_subtotal));
                    holder.textProductPrice.setText(_subtotal);

                    String cartString = gson.toJson(cartList);
                    localStorage.setCart(cartString);
                    ((CheckoutActivity) context).updateTotalPrice();
                }
            }
        });

        holder.imageMinus.setOnClickListener(v -> {
            for (int i = 0; i < cartList.size(); i++) {
                if(cartList.get(i).getId().equalsIgnoreCase(cart.getId())) {
                    int count = Integer.parseInt(cartList.get(i).getFoodQuantity());
                    if (count <= 0) {
                        count = 0;
                    }
                    else count--;
                    String totalQuantity = "" + count;
                    holder.textQuantity.setText(totalQuantity);
                    cartList.get(i).setFoodQuantity(holder.textQuantity.getText().toString());

                    _subtotal = String.format("%.2f", Double.parseDouble(String.valueOf(Double.parseDouble(cart.getFoodPrice()) * Double.parseDouble(holder.textQuantity.getText().toString()))));
                    cartList.get(i).setSubTotal(Double.parseDouble(_subtotal));
                    holder.textProductPrice.setText(_subtotal);

                    String cartString = gson.toJson(cartList);
                    localStorage.setCart(cartString);
                    ((CheckoutActivity) context).updateTotalPrice();

                    if (count == 0) {
                        cartList.remove(position);
                        notifyItemRemoved(position);
                        notifyItemRangeChanged(position, cartList.size());
                        Gson gson1 = new Gson();
                        String cartStr = gson1.toJson(cartList);
                        localStorage.setCart(cartStr);
                        ((CheckoutActivity) context).updateTotalPrice();
                    }

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImageSmall;
        ImageView imageMinus, imagePlus;
        TextView textFoodName, textQuantity, textEurSymbol, textProductPrice,
                priceWithoutPVM, pricePVM21, priceTotal;
        ConstraintLayout constraintLayout1;
        ConstraintLayout constraintLayout2;
        Button button;
        TextView orderDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // ImageView elements
            foodImageSmall = itemView.findViewById(R.id.foodImageSmall);
            imageMinus = itemView.findViewById(R.id.imageMinus);
            imagePlus = itemView.findViewById(R.id.imagePlus);

            // TextView elements
            textFoodName = itemView.findViewById(R.id.textFoodName);
            textQuantity = itemView.findViewById(R.id.textQuantity);
            textEurSymbol = itemView.findViewById(R.id.textEurSymbol);
            textProductPrice = itemView.findViewById(R.id.textProductPrice);
            priceWithoutPVM = itemView.findViewById(R.id.priceWithoutPVM);
            pricePVM21 = itemView.findViewById(R.id.pricePVM21);
            priceTotal = itemView.findViewById(R.id.priceTotal);

            constraintLayout1 = itemView.findViewById(R.id.constraintLayout12);
            constraintLayout2 = itemView.findViewById(R.id.constraintLayout15);
            button = itemView.findViewById(R.id.button8);
            orderDetails = itemView.findViewById(R.id.textView21);

        }
    }
}
