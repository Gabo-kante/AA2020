/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa.Data;


import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author gabri
 */
public class Grafica {
   
    private JFreeChart grafica;
    private XYSeriesCollection series;
    private String ejeX, ejeY,titulo;
    
    public Grafica(String ejeX, String ejeY, String titulo) {
        this.grafica = null;
        this.series = new XYSeriesCollection();
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.titulo = titulo;
    }
    
    public void agrearSerie(String nombre){
     XYSeries serie = new XYSeries(nombre);
     this.series.addSeries(serie);
    }
    
    public void agregarDatoASerie(String nombre, XYDataItem dato)   {
       this.series.getSeries(nombre).add(dato);
    }
     
    public void agregarSerie(String nombre, double[] datos){
        XYSeries serie = new XYSeries(nombre);
        // agregar cada uno de los datos en la serie 
        for (int x=0; x < datos.length;x++){
            serie.add(x, datos[x]);
        }
        // agregamos la serie que se genera 
        this.series.addSeries(serie);
    }
    public JFreeChart getGrafica(){
        return this.grafica;
    }
    public void crearGrafica(){
        this.grafica = ChartFactory.createXYAreaChart(titulo, ejeX, ejeY, series);
        XYPlot plot =this.grafica.getXYPlot();
        
        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();
        render.setSeriesPaint(0, Color.blue);
        render.setSeriesPaint(1, Color.red);
        render.setSeriesPaint(2, Color.green);
        render.setSeriesPaint(3, Color.orange);
        render.setSeriesPaint(4, Color.black);
        
        render.setSeriesStroke(0, new BasicStroke(1.0f));
        render.setSeriesStroke(1, new BasicStroke(1.0f));
        render.setSeriesStroke(2, new BasicStroke(1.0f));
        render.setSeriesStroke(3, new BasicStroke(1.0f));
        render.setSeriesStroke(4, new BasicStroke(1.0f));
        
        plot.setRenderer(render);
    }
     public void muestraGrafica(){
        ChartFrame frame = new ChartFrame("Análisis de Algoritmos", grafica);
        frame.setVisible(true);
        frame.setSize(500,370);   
    }
}
