package com.example.roguex.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int tip = quantity/3;
    int initialPrice = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    public void submitOrder(View view) {
       // String price = "Thank You for buying "+ quantity + "cups of coffee";
        displayPrice(quantity + initialPrice);

    }
    public String walkthrough(){
        String types = "Egyptian beans, American beans, Caribbean beans, African beans";
        String prices = "$3 Egyptian, $2 American, $5 African, $4 Caribbean";
            return types + prices;

    }
    public void submitTip(View view){
        int initialTip = quantity/3;
        displayTip(initialTip);

    }
    public void viewBalance(View view){
        int balanceNow = initialPrice * quantity - tip;
        displayBalance(balanceNow);

    }

    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayTip(int number){
        TextView tipTextView = findViewById(R.id.tip_text_view);
        tipTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**private void displayExplore(){
        TextView exploreTextView = findViewById(R.id.explore);
        exploreTextView.setText("");
    }
     **/
    private void displayBalance(int number){
        TextView balanceTextView = findViewById(R.id.balance_Text_View);
        balanceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
