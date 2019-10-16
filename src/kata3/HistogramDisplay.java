/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Alber
 */
public class HistogramDisplay extends ApplicationFrame {
  
    public HistogramDisplay(String title) {
        super("Histograma");
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataSet dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", 
                                                        "Dominio email",
                                                        "Nº de emails",
                                                        dataset, PlotOrientation.VERTICAL, false, false,
                                                        rootPaneCheckingEnabled);
        return chart;
        }
    
    private DefaultCategoryDataSet createDataSet(){
        DefaultCategoryDataSet dataSet = new DefaultCategoryDataSet();
        dataSet.addValue(300,"","ulpgc.es");
        dataSet.addValue(400,"","ulpgc.es");
        dataSet.addValue(200,"","ulpgc.es");
        return dataSet;
    }
}
