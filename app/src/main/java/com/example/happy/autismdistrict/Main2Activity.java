package com.example.happy.autismdistrict;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    public static final int[] JOYFUL_COLORS = {
            Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 167, 134), Color.rgb(53, 194, 209), Color.rgb(15, 179, 255), Color.rgb(171, 255, 175)
    };

    float entries[] = {
            5, 11, 6, 9, 20, 5, 11
    };
    float happy[] = {
            4, 7, 1, 3, 10, 3, 5
    };
    float sad[] = {
            1, 3, 1, 4, 7, 2, 5
    };
    float mad[] = {
            0, 1, 4, 2, 3, 0, 1
    };
    String dayNames[] = {
            "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setupPieChart();
    }

    private void setupPieChart() {
        //Populating a list of PieEntries;
        List<PieEntry> pieEntries = new ArrayList<>();
        for (int i = 0; i < entries.length; i++) {
            pieEntries.add(new PieEntry(entries[i], dayNames[i]));
        }

        PieDataSet dataSet = new PieDataSet(pieEntries, "Total of Entries");
        dataSet.setColors(JOYFUL_COLORS);
        PieData data = new PieData(dataSet);

        //Get the chart;
        PieChart chart = (PieChart) findViewById(R.id.chart);
        chart.setData(data);
        chart.invalidate();
    }
}
