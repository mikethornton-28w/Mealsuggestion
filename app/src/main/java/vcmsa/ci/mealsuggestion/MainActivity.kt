package vcmsa.ci.mealsuggestion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val timeInput=findViewById<EditText>(R.id.timeInput)
        val suggestButton=findViewById<Button> (R.id.suggestionButton)
        val suggestionText=findViewById<TextView>(R.id.suggestionText)
        val resetButton=findViewById<Button>(R.id.resetButton)

        suggestButton.setOnClickListener{
            val timeOfDayOfWeek=timeInput.text.toString().trim().lowercase()
            val mealSuggestion=when (timeOfDayOfWeek){
                "morning" -> "Breakfast: Eggs & Toast \n Oatmeal \n Chocolate Muffins with Chocolate cookies and tea \n Breakfast Burritos \n Breakfast tacos \n Waffles with Chocolate syrup \n Chocolate Chip Pancakes with syrup \n French Toast"
                    "mid-morning" -> "Snacks: Fruits \n Banana Bread \n Breakfast Chocolate Bars \n Protein Shake"
                    "afternoon" -> "Lunch: Burger and Fried Chips \n Chicken Wraps \n Pizza \n Grilled cheese sandwich \n Ramen"
                    "mid-afternoon" -> "Snacks: Yoghurt and Nuts \n Packet of Lays \n Doritos \n popcorn \n Dark Chocolate \n Smoothie "
                    "night" -> "Dinner: Macaroni and Cheese \n Pasta \n Chicken Curry \n Vegetable Soup \n spaghetti and meatballs"


            else -> "Please enter a valid time of day"}

        suggestionText.text=mealSuggestion}

        resetButton.setOnClickListener{
            timeInput.text.clear()
            suggestionText.text=""
            }
        }

}






































