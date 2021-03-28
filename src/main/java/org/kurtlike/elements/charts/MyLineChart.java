package org.kurtlike.elements.charts;

import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;
import org.kurtlike.elements.abctract.MyAbstractChart;

public class MyLineChart<X> extends MyAbstractChart<X> {
    @Override
    public void addFunc(X [][]data, String name) {
        XYChart.Series<X,X> series = new XYChart.Series<X,X>();
        for(X []x: data){
            series.getData().add(new XYChart.Data<>(x[0],x[1]));
        }
        super.lineChart.getData().add(series);
        super.lineChart.setMinSize(500,500);
        super.lineChart.setAccessibleText(name);
    }

    @Override
    public void clearChart() {
        super.lineChart.getData().clear();
    }
}
