package com.example.hugo.myapplication;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitOrder(View v) {
        String message = "Total: " + quantity;
        int price = calculatePrice(quantity);
        message = message + "\nValor: R$" + price;
        message = message + "\nObrigado!";


        displayMessage(message);
    }

    public void increment_(View v) {
        quantity++;
        display(quantity);
    }

    public void decrement_(View v) {
        --quantity;
        display(quantity);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }



    private void displayMessage(String message) {
        TextView messageTextView = (TextView) findViewById(R.id.price_textview);
        messageTextView.setText(message);
    }


    private int calculatePrice(int quantity) {
        int price = quantity * 5;
        return price;
    }
}
