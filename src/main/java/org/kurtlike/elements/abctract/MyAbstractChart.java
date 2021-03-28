package org.kurtlike.elements.abctract;

import javafx.collections.ObservableList;
import javafx.scene.chart.Axis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public abstract class MyAbstractChart<X> {
    protected LineChart<X,X> lineChart;
    public abstract void addFunc(X [][]data, String name);
    public abstract void clearChart();
    public void insertChart(Pane pane){
        pane.getChildren().add(lineChart);
    }
}
