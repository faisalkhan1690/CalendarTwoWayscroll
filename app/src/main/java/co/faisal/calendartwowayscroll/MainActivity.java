package co.faisal.calendartwowayscroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import co.faisal.customtwowayscroll.BaseTableAdapter;
import co.faisal.customtwowayscroll.CustomTableAdapter;
import co.faisal.customtwowayscroll.ICallback;
import co.faisal.customtwowayscroll.TableFixHeaders;

public class MainActivity extends AppCompatActivity implements ICallback {

    private List<String[]> list;
    private ArrayList<String> headers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableFixHeaders tableFixHeaders = (TableFixHeaders) findViewById(R.id.table);

        preparedata();

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int itemHW = (displaymetrics.widthPixels*15)/100;
        int headerH = (displaymetrics.widthPixels*10)/100;
        BaseTableAdapter baseTableAdapter = new CustomTableAdapter(this,list,headers,headerH,itemHW,this);
        tableFixHeaders.setAdapter(baseTableAdapter);
    }

    private void preparedata() {
        headers= new ArrayList<>();
        headers.add("");
        headers.add("2BR");
        headers.add("1SK");
        headers.add("1BR");
        headers.add("STU");
        headers.add("HU");
        headers.add("HUS");
        headers.add("KKL");

        list= new ArrayList<>();
        list.add(new String[]{"1","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"2","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"3","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"4","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"5","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"6","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"7","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"8","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"9", "AVL", "WL", "NE", "NE", "AVL", "AVL","AVL"});
        list.add(new String[]{"10", "AVL", "WL", "NE", "NE", "AVL", "AVL","AVL"});
        list.add(new String[]{"11","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"12","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"13","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"14","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"15","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"16","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"17","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"18","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"19","AVL","WL","NE","NE","AVL","AVL","AVL"});
        list.add(new String[]{"20", "AVL", "WL", "NE", "NE", "AVL", "AVL","AVL"});



    }

    @Override
    public void onClick(String date) {
        Toast.makeText(MainActivity.this, date, Toast.LENGTH_SHORT).show();
    }
}