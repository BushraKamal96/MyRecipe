package com.example.acer.myrecipe.adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.acer.myrecipe.MainActivity;
import com.example.acer.myrecipe.R;

public class Recipe extends AppCompatActivity {
TextView text2;
    ImageView image;
    String foodrecipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        text2 = (TextView) findViewById(R.id.recipiess);
        image = (ImageView) findViewById(R.id.imgView);

        foodrecipe = getIntent().getExtras().getString("name");

        if (foodrecipe.equals("Crispy Broast")) {

            image.setImageResource(R.drawable.crispybroast);

            text2.setText("INGREDIENTS:\n\n" +
                    "Chicken 2 (with skin)\n" +
                    "White Pepper 1 tbsp\n" +
                    "Salt 4 tbsp and 1 tbsp forcoating\n" +
                    "Ginger garlic paste 1 tbsp\n" +
                    "Corn flour 1/2 cup\n" +
                    "Green chili paste 3 tbsp\n" +
                    "Plain flour 2 cups\n" +
                    "Baking Powder 2 tbsp\n" +
                    "Water as required\n" +
                    "COOKING DIRECTIONS:\n\n" +
                    "Fill a bowl with water now add green chili paste, salt, baking powder and ginger garlic paste in it.\n" +
                    "Dip the chicken pieces in bowl and leave it for about 4-5hours to let the chicken marinated perfectly.\n" +
                    "Now take out the chicken from bowl and let it dry, make the coating by mixing the corn flour, plain flour, salt and white pepper.\n" +
                    "Mix all these items very well, now coat the chicken nicely\n" +
                    "Now deep fry the chicken and when the color changes to golden brown take it out and serve it.\n" +
                    "Broast is ready to serve try it and enjoy it.\n");



        }

if (foodrecipe.equals("Chicken Nuggets")){

        image.setImageResource(R.drawable.chickennuggets);

    text2.setText("INGREDIENTS:\n\n" +
            "Chicken boneless (chopped) 1/2 kg\n" +
            "Oil (for deep frying) as required\n" +
            "Black pepper 1/2 tsp\n" +
            "Garlic paste 1 tsp\n" +
            "Salt 1 tsp\n" +
            "Onion (small and chopped) 1\n" +
            "Plain flour 1/2 cup\n" +
            "Bread crumbs 1 cup\n" +
            "Egg 1\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Add chicken pieces in a pot.\n" +
            "Add garlic paste, black pepper and salt in it.\n" +
            "Also add onion in it and mix well.\n" +
            "Add this meat mixture in chopper to mince it.\n" +
            "Put in fridge for a while.\n" +
            "Make small nugget shapes from the meat.\n" +
            "Coat them in plain flour.\n" +
            "Beat an egg.\n" +
            "Dip in egg and then coat in bread crumbs.\n" +
            "Heat some oil in a pan.\n" +
            "Deep fry the nuggets.\n");



}

if (foodrecipe.equals("Chicken Burger")){

image.setImageResource(R.drawable.chikenburger);

    text2.setText("INGREDIENTS:\n\n" +
            "Chicken 500 gm\n" +
            "Egg 1\n" +
            "Bread 2 slices\n" +
            "Bread crumbs 2 tbsp\n" +
            "Mustard paste 1 tsp\n" +
            "Black pepper powder 1 tsp\n" +
            "White pepper powder ½ tsp\n" +
            "Margarine ½ cup\n" +
            "Bun 4\n" +
            "Onion 2 tbsp\n" +
            "Carrot 1\n" +
            "Cabbage 2 tbsp\n" +
            "Ketchup 1 cup\n" +
            "Oil for fry\n" +
            "COOKING DIRECTIONS:\n\n" +
            "For Chicken Burger:\n" +
            "In a mixing bowl add minced chicken, bread slices, salt, black pepper, white pepper, egg and chopped onions.\n" +
            "Mix well and shape the chicken mixture into 4 patties.\n" +
            "Fry in a frying pan till the patties turn golden brown in color.\n" +
            "Now take a sliced bun and spread a little margarine on both the bun halves.\n" +
            "Add a lettuce leaf, some sliced carrots and finally a burger patty.\n" +
            "Cover with the other bun slice.\n" +
            "Repeat steps with the remaining burgers and buns.\n");
}
if (foodrecipe.equals("Zinger Burger")) {

    image.setImageResource(R.drawable.zingerburger);

    text2.setText("INGREDIENTS:\n\n" +
            "Chicken breast 2\n" +
            "Salt to taste\n" +
            "Black pepper 1/2 tsp\n" +
            "Red chili 1 tbsp (crushed)\n" +
            "Papaya paste 2 tbsp\n" +
            "Egg 2\n" +
            "All purpose flour 1/2 cup\n" +
            "All purpose flour 3 tbsp\n" +
            "Corn flour 1/2 cup\n" +
            "Rice flour 1/2 cup\n" +
            "Oil for frying\n" +
            "Burger bun 4\n" +
            "Mayonnaise 1/2 cup\n" +
            "Iceberg 1 flower\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Cut chicken breast into two pieces.\n" +
            "Then marinate it with salt, black pepper, red chili and papaya paste.\n" +
            "Beat eggs and add 3 tablespoon all purpose flour. Mix well.\n" +
            "Now combine all purpose flour, corn flour and rice flour in a bowl.\n" +
            "Dip chicken breast in egg batter and coat with dry flour mixture.\n" +
            "Then deep fry the chicken in oil.\n" +
            "Cut bun into 2 pieces from center then apply little mayonnaise on bun.\n" +
            "Cut the iceberg into julienne form.\n" +
            "Now put iceberg on one part of bun and apply mayonnaise.\n" +
            "Then put fried chicken breast and apply mayonnaise again.\n" +
            "Cover with another piece of bun and serve to guests.\n");
}
if (foodrecipe.equals("Chicken Cheese Sandwich")){

    image.setImageResource(R.drawable.chickensandwich);

    text2.setText("INGREDIENTS:\n\n" +
            "Chicken ½ cup (boiled)\n" +
            "Mayonnaise 4 tbsp\n" +
            "Tomato 1 small (chopped)\n" +
            "Fresh coriander leaves 1 tbsp\n" +
            "Carrot 1 small (chopped)\n" +
            "Lemon juice 1 tsp\n" +
            "Black pepper power ½ tsp\n" +
            "Red chili ½ tsp (crushed)\n" +
            "Salt to taste\n" +
            "Onion 1 medium (sliced)\n" +
            "Bread 4 slices\n" +
            "Cheese slices 2\n" +
            "Butter 2 tbsp\n" +
            "COOKING DIRECTIONS:\n\n" +
            "In a bowl mix together chicken, mayonnaise, tomato, coriander, carrot, lemon juice, black pepper powder, red chili and salt.\n" +
            "Heat 1 tbsp butter in frying pan and stir fry sliced onion until golden brown.\n" +
            "Apply butter on outer side of bread.\n" +
            "Spread filling on other side of bread followed by fried onion; place cheese slice and cover with other bread slice.\n" +
            "Press down to close sandwich.\n" +
            "Heat a griddle or pan over medium heat and toast sandwich from both sides until get a nice golden brown color and cheese melts.\n" +
            "Remove from pan and slice each sandwich diagonally and serve.\n");


}

if (foodrecipe.equals("Chicken Onion Sauce Sandwich")){

    image.setImageResource(R.drawable.onionsausesandwich);


    text2.setText("INGREDIENTS:\n\n" +
            "For Sauce\n" +
            "Chicken stock 1 cup\n" +
            "Onion 1 (finely chopped)\n" +
            "Minced garlic 1 tsp\n" +
            "Red chili flakes 1 tsp\n" +
            "Brown sugar ⅓ cup\n" +
            "Balsamic vinegar 1 tbsp\n" +
            "White vinegar 1 tsp\n" +
            "Salt to taste\n" +
            "Chicken strips cooked 1 cup\n" +
            "Subway bread buns\n" +
            "Salad\n" +
            "COOKING DIRECTIONS:\n\n" +
            "In a pan, add stock, onion, garlic, red chilli flakes, brown sugar, balsamic and white vinegar. Simmer over medium heat until onions are soft and flavors are blended.\n" +
            "Using a blender, puree the sauce until smooth.\n" +
            "Add puree back to the pan. Add salt to taste. Mix in the cooked chicken and serve with salad on subway buns.\n");
}
if (foodrecipe.equals("Chicken Tikka Pizza")){
image.setImageResource(R.drawable.tikkapizza);

    text2.setText("INGREDIENTS:\n\n" +
            "For Pizza Dough:\n" +
            "Flour\t200g (2cups)\n" +
            "Salt\t1/2tsp\n" +
            "Instant yeast\t1-1/2 tsp\n" +
            "Egg\t1\n" +
            "Dry milk powder\t1-1/2 tbsp\n" +
            "Caster sugar\t1 tsp\n" +
            "Oil\t3 tbsp\n" +
            "Luke warm water\tas required for binding\n" +
            "For Pizza Sauce:\n" +
            "Oil\t2tbsp\n" +
            "Garlic paste\t1/2 tsp\n" +
            "Tomato paste\t1/2 cup\n" +
            "Red chilli powder\t1/2 tsp\n" +
            "Salt\t1/2 tsp\n" +
            "Oregano leaves\t1/2 tsp\n" +
            "Ketchup\t2tbsp\n" +
            "Chicken Tikka:\n" +
            "Boneless chicken\t2 breast piece\n" +
            "Tikka Masala\t3-4 tbsp\n" +
            "Lemon juice\t2 tbsp\n" +
            "Ginger garlic paste\t1/2 tsp\n" +
            "Topping:\n" +
            "Onion\t1(cube cut)\n" +
            "Capsicum\t1(cube cut)\n" +
            "Tomato\t1(without seeds) cube cut\n" +
            "Sweet corn\t2-3 tbsp\n" +
            "Mushrooms\t3-4 tbsp\n" +
            "Black olives\t3-4 tbsp\n" +
            "Oregano leaves\t1tsp\n" +
            "Cheddar cheese\t1cup\n" +
            "Mozzarella cheese 1cup\n" +
            "COOKING DIRECTIONS:\n\n" +
            "For dough: Take a bowl; add flour, salt, instant yeast, egg, dry milk powder, caster sugar, oil and very little water for binding. \n" +
            "Mix them well and keep adding little water as required to keep it soft. \n" +
            "The dough should be soft after mixing the ingredients. \n" +
            "After binding, take out the mixture and strike it on a smooth surface for 5-6 times. \n" +
            "Now sprinkle little flour on the same surface and roll the dough. \n" +
            "For thin and crispy pizza, dough should be 1/8th inch thick after rolling. \n" +
            "Place this rolled dough on a pizza pan and prick it with knife or fork. \n" +
            "Place this pan for 7-8 minutes in a preheated oven. \n" +
            "For pizza sauce: pour oil in a pan; add garlic paste when oil is heated and fry for 2 minutes. \n" +
            "Than add tomato paste, red chilli powder, salt, oregano leaves and ketchup. \n" +
            "Cook for 2 minutes and sauce is ready. Use this sauce when it’s cold.\n" +
            "For chicken Tikka: marinate chicken with Tikka Masala, lemon juice and ginger garlic paste. \n" +
            "Leave for 10-15 minutes and fry until chicken is ready. \n" +
            "At the end, place 2-3 coal pieces in a pan and cover for 4-5 minutes. \n" +
            "Compilation of pizza:\n" +
            "Roll out dough, and place in a 10inch Pizza plate.\n" +
            "Spread pizza sauce on dough and sprinkle cheddar cheese about 2tbsp on it. \n" +
            "Now spread chicken Tikka pieces on it. \n" +
            "Sprinkle onion, tomato, capsicum, sweet corn, mushrooms, olives, oregano leaves, Cheddar cheese and Mozzarella cheese. \n" +
            "Place this pan in preheated oven at 180 C for 20 minutes. \n" +
            "Delicious Chicken Tikka Pizza is ready.\n");
}
if(foodrecipe.equals("Chicken Tandoori Pizza")){

    image.setImageResource(R.drawable.tandooripizza);

    text2.setText("INGREDIENTS:\n\n" +
            "For Pizza Dough:(enough for 2 pizzas)\n" +
            "All purpose flour 1/2 kg\n" +
            "Sugar 1 tbsp\n" +
            "Oil 3 tbsp\n" +
            "Egg 1\n" +
            "Instant yeast 1,1/2 tbsp\n" +
            "Salt 1/2 tsp\n" +
            "Lukewarm water or milk as needed\n" +
            "For Tandoori Chicken Topping:\n" +
            "Chicken boneless 1 kg\n" +
            "Salt 1,1/2 or to taste\n" +
            "Lemon 2 tbsp\n" +
            "Vinegar 3 tbsp\n" +
            "Yogurt 1 cup\n" +
            "Ajinomoto 1 tsp\n\n" +
            "Ginger garlic paste 4 tbsp\n" +
            "Oil 2-3 tbsp\n" +
            "Red chilli crushed 2 tbsp\n" +
            "Black pepper 2 tbsp\n" +
            "White pepper 1 tsp\n" +
            "Chilli sauce 1 tbsp\n" +
            "Soya sauce 2 tbsp\n" +
            "Yellow food colour 1/2 tsp\n" +
            "Coal 1 inch piece\n" +
            "For Sauce:\n" +
            "Oil 2 tbsp\n" +
            "Ketchup 1/2 cup\n" +
            "Garlic paste 1/2 tsp\n" +
            "Salt 1/2 tsp\n" +
            "Red chilli powder 1 tsp\n" +
            "Ajinomoto 1/2 tsp\n" +
            "White pepper 1/2 tsp\n" +
            "Thyme powder 1/4 tsp\n" +
            "Oregano powder 1/4 tsp\n" +
            "For Topping:\n" +
            "Tomato 2 (cut into square)\n" +
            "Lemon 1(slices)\n" +
            "Onion 1 (chopped)\n" +
            "Capsicum 2(cut into square)\n" +
            "Mozzarella cheese 1 pack (shredded)\n" +
            "Cheddar cheese 1 pack (shredded)\n" +
            "COOKING DIRECTIONS:\n\n" +
            "For Pizza Doug: Mix yeast in a little slightly warm milk and leave.\n" +
            "Let it rise and then dissolve sugar and salt in it.\n" +
            "Now mix all the ingredients and knead with lukewarm milk or water.\n" +
            "When dough become in smooth form cover it with polythene bag set a side for an hour.\n" +
            "For Pizza Sauce: Heat oil, saute garlic add rest of the ingredients in it.\n" +
            "Cook for 2 minutes, then add 2 tbsp water and cook for 2 more minutes.\n" +
            "Remove from heat let it cool.\n" +
            "For Tandoori Chicken Topping: Mix all the ingredients in chicken and marinate for 1 hour.\n" +
            "Bake at mark 4 or 180 degree for 40-45 minutes.\n" +
            "Finish with coal smoke.\n" +
            "When dough rise well take half of dough spread on 12'' pizza pan and mark with fork.\n" +
            "Now spread 3 tbsp prepared sauce, top it with baked chicken, sprinkle black pepper, spread onion, tomatoes, capsicum and shredded cheese.\n" +
            "Bake for 7-10 min at mark 7 (pre-heat oven at mark 7 for 15-20 minutes).\n");
}


if(foodrecipe.equals("Egg Fried Rice")){

image.setImageResource(R.drawable.eggfriedrice);
    text2.setText("INGREDIENTS:\n\n" +
            "Basmati Rice 1 kg (washed and soaked for 20 minutes)\n" +
            "Eggs 4 (whisk with a pinch of yellow color)\n" +
            "Spring onions 1 cup (finely sliced tops or green leaves)\n" +
            "Carrots 3 (finely sliced)\n" +
            "Bell pepper 2 (finely sliced)\n" +
            "Garlic water/essence 2 tbsp\n" +
            "Soya sauce 2 tbsp\n" +
            "White vinegar 1 tbsp\n" +
            "Black pepper ½ tsp (ground)\n" +
            "Sugar 1 tsp\n" +
            "Ajinomoto ½ tsp (Chinese Salt)\n" +
            "Salt To taste\n" +
            "Cinnamon 1 piece roasted and ground\n" +
            "Oil 1 cup\n" +
            "Sesame oil a few drops\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Boil water in cooking pan then add rice, 1 tbsp salt and vinegar. Boil rice until 80% done then drain the water and simmer rice on slow heat on five minutes.\n" +
            "Remove rice from heat and spread in wide dish.\n" +
            "When you wish to serve, add the oil to a wok or pot and heat.\n" +
            "Add the garlic water/essence then the eggs and stir it quickly.\n" +
            "Add the soy sauce, black pepper, bell pepper, carrots and green onions.\n" +
            "Then stir fry for five minutes and add in the rice.\n" +
            "Add in the sugar, a bit of the soya rice and ajinomoto and toss gently with two spoons.\n" +
            "The Egg Fried Rice is ready. Add a few drops of sesame oil on top.\n" +
            "Serve with Chicken Chilies or Beef Chilies.\n");
}
if(foodrecipe.equals("Chicken Manchurian")){

image.setImageResource(R.drawable.chickenmanchurian);

    text2.setText("INGREDIENTS:\n\n" +
            "For Marination:\n" +
            "Chicken breast 1/2 kg\n" +
            "Soya sauce 2 tbsp\n" +
            "Vinegar 1 tbsp\n" +
            "Salt a pinch\n" +
            "Black pepper 1/2 tsp\n" +
            "For Sauce:\n" +
            "Garlic chopped 2 tbsp\n" +
            "Tomato puree 1 cup\n" +
            "Chicken stock 400ml\n" +
            "Cooking oil 2 tbsp\n" +
            "Vinegar 1/2cup\n" +
            "Soya sauce 2 tbsp\n" +
            "Salt 1 tsp\n" +
            "Red chilli crushed 2 tbsp\n" +
            "Red food colour a pinch\n" +
            "Tomato ketchup 2 tbsp\n" +
            "Onion 1 finally chopped\n" +
            "Capsicum 1 finally chopped\n" +
            "Corn flour 3 tbsp\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Cut chicken breast in to cubes, marinate it in soya sauce, vinegar, salt and black pepper. Leave it for 30 minutes.\n" +
            "Now heat oil in a wok and add garlic to saute, add marinated chicken and cook it until water dries.\n" +
            "Add tomato puree in it and simmer for a while then add chicken stock, chopped onion and capsicum.\n" +
            "Cook it well then add vinegar, soya sauce, red chilli, salt, tomato ketchup and red food colour, mix it well and cook to come boiling point.\n" +
            "Dissolve some corn flour in water and add corn flour to sauce to make a thick gravy keep the flame high.\n" +
            "Check the consistency of gravy; now pour the gravy in serving dish and serve it with fried rice.\n");
}

if(foodrecipe.equals("Sweet And Sour Beef Chowmein")){

    image.setImageResource(R.drawable.beefchowmein);

    text2.setText("INGREDIENTS:\n\n" +
            "Noodles 1 packet\n" +
            "Oil 3 tbsp\n" +
            "Beef undercut ½ kg\n" +
            "Soya sauce 2 tbsp\n" +
            "White vinegar 2 tbsp\n" +
            "Salt to taste\n" +
            "Garlic clove 4 (chopped)\n" +
            "Carrots 2 (chopped)\n" +
            "Capsicum 2 (chopped)\n" +
            "Brown sugar 2 tbsp\n" +
            "Black pepper 1 tsp (crushed)\n" +
            "Pineapple 1 tin (cubes)\n" +
            "Sesame seed oil 1 tsp\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Boil noodles along with oil.\n" +
            "When the noodles are boiled drain the water and wash them with cold water.\n" +
            "Grease them and keep them.\n" +
            "Now marinate undercut with 1 tbsp soya sauce, 1 tbsp white vinegar and salt and keep it for 10 minutes.\n" +
            "Heat oil and add in garlic cloves.\n" +
            "Fry it till they are golden brown.\n" +
            "Add in the meat and stir fry it.\n" +
            "Add in carrots, capsicum, brown sugar, 1 tbsp soya sauce, 1 tbsp white vinegar and black pepper.\n" +
            "Cook it and add in the noodles.\n" +
            "Add in pine apple cubes.\n" +
            "Add in sesame seed oil.\n" +
            "Dish it out and serve.\n");

}
if(foodrecipe.equals("Chicken Hakka Noodles")){

    image.setImageResource(R.drawable.hakkanoodles);

    text2.setText("INGREDIENTS:\n\n" +
            "Noodles 2 cups\n" +
            "Dried red chilies 3\n" +
            "Ginger 1 inch piece\n" +
            "Garlic 2 tsp (chopped)\n" +
            "Capsicum 1 (sliced)\n" +
            "Carrot 1 (thinly sliced)\n" +
            "Spring onion 2 (chopped)\n" +
            "Soys sauce 2 tsp\n" +
            "Chicken 300 gm (cooked)\n" +
            "Salt to taste\n" +
            "Vinegar 1 tsp\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Grind red chilies, ginger and garlic.\n" +
            "Heat oil in a pan, add the chili paste and sauté for a minute.\n" +
            "Now add capsicum and carrot. Fry till it tenders.\n" +
            "Put spring onion and stir fry for 2-3 minutes.\n" +
            "Add in soya sauce and chicken pieces and toss well.\n" +
            "Now add noodles and salt (to taste) and mix well.\n" +
            "Add vinegar and mix it well.\n" +
            "Hakka Noodles is ready to serve.\n");

}

if(foodrecipe.equals("Chicken Chowmein")){

    image.setImageResource(R.drawable.chickenchowmein);


    text2.setText("INGREDIENTS:\n\n" +
            "Spaghetti 1 kg\n" +
            "Chicken 1/2 kg\n" +
            "Carrots 3 (thinly sliced)\n" +
            "Spring onion 1/2 bundle\n" +
            "Green/ Red Capsicum 1 (thinly sliced)\n" +
            "Black pepper 3 tsp or up to taste\n" +
            "Chili Sauce 1/4 cup or to taste\n" +
            "Tomato sauce 1/4 cup or up to taste\n" +
            "Soy Sauce 1/4 cup or up to your taste\n" +
            "Salt to taste\n" +
            "Garlic and ginger paste 2 tbsp\n" +
            "Eggs (optional) 2\n" +
            "Water as required\n" +
            "Oil 3 tbsp for fry\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "For Boil Chicken: Get a saucepan and pour 4 cups water, then add the garlic and ginger paste add the chicken when water gets its first boil.\n" +
            "Keep checking every 10 minutes to see if the chicken is cooked or not.\n" +
            "For Boil Spaghetti: Add 9 cups of water to another saucepan and wait for it to boil completely. Then add the spaghetti with the salt and oil, so they don't stick together.\n" +
            "Get a large fry pan and add the vegetables, chicken and spaghetti together. Add the black pepper, chili sauce, tomato sauce, soy sauce and mix until all the ingredients are combined together.\n" +
            "At the end if you want get the eggs and whisk them to together. After that fry it and break into pieces and spread over the spaghetti.\n");

}

if(foodrecipe.equals("Chicken Corn Soup")){

    image.setImageResource(R.drawable.cornsoup);

    text2.setText("INGREDIENTS:\n\n" +
            "Chicken fillet 4\n" +
            "Chicken bones 1kg\n" +
            "Cream style corn 1tin\n" +
            "Eggs 2\n" +
            "White pepper powder 1tsp\n" +
            "Sugar 1tsp\n" +
            "Sesame oil 1tsp\n" +
            "Chicken flour 1tbsp\n" +
            "Corn flour 3-4tbsp\n" +
            "Oil 2tbsp\n" +
            "Salt to taste\n" +
            "For the stock\n" +
            "Bay leaves 1\n" +
            "Garlic cloves 4\n" +
            "black pepper corns \n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Wash the chicken bones, boil them in 3 cups of water along with the black pepper corns, garlic cloves, and bay leaves when cooked fully strain the stock.\n" +
            "In a separate sauce pan boil together the stock and corn.\n" +
            "When uniformly mixed add the shredded chicken fillet, salt, sugar and whit pepper powder.\n" +
            "Mix corn flour and 1tbsp chicken flour in water and stir into the stock.\n" +
            "When the mixture thickens turn the flame off.\n" +
            "After 5 minutes beat the eggs into the soup.\n" +
            "Heat sesame oil and pour into the soup.\n" +
            "Serve with vinegar, Soya sauce, green chilies and chili sauce.\n");
}
if (foodrecipe.equals("Spicy Fried Rice")){
image.setImageResource(R.drawable.spicyfriedrice);

    text2.setText("INGREDIENTS:\n\n" +
            "Rice 2 cup\n" +
            "White vinegar 2 tbsp\n" +
            "Salt to taste\n" +
            "Oil ½ cup\n" +
            "Garlic 4 (chopped)\n" +
            "Yellow food color as required\n" +
            "Egg 3\n" +
            "Red chili flakes 1 tsp\n" +
            "Carrots 2 (chopped)\n" +
            "Capsicum 2 (chopped)\n" +
            "Mushroom 1 tin (sliced)\n" +
            "Soya sauce 2 tbsp\n" +
            "Brown sugar 1 tsp\n" +
            "Sesame seed oil 1 tsp\n" +
            "Spring onion leaves 1 cup (chopped)\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Wash and soak rice and boil them along with 1 tbsp white vinegar and salt.\n" +
            "Boil them for 5 minutes and drain the water.\n" +
            "Take some oil in the pan, add in chopped garlic and fry it till golden brown.\n" +
            "Add in some yellow food color in the eggs along with 1 tsp red chili flakes.\n" +
            "Beat them and keep on moving the spoon quickly.\n" +
            "When the egg it fried cut it into pieces and keep it aside.\n" +
            "Stir fry carrot, capsicum and mushroom.\n" +
            "Add in 1 tbsp white vinegar, soya sauce and brown sugar.\n" +
            "Add in the rice and mix everything.\n" +
            "Add in sesame seed oil.\n" +
            "Take it out in dish and garnish with eggs and spring onion leaves.\n" +
            "Serve hot.\n");
}
if(foodrecipe.equals("Sweet And Sour Pasta Salad")){
image.setImageResource(R.drawable.pastasalad);

    text2.setText("INGREDIENTS:\n\n" +
            "Shell pasta ½ packet\n" +
            "Tomato ketchup 1 cup\n" +
            "Pineapple cubes 1 tin\n" +
            "Cucumber sliced 2\n" +
            "Carrot sliced 2\n" +
            "Capsicum sliced 2\n" +
            "Boiled almond 10\n" +
            "Parsley as required\n" +
            "Black pepper crushed ½ tbsp\n" +
            "Brown sugar 2 tbsp\n" +
            "Salad oil 2 tbsp\n" +
            "Lemon juice 2 tbsp\n" +
            "Brown vinegar 3 tbsp\n" +
            "Oil for stir frying 2-3 tbsp\n" +
            "Salt to taste\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "In a large pot of boiling, salted water cook the pasta to al dente.\n" +
            "Drain, place in a large bowl and set aside.\n" +
            "To make the dressing mix together tomato, ketchup, brown vinegar, brown sugar, salad oil and salt.\n" +
            "Place the drained pasta in a large bowl.\n" +
            "Finely slice cucumber, carrot and capsicum.\n" +
            "Mix with the pasta along with the pineapple chunks.\n" +
            "Pour the dressing over the pasta.\n" +
            "Add lemon juice, black pepper, salt and chopped parsley.\n" +
            "Gently mix the salad cover and refrigerate for 30 minutes.\n" +
            "Before serving garnish with stir fried almonds.\n");
}
if (foodrecipe.equals("Chicken Tikka")){
    image.setImageResource(R.drawable.chickentikka);

    text2.setText("INGREDIENTS:\n\n" +
            "Chicken tikka pieces (large sized) 4\n" +
            "Ginger garlic paste 1.5 tsp\n" +
            "All spice powder (garam masala) 1 tsp\n" +
            "Red chili powder 1.5 tsp\n" +
            "Lemon juice 2 lemons\n" +
            "Cumin (crushed) 1 tsp\n" +
            "Yellow food color 1/2 tsp\n" +
            "Salt as to taste\n" +
            "Onion (crushed) 1\n" +
            "Yogurt 1 small bowl\n" +
            "Sugar 1 tsp\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Take a bowl and add yogurt in it.\n" +
            "Also add chicken, lemon juice, cumin, red chili powder, all spice powder and mix well.\n" +
            "Cover the bowl with a clean plastic sheet.\n" +
            "And leave it in refrigerator for at least an hour.\n" +
            "Preheat the grill at high heat.\n" +
            "Oil the grill lightly.\n" +
            "Now thread chicken onto skewers or roast it whole.\n" +
            "Grill the chicken till the juices run clear.\n" +
            "Approximately it is 5 minutes on each side.\n" +
            "Now serve the well cooked tikka.\n");
}
if (foodrecipe.equals("Khoya Seekh Kabab")){

image.setImageResource(R.drawable.seekhkabab);

    text2.setText("INGREDIENT:\n\n" +
            "Fine Mince ½ kg\n" +
            "Salt 1 tsp heaped\n" +
            "Chili powder 1 tsp\n" +
            "All spice 1 tsp\n" +
            "Onion 2 tbsp (chopped)\n" +
            "Coriander leaves 2 tbsp (chopped)\n" +
            "Green chilies 1 tbsp (chopped)\n" +
            "Ginger garlic paste 1 tbsp\n" +
            "Clarified butter 2 tbsp\n" +
            "Solid milk ½ cup\n" +
            "Oil 2 tbsp\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Marinate mince with salt, chili powder, all spice, onion, coriander leaves, green chilies, ginger garlic paste, clarified butter and solid milk.\n" +
            "Make seekh kababs shape.\n" +
            "Shallow fry in oil, give simmer of charcoal.\n" +
            "Serve with chutney.\n");
}

if(foodrecipe.equals("Behari Boti")){

    image.setImageResource(R.drawable.behariboti);


    text2.setText("INGREDIENTS:\n\n" +
            "Undercut steak pieces 1 kg\n" +
            "Yogurt\t100 grams\n" +
            "Papaya paste\t3 tbsp\n" +
            "Onion (fried and ground)\t1\n" +
            "Ginger/garlic paste\t2 tbsp\n" +
            "Roasted and crushed cumin seeds\t1 tsp\n" +
            "Crushed red chillies\t1 tsp\n" +
            "Hot spices powder\t1 tsp\n" +
            "Turmeric powder\t½ tsp\n" +
            "Roasted & ground Bengal grams\t4 tbsp\n" +
            "Mustard oil\t4 tbsp\n" +
            "Salt\tto taste\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Marinate steak pieces with papaya paste for at least 4 hours.\n" +
            "Mix steak pieces, onion, yogurt, ginger/garlic, mustard oil, turmeric powder, hot spices powder, red chillies, cumin seeds, grams and salt in a bowl.\n" +
            "After 1 hour you can either put them on skewers and cook them over coals, steam and fry them\n" +
            "You can also cook it in the oven.\n" +
            "Garnish with sliced lemon,coriander leaves,green chillies and sliced onion.\n" +
            "Serve delicious Bihari Boti with ‘roti, salad, raita and tamarind/mint chtuney.\n");
}
if(foodrecipe.equals("Beef Tikka")){
image.setImageResource(R.drawable.beeftikka);

    text2.setText("INGREDIENTS:\n\n" +
            "Beef 250 gm (cubed)\n" +
            "Raw papaya paste 2 tsp\n" +
            "Ginger paste 1/2 tsp\n" +
            "Garlic paste 1/2 tsp\n" +
            "Salt to taste\n" +
            "Yogurt 2 tsp\n" +
            "Red chili powder 1 tsp or to taste\n" +
            "Green chillies 1 tsp (chopped)\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Add all the ingredients in a bowl and mix well.\n" +
            "Let the beef marinate in it for 5 - 6 hours.\n" +
            "Put the marinated beef on skewers.\n" +
            "Barbeque on coal or grill on flame.\n" +
            "Serve hot with mint chutney, rice and salad.\n");
}

if(foodrecipe.equals("Mutton Tikka")){
image.setImageResource(R.drawable.muttontikka);

    text2.setText("INGREDIENTS:\n\n" +
            "Mutton meat 1 kg (champ meat is better)\n" +
            "Red pepper 1 tbsp (crushed)\n" +
            "Black pepper 1 tsp (crushed)\n" +
            "Salt to taste\n" +
            "Cooking oil 4 tbsp\n" +
            "White cumin 1 tsp (roasted and crushed)\n" +
            "Raw papaya 1 tbsp (ground with peel)\n" +
            "Lemon 4\n\n" +
            "COOKIND DIRECTIONS:\n\n" +
            "Marinate meat with all spices and lemon juice. Leave it for 2 hours.\n" +
            "Then do on coal stove and thread 3 to 4 meat pieces over skewers and do bbq for a while.\n" +
            "Then apply little oil over meat pieces and remove after 2 minutes.\n" +
            "Serve hot with green chutney, onion rings and parathas.\n");
}

if(foodrecipe.equals("Grilled Kabab")){

    image.setImageResource(R.drawable.grillkabab);
    text2.setText("INGREDIENTS:\n\n" +
            "Mutton or beef mince 1 kg\n" +
            "Red chili powder 1 tsp\n" +
            "Pounded chili 1/2 tsp\n" +
            "All spices powder 1/2 tsp\n" +
            "Pepri powder 1/2 tsp\n" +
            "Kabab cheni 1/2 tsp\n" +
            "Bread slices 2\n" +
            "Cumin seed powder 1 tbsp (roasted)\n" +
            "Green chilies 8-10\n" +
            "Ginger garlic paste 2 tbsp\n" +
            "Onion 1 small\n" +
            "Raw papaya (skinned, paste) 2 tbsp\n" +
            "Lemon 1\n" +
            "Salt to taste\n" +
            "Oil as required\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Mix all ingredients and chopperize into food processor.\n" +
            "Marinate for 1 hour in refrigerator. \n" +
            "Make oval flat shaped kababs and grill on charcoal one by one. \n" +
            "Oil with brush and turn until tenderize well.\n" +
            "Serve with pori paratha, green chutney and onion rings.\n");

}

if(foodrecipe.equals("Handi Chargha")){

    image.setImageResource(R.drawable.handichargha);

    text2.setText("INGREDIENTS:\n\n" +
            "Chicken 1 kg whole\n" +
            "Curry powder 1 tsp (heaped)\n" +
            "Salt 1 tsp\n" +
            "Chili powder 1 tsp\n" +
            "Yogurt ¾ cups\n" +
            "Black pepper 1 tsp\n" +
            "Ginger garlic paste 1 tbsp\n" +
            "Vinegar 2 tbsp\n" +
            "Orange red color quarter tsp\n" +
            "Chaat masala ½ tsp\n" +
            "Lemon juice 2 tbsp\n\n" +
            "COOKING DIRECTIONS\n\n" +
            "Give cuts on chicken, marinate with vinegar and half tsp salt for 30 minutes.\n" +
            "Mix rest of the ingredients in a bowl.\n" +
            "Remove water from chicken, and marinate with mixed spices for another 2 hours.\n" +
            "Cook in a handi till water dries, deep fried from both side until golden.\n" +
            "Sprinkle chaat masala and lemon juice. Serve warm.\n");


}

if(foodrecipe.equals("Tandoori Chicken Masala")){

image.setImageResource(R.drawable.tandoorichicken);
    text2.setText("INGREDIENTS:\n\n" +
            "Chicken 1 ½ kg (whole)\n" +
            "Lemon 4\n" +
            "Yogurt 1 cup\n" +
            "White vinegar ½ cup\n" +
            "Food color pinch\n" +
            "Red chilli crushed 1 tsp\n" +
            "Black pepper crushed 1 tsp\n" +
            "Ginger garlic paste 1 tbsp\n" +
            "Tandoori chicken masala 2 to 3 tbsp\n" +
            "Oil as required\n" +
            "Salt to taste\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Wash chicken, apply vinegar and pinch of food color on chicken.\n" +
            "In a bowl add yogurt, crushed red chili, crushed black pepper, ginger garlic paste, tandoori chicken masala and salt to mix and marinate chicken in it.\n" +
            "Now pour lemons juice on chicken and give steam and cover the lid.\n" +
            "When chicken water dries, deep fry it on low flame.\n" +
            "When it turns golden brown, put it in oven and bake it for 10 minutes.\n" +
            "Tandoori chicken is ready.\n");
}

if(foodrecipe.equals("Chocolate And Coffee Roulade")){

    image.setImageResource(R.drawable.chocolatecoffeeroulade);


    text2.setText("INGREDIENTS:\n\n" +
            "For the Sponge:\n" +
            "Caster sugar 9 tbsp\n" +
            "Eggs 6 (separated)\n" +
            "Cocoa powder 4 tbsp\n" +
            "For the Filling:\n" +
            "Caster sugar 1 tbsp\n" +
            "Icing sugar 1 oz (sifted)\n" +
            "Instant coffee powder 1 tbsp\n" +
            "Double cream 250 ml\n" +
            "Butter 1 oz\n" +
            "Chopped Walnuts ½ cup\n" +
            "For Coffee Glace Icing:\n" +
            "Instant coffee powder 1 tsp\n" +
            "Icing sugar (sifted)\n" +
            "Edible starts in golden\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Line a 12x8 inch swiss roll tray with baking parchment paper.\n" +
            "Preheat oven at 150 degree C or at gas mark 3.\n" +
            "Take a large bowl and whisk egg whites till stiff peaks.\n" +
            "In another bowl add egg yolk and sugar beat till fluffy and light now fold cocoa powder in it till incorporate well.\n" +
            "Pour on lined swiss roll tray and bake for 15-20 minutes.\n" +
            "Now lay a towel or greased proof paper and sift cocoa powder on it and remove baked roulade and invert on it. Peel off the lined paper from roulade.\n" +
            "Filling: Put cream and icing sugar in a large bowl whisk then add coffee paste (coffee+few drops of water). Whisk more and make soft peaks.\n" +
            "In a pan melt butter add walnuts and sugar and toast for 4-5 minutes.\n" +
            "Assembling: Spread coffee icing on roulade lay evenly sprinkle walnuts, now roll in the roulade and put into fridge for firm up well.\n" +
            "Topping: Mix coffee, icing sugar and 1 tbsp of cold water take this mixture on a spoon and drizzle on roulade in zigzag then decorate with stars.\n");
}

if(foodrecipe.equals("Coconut Cake")){

    image.setImageResource(R.drawable.coconutcake);

    text2.setText("INGREDIENTS:\n\n" +
            "For coconut sponge:\n" +
            "Shredded coconut\t2 cup\n" +
            "Egg\t6\n" +
            "White flour\t250 gm\n" +
            "Icing sugar\t250 gm\n" +
            "Baking powder\t2 tbsp\n" +
            "Butter\t2 to 3 tbsp\n" +
            "Milk\tas required\n" +
            "For filling:\n" +
            "Cream\t500 gm\n" +
            "Unsalted butter 250 gm\n" +
            "Shredded coconut\t250 gm\n" +
            "Icing sugar\t250 gm\n" +
            "Rose flower\tfor garnish\n" +
            "COOKING DIRECTIONS:\n\n" +
            "For cake batter:First roast shredded coconut and put it aside.\n" +
            "In a mixing bowl add 250 gm icing sugar and 6 eggs to whisk.\n" +
            "Now add 2 tbsp of baking powder and shredded coconut and mix.\n" +
            "Fold 250 gm of white flour into the batter.\n" +
            "Pour as required milk to make smooth batter.\n" +
            "Grease a cake tin with butter.\n" +
            "Pour batter in tin and bake at 200c for 30 to 35 min.\n" +
            "For filling;Place ice cubes in a medium sized bowl.\n" +
            "Take another bowl and add 250 gm unsalted butter, 250 gm icing sugar and 500 gm cream into it.\n" +
            "Place this bowl of the bowl with ice and beat till mixture is fluffy.\n" +
            "Now slice cake horizontally, and spread filling over bottom half.\n" +
            "Place the top of the cake on top of the cream.\n" +
            "Cover the cake with the remaining cream filling.\n" +
            "Decorate with shredded coconut and rose petals.\n");
}
        if(foodrecipe.equals("Banana Chocolate Muffins")){

image.setImageResource(R.drawable.bananachocolatemuffin);
            text2.setText("INGREDIENTS:\n\n" +
                    "Eggs 2 (beaten)\n" +
                    "Bananas 3 (mashed)\n" +
                    "Water 3 ounce or 1/3 cup\n" +
                    "Oil 3 ounce or 1/3 cup\n" +
                    "Chocolate 3 ounce (chopped)\n" +
                    "Caster sugar 4 ounce or 1/2 cup\n" +
                    "All purpose flour 5 ounce or 10 tbsp\n" +
                    "Self raising flour 5 ounce\n" +
                    "Baking powder 1 tsp\n" +
                    "Baking soda 1 tsp\n" +
                    "Salt ¼ tsp\n\n" +
                    "COOKING DIRECTIONS:\n\n" +
                    "Sieve the all purpose flour, self raising flour, baking powder and baking soda.\n" +
                    "Add salt, stir in the caster sugar.\n" +
                    "Mix together bananas, eggs, water and oil in a jug.\n" +
                    "Pour this onto the dry ingredients and gently mix until just combine. \n" +
                    "Fold in the chocolates, line a 12 whole muffin tin with 12 paper cases and fill with the mixture.\n" +
                    "Bake in a pre-heated oven on 180 degree C for 30 minutes, remove and cool.\n" +
                    "Delicious banana chocolate muffins is ready to serve.\n" +
                    "Note: if you do not have self rising flour then take 10 oz of all purpose flour and 1-1/4 tsp of baking powder and 1/4 tsp of soda.\n");
        }
if(foodrecipe.equals("Oreo Ice Cream")){

    image.setImageResource(R.drawable.oreoicecream);

    text2.setText("INGREDIENTS:\n\n" +
            "Oreo cookies 16 oz packet\n" +
            "Heavy whipping cream 2 cup\n" +
            "Whole milk 1 liter\n" +
            "Condensed milk 1 can 14 oz\n" +
            "Half and half cream 2 cups\n" +
            "Rock salt 1.8 kg\n" +
            "A bag of crushed ice\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Put oreo cookies in plastic bag and crush them set a side.\n" +
            "Add crushed cookies, half and half cream, condensed milk, heavy whipping cream in container and mix.\n" +
            "Add this mixture in ice cream container mix well to combine.\n" +
            "Now add half quantity of whole milk into the line on ice cream container.\n" +
            "Put the lid of ice cream maker and cover, now place it in the center of liquid container.\n" +
            "Make a layer of rock salt around the container and cover this salt layer with ice layer, repeat layers of salt and ice till the machine covers well.\n" +
            "Start the machine and let the ice cream set for about half an hour.\n" +
            "When the machine stops cover machine with kitchen towel approx. ten minutes.\n" +
            "Now take out chilled bowls and scoop out ice cream into bowls and serve immediately.\n");
}

if(foodrecipe.equals("Brownie Fudge Ice Cream")){
    image.setImageResource(R.drawable.browniefudgeicecream);

    text2.setText("INGREDIENTS\n\n" +
            "Evaporated milk 1 can (chilled)\n" +
            "Condense milk ¾ can\n" +
            "Cream 400 gm (whipped)\n" +
            "Chocolate sauce ½ cup\n" +
            "Chocolate essence ½ tsp\n" +
            "Brownie 2 pieces (crumbled)\n" +
            "COOKING DIRECTIONS\n" +
            "Beat evaporated milk till double in volume.\n" +
            "Fold in condensed milk and whipped cream with chocolate essence and chocolate sauce.\n" +
            "Put in a air tight container for 4 hours until semi set.\n" +
            "Remove fold in crumbled brownies and leave it to set until firm.\n");
}
if(foodrecipe.equals("Shahi Kulfa")){

image.setImageResource(R.drawable.shahisulfa);
    text2.setText("IGREDIENTS:\n\n" +
            "Milk 6 cup\n" +
            "Sugar ¾ cup\n" +
            "Corn flour 4 tbsp\n" +
            "Solid milk 250 gm\n" +
            "Saffron ½ tsp\n" +
            "Kewra water 1 tbsp\n" +
            "Green cardamom ½ tsp heaped (grinded)\n" +
            "Condensed milk 4 tbsp\n" +
            "Cream 1 packet\n" +
            "For Rabbri:\n" +
            "Milk 1 ½ cup\n" +
            "Corn flour 1 tbsp\n" +
            "Zafrani kewra essence few drops\n" +
            "Condensed milk 4 tbsp\n" +
            "Almonds and pistachio for garnishing (sliced)\n\n" +
            "COOKING DIRETIONS:\n\n" +
            "Cook milk and sugar in a pan for 15 minutes till slightly reduced.\n" +
            "Dissolve corn flour in ¼ cup milk add to the boiling milk stirring cook till thick.\n" +
            "Add solid milk and remove, cool mixture.\n" +
            "Add saffron, kewra, green cardamom grinded, condensed milk and cream.\n" +
            "Put mixture in a well greased loaf tin.\n" +
            "Cover it well and freeze till set.\n" +
            "Remove and cut in slices, serve with prepared rabbri.\n" +
            "For Rabbri: Cook milk till slightly reduced, thicken with corn flour paste.\n" +
            "Remove and cool.\n" +
            "Add condensed milk and zafrani kewra essence.\n" +
            "Serve garnish with almonds and pistachio.\n");
}

if(foodrecipe.equals("Kaju Barfi")){

    image.setImageResource(R.drawable.kajubarfi);


    text2.setText("INGREDIENTS:\n\n" +
            "Cashew nuts 1 cup\n" +
            "Sugar ½ cup\n" +
            "Water ¼ cup\n" +
            "Silver paper for garnish\n" +
            "COOKING DIRECTIONS:\n\n" +
            "Put cashew in food processor and grind to a semi fine powder.\n" +
            "Add sugar and water in a pan and boil; stir until sugar melts completely.\n" +
            "Check the consistency by pouring a few drops of syrup in a little water, if it does not dissolve in water then this is the right consistency.\n" +
            "Now transfer cashew powder in sugar syrup and cook until form a thick rolling mixture. It should be flexible dough, not dry or hard.\n" +
            "When it is still warm, knead it well until smooth; don’t scrap mixture from the sides of pan as it will hard the dough.\n" +
            "If the dough becomes hard, add ½ tsp melted ghee/butter.\n" +
            "Now place a butter paper on work surface then shift dough on it and cover it another butter paper piece and roll out dough with rolling pin about ¼ inches thick.\n" +
            "Remove top butter paper and cut into diamonds shape. Garnish with silver paper.\n" +
            "Serve or store in air tight container.\n");
}

if(foodrecipe.equals("Rasmalai")){

    image.setImageResource(R.drawable.rasmalai);

    text2.setText("INGREDIENTS:\n\n" +
            "Milk powder 1 cup (Nido or any full cream powder milk)\n" +
            "Oil 2 tbsp\n" +
            "Soda 1/8 tsp\n" +
            "Egg 1\n" +
            "Ingredients For Milk Syrup:\n" +
            "Fresh milk 1-1/2 kg\n" +
            "Sugar 6 tbsp or to taste\n" +
            "Green cardamom 2,3\n" +
            "For Garnishing:\n" +
            "Pistachio 11,12(finely diced)\n" +
            "Silver leaves 2 (optional)\n\n" +
            "COOKING DIRECTIONS:\n\n" +
            "For Milk Syrup: Boil milk, add cardamoms cook on low flame until reduced to 1 kg.\n" +
            "Add sugar and adjust taste, turn the flame lower and make rasmalai balls.\n" +
            "For Rasmalai: In a large bowl add powdered milk with soda bicarb mix slightly by spoon.\n" +
            "Now add oil and mix by hand, add half egg and knead add more egg until get smooth dough.\n" +
            "Now make approx 10-11 balls quickly.\n" +
            "High the flame of milk and add all balls let cook to rise.\n" +
            "Keep the flame high to low and low to high till balls rises for 4-5 minutes.\n" +
            "Let cool and dish out rasmalai sprinkle pistachio and decorate with silver paper.\n" +
            "Refrigerate for 6-7 hours and serve chilled.\n" +
            "Tip: Avoid airy place while kneading dough otherwise dough will become dry and hard.\n" +
            "Immediately add rasmalai balls into milk.\n" +
            "Do not put rasmalai balls on colored plastic or on news paper etc to avoid color change.");
}







        }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home, menu);
        return true;

    }
@Override
    public boolean onOptionsItemSelected(MenuItem item){

    int id = item.getItemId();
    if (id== R.id.home){

        Intent intent = new Intent(Recipe.this, MainActivity.class);
startActivity(intent);
    }
return true;
}


}

