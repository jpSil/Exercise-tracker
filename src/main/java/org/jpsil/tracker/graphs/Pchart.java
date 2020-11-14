package org.jpsil.tracker.graphs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import org.jpsil.tracker.DataModel;

import java.util.ArrayList;

// Pie Chart to show percentages of exercises
public class Pchart extends PieChart {

    private ObservableList<PieChart.Data> pieChartData = FXCollections.emptyObservableList();
    private ArrayList<DataModel> dataset;

    public void setDataset(ArrayList<DataModel> dataset) {
        this.dataset = dataset;
    }

    public void populateChart() {
        for(int i = 0; i < dataset.size(); i++) {
            PieChart.Data data = new PieChart.Data(dataset.get(i).getExerciseType(), dataset.get(i).getDuration());
            pieChartData.add(data);
        }
        setData(pieChartData);
    }


}
