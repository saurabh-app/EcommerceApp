package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.ecommerce.adapter.ProductListAdapter;
import com.example.ecommerce.adapter.SliderAdapterImage;
import com.example.ecommerce.model.Data;
import com.example.ecommerce.model.MasterResponceModel;
import com.example.ecommerce.network.ApiInterface;
import com.example.ecommerce.network.RetroInstance;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
private ProductListAdapter productListAdapter;
    private SliderView sliderView;
    private SliderAdapterImage slideradapter;
    private ApiInterface apiInterface;
    private int product_id=1812;
    private String lang="en";
    private String store="KW";
     Data data;
TextView tv,final_price,regular_price,shopDescription,block_id;
    List<String> images = new ArrayList<String>();


    MasterResponceModel masterResponceModel;
    private Button notifCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);
        apiInterface = RetroInstance.getRetroClient().create(ApiInterface.class);
        sliderView = findViewById(R.id.imageSliders);
        tv = findViewById(R.id.tv);
        final_price = findViewById(R.id.final_price);
        regular_price = findViewById(R.id.regular_price);
        shopDescription = findViewById(R.id.shopDescription);
        block_id = findViewById(R.id.blockid);
        tv = findViewById(R.id.tv);


        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        getProductList();


    }

    private void getProductList() {

        Call<MasterResponceModel> call = apiInterface.getproductlist(product_id,lang,store);

        call.enqueue(new Callback<MasterResponceModel>() {
            @Override
            public void onResponse(Call<MasterResponceModel> call, Response<MasterResponceModel> response) {
                if(response.isSuccessful()){
                    Log.d(TAG,"Onresponce"+response.body().getStatus());
                     masterResponceModel = response.body();
                    data= masterResponceModel.getData();

                    tv.setText(data.getBrandName());
                    shopDescription.setText(data.getShortDescription());
                    regular_price.setText(data.getRegularPrice());
                    final_price.setText(data.getFinalPrice());
//                    block_id.setText(data.getIsFeatured());
                    final_price.setPaintFlags(final_price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    images=  data.getImages();
                    slideradapter = new SliderAdapterImage(MainActivity.this,  images);
                    sliderView.setSliderAdapter(slideradapter);






                }
                else {
                    Toast.makeText(MainActivity.this, "Error! Please try again!"+response.toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MasterResponceModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
//        View count = menu.findItem(R.id.add).getActionView();
//        notifCount = (Button) count.findViewById(R.id.add);
//        notifCount.setText(String.valueOf(data.getItemInCart()));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.add:
            return(true);

    }
        return(super.onOptionsItemSelected(item));
    }
}