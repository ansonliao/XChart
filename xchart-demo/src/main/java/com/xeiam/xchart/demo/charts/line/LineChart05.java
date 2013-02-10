/**
 * Copyright 2011-2013 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xchart.demo.charts.line;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.ChartBuilder;
import com.xeiam.xchart.SwingWrapper;
import com.xeiam.xchart.style.theme.GGPlot2Theme;

/**
 * GGPlot2 Theme
 * <p>
 * Demonstrates the following:
 * <ul>
 * <li>Building a Chart with ChartBuilder</li>
 * <li>Applying the GGPlot2 Theme to the Chart</li>
 * </ul>
 */
public class LineChart05 implements ExampleChart {

  public static void main(String[] args) {

    ExampleChart exampleChart = new LineChart05();
    Chart chart = exampleChart.getChart();
    new SwingWrapper(chart).displayChart();
  }

  @Override
  public Chart getChart() {

    // Create Chart
    Chart chart = new ChartBuilder().width(800).height(600).theme(new GGPlot2Theme()).build();

    // new LineChart(800, 600);

    // Customize Chart
    chart.setChartTitle("Example5");
    chart.setXAxisTitle("X");
    chart.setYAxisTitle("Y");

    chart.addSeries("vertical", new double[] { 1, 1 }, new double[] { -10, 10 });
    chart.addSeries("horizontal", new double[] { -10, 10 }, new double[] { 0, 0 });

    return chart;
  }

}
