package com.example.keithmosley.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method is called with the order button is clicked
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        String priceMessage = "Total: $" + price;
        priceMessage = priceMessage + "\nThank you!!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays given quantity value
     */
    public void display(int number) {
        TextView quantitytextView = (TextView) findViewById(R.id.quantity_text_view);
        quantitytextView.setText("" + number);
    }

    /**
     * This method displays given quantity value
     */
    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays given text on the screen
     */
    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
