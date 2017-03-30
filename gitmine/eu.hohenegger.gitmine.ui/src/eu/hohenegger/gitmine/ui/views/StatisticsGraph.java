/*******************************************************************************
 * Copyright (c) 2012 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.gitmine.ui.views;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.nebula.visualization.xygraph.dataprovider.CircularBufferDataProvider;
import org.eclipse.nebula.visualization.xygraph.dataprovider.Sample;
import org.eclipse.nebula.visualization.xygraph.figures.Axis;
import org.eclipse.nebula.visualization.xygraph.figures.ToolbarArmedXYGraph;
import org.eclipse.nebula.visualization.xygraph.figures.Trace;
import org.eclipse.nebula.visualization.xygraph.figures.Trace.BaseLine;
import org.eclipse.nebula.visualization.xygraph.figures.Trace.PointStyle;
import org.eclipse.nebula.visualization.xygraph.figures.Trace.TraceType;
import org.eclipse.nebula.visualization.xygraph.figures.XYGraph;
import org.eclipse.nebula.visualization.xygraph.linearscale.AbstractScale.LabelSide;
import org.eclipse.nebula.visualization.xygraph.util.XYGraphMediaFactory;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class StatisticsGraph extends Figure {
	private final List<String> axisNames = new ArrayList<>();
	public XYGraph xyGraph;
	public Runnable updater;
	
	@Inject
	private IEclipseContext iEclipseContext;

	private final ToolbarArmedXYGraph toolbarArmedXYGraph;


	public StatisticsGraph() {
		xyGraph = ContextInjectionFactory.make(XYGraph.class, iEclipseContext);

		Axis xAxis = xyGraph.primaryXAxis;
		Axis yAxis = xyGraph.primaryYAxis;

		xyGraph.setTitle("Commits per day");
		xyGraph.setFont(XYGraphMediaFactory.getInstance().getFont(XYGraphMediaFactory.FONT_TAHOMA));
		xAxis.setTitle("Date");
		yAxis.setTitle("Commits");
		yAxis.setAutoScale(true);
		xAxis.setAutoScale(true);

		xAxis.setShowMajorGrid(true);
		yAxis.setShowMajorGrid(true);

		toolbarArmedXYGraph = new ToolbarArmedXYGraph(xyGraph);
		add(toolbarArmedXYGraph);

		xyGraph.setFocusTraversable(true);
		xyGraph.setRequestFocusEnabled(true);

		xyGraph.getPlotArea().addMouseListener(new MouseListener.Stub() {
			@Override
			public void mousePressed(final MouseEvent me) {
				xyGraph.requestFocus();
			}
		});


	}

	@Override
	protected void layout() {
		toolbarArmedXYGraph.setBounds(bounds.getCopy().shrink(5, 5));
		super.layout();
	}


	public void addCurve(String string, final List<Integer> list, RGB rgbColor, String formatPattern, boolean autoScale) {
		axisNames.add(string);
		Color color = XYGraphMediaFactory.getInstance().getColor(rgbColor);

		final Axis yAxis = new Axis(string, true);
		yAxis.setFormatPattern(formatPattern);
		yAxis.setAutoScale(autoScale);
		yAxis.setForegroundColor(color);
		yAxis.setTickLableSide(LabelSide.Secondary);
		xyGraph.addAxis(yAxis);

		final CircularBufferDataProvider traceProvider = new CircularBufferDataProvider(
				true);
		traceProvider.setBufferSize(list.size());


		Trace newTrace = new Trace(string, xyGraph.primaryXAxis,
				yAxis, traceProvider);
		newTrace.setForegroundColor(color);
		newTrace.setDataProvider(traceProvider);
		newTrace.setTraceType(TraceType.SOLID_LINE);
		newTrace.setLineWidth(1);
		newTrace.setPointStyle(PointStyle.POINT);
		newTrace.setPointSize(1);
		newTrace.setBaseLine(BaseLine.NEGATIVE_INFINITY);
		newTrace.setAntiAliasing(true);

		newTrace.setTraceColor(color);

		xyGraph.addTrace(newTrace);
		
		fill(list, traceProvider);
		
		Display.getCurrent().timerExec(100, updater);
	}

	public void fill(final List<Integer> list, final CircularBufferDataProvider traceProvider) {
		updater = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < list.size(); i++) {
					traceProvider.addSample(new Sample(i, list.get(i)));
					
				}
			}
		};
		
	}
}