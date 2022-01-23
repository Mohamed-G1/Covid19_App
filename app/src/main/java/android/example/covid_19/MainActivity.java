package android.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
//
//public class CountryData {
//}

//    public static final String[] countryNames={
//            "USA","EGY","China","UK","Italy"
//    };
//
//
//    private static int spinner ;
//    public static final int[] countryFlag={
//            R.drawable.usa , R.drawable.egypt , R.drawable.china , R.drawable.united , R.drawable.italy
//
////    ImageView flags;
//      Spinner spinner;
         Button stat;


           protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        spinner = findViewById(R.id.spinner);
//        flags = findViewById(R.id.flag);
            stat = findViewById(R.id.stat);

//
//               Spinner spinner;
//               String country;
//
//               spinner=findViewById(R.id.spicountry);
//               country=spinner.getSelectedItem().toString();




               // Start new Statistics menu

        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i = new Intent(MainActivity.this,Statistics.class);
             startActivity(i);
            }
        });


    };



//       spinner.setAdapter(new ArrayAdapter<String>(packageName(CountryData): this, android.R.layout.simple_spinner_dropdown_item,
//           CountryData.countryNames+""));
//
//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               flags.setImageResource(CountryData.countryFlag[spinner.getSelectedItemPosition()]);
//            }
//
//        });



    }
