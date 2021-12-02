package com.example.ecommerce.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.ecommerce.MainActivity;
import com.example.ecommerce.R;
import com.example.ecommerce.model.Data;
import com.example.ecommerce.model.MasterResponceModel;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.Arrays;
import java.util.List;

import static android.content.ContentValues.TAG;

public class SliderAdapterImage extends SliderViewAdapter<SliderAdapterImage.SliderAdapterVH> {

        private Context context;

        private List<String> images;

        public SliderAdapterImage(Context context, List<String> image) {
            this.context = context;
            this.images= image;


        }



        @Override
        public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
            return new SliderAdapterVH(inflate);
        }

        @Override
        public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
            Log.d(TAG,"url"+images);

            Glide.with(viewHolder.itemView)
                    .load(images.get(position).toString())
                    .fitCenter()
                    .into(viewHolder.imageViewBackground);

            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "This is item in position " + position, Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public int getCount() {
            //slider view count could be dynamic size
            return images.size();
        }

        class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

            View itemView;
            ImageView imageViewBackground;
            TextView textViewDescription;

            public SliderAdapterVH(View itemView) {
                super(itemView);
                imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
                textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
                this.itemView = itemView;
            }
        }
    }