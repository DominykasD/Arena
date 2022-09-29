package com.example.arena.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arena.R;
import com.example.arena.models.Cart;
import com.example.arena.utils.LocalStorage;
import com.google.gson.Gson;

import java.util.List;

public class CheckoutConfirmAdapter extends RecyclerView.Adapter<CheckoutConfirmAdapter.ViewHolder>{

    private LocalStorage localStorage;
    private final Context context;
    private final List<Cart> cartList;
    private String _subtotal;

    public CheckoutConfirmAdapter(Context context, List<Cart> cartList) {
        this.context = context;
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CheckoutConfirmAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_checkout_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CheckoutConfirmAdapter.ViewHolder holder, int position) {

        localStorage = new LocalStorage(context);
        Cart cart = cartList.get(position);
        Gson gson = new Gson();

        String _price = cart.getFoodPrice();
        String _quantity = cart.getFoodQuantity();
        _subtotal = String.format("%.2f", Double.parseDouble(_price) * Integer.parseInt(_quantity));

        holder.subTotal.setText(_subtotal);
        holder.productQty.setText(cartList.get(position).getFoodQuantity());
        holder.productName.setText(cartList.get(position).getFoodName());
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView productName, productQty, xSymbol, subTotal, eurSymbol;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.imageView2);
            productName = itemView.findViewById(R.id.textView29);
            productQty = itemView.findViewById(R.id.textView32);
            xSymbol = itemView.findViewById(R.id.textView53);
            subTotal = itemView.findViewById(R.id.textView33);
            eurSymbol = itemView.findViewById(R.id.textView34);

        }
    }
}
