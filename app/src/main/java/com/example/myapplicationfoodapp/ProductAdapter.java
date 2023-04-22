package com.example.myapplicationfoodapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.concurrent.Callable;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private List<Product> mProducts;
    public  ProductAdapter(List<Product> mProducts)
    {

        this.mProducts = mProducts;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater,parent);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Product p = mProducts.get(position);

        Context myContext = holder.itemView.getContext();
        int resid = myContext.getResources().getIdentifier(p.getPhoto(),"drawable",myContext.getPackageName());
        holder.accessoriesImage.setImageResource(resid);
        holder.accessoriesPrice.setText(p.getPrice());
        holder.AccessoriesName.setText(p.getName());
        holder.accessoriesDescription.setText(p.getDescription());
    }


    @Override
    public int getItemCount() {
       return mProducts.size();


    }

    class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

    TextView accessoriesPrice;
    TextView AccessoriesName;
    TextView accessoriesDescription;
    ImageView accessoriesImage;


    public MyViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.row_item,parent,false));

        accessoriesPrice = itemView.findViewById(R.id.productPrice);
        AccessoriesName = itemView.findViewById(R.id.productTitle);
        accessoriesDescription = itemView.findViewById(R.id.productDescription);
        accessoriesImage = itemView.findViewById(R.id.productImage);

    }

        @Override
        public void onClick(View view) {


            Context c = view.getContext();
            Product product = mProducts.get(getAdapterPosition());
            Intent i = new Intent(c,DisplayProduct.class);




                }
            }
        }



