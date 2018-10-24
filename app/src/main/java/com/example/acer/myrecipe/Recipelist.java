package com.example.acer.myrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.acer.myrecipe.Model.RecipeCatagory;
import com.example.acer.myrecipe.adapter.RecipeAdapter;

import java.util.ArrayList;

public class Recipelist extends AppCompatActivity {
    private ArrayList<RecipeCatagory> arrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecipeAdapter adapter;

    String recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_ativity);

        PreparingFastfoodData();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecipeAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);
    }
    private void PreparingFastfoodData(){
        recipe = getIntent().getExtras().getString("name1");

    if(recipe.equals("Fast Food")) {
    RecipeCatagory catagory = new RecipeCatagory("Crispy Broast");
    arrayList.add(catagory);

    catagory = new RecipeCatagory("Chicken Nuggets");
    arrayList.add(catagory);

    catagory = new RecipeCatagory("Chicken Burger");
    arrayList.add(catagory);

    catagory = new RecipeCatagory("Zinger Burger");
    arrayList.add(catagory);

    catagory = new RecipeCatagory("Chicken Cheese Sandwich");
    arrayList.add(catagory);

    catagory = new RecipeCatagory("Chicken Onion Sauce Sandwich");
    arrayList.add(catagory);

    catagory = new RecipeCatagory("Chicken Tikka Pizza");
    arrayList.add(catagory);

    catagory = new RecipeCatagory("Chicken Tandoori Pizza");
    arrayList.add(catagory);
}

        if(recipe.equals("Chinese")) {

            RecipeCatagory catagory = new RecipeCatagory("Egg Fried Rice");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Chicken Manchurian");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Sweet And Sour Beef Chowmein");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Chicken Hakka Noodles");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Chicken Chowmein");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Chicken Corn Soup");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Spicy Fried Rice");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Sweet And Sour Pasta Salad");
            arrayList.add(catagory);
        }


        if(recipe.equals("Bar.B.Que")) {

            RecipeCatagory catagory = new RecipeCatagory("Chicken Tikka");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Khoya Seekh Kabab");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Behari Boti");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Beef Tikka");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Mutton Tikka");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Grilled Kabab");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Handi Chargha");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Tandoori Chicken Masala");
            arrayList.add(catagory);

        }

        if(recipe.equals("Dessert")) {

            RecipeCatagory catagory = new RecipeCatagory("Chocolate And Coffee Roulade");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Coconut Cake");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Banana Chocolate Muffins");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Oreo Ice Cream");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Brownie Fudge Ice Cream");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Shahi Kulfa");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Kaju Barfi");
            arrayList.add(catagory);

            catagory = new RecipeCatagory("Rasmalai");
            arrayList.add(catagory);
        }
    }
}
