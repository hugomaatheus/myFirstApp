package com.example.hugo.myapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitOrder(View v) {
        int price = calculatePrice(quantity);
        String message = createOrderSummary(price);
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
        TextView messageTextView = (TextView) findViewById(R.id.order_summary_text_view);
        messageTextView.setText(message);
    }


    private int calculatePrice(int quantity) {
        int price = quantity * 5;
        return price;
    }

    private String createOrderSummary(int price) {
        String priceMessage = "Nome: Hugo Matheus";
        priceMessage = priceMessage + "\nQuantidade: " + quantity;
        priceMessage = priceMessage + "\nTotal: R$" + price;
        priceMessage = priceMessage + "\nObrigado!";

        return priceMessage;
    }
}
