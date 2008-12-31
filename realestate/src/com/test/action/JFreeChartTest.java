package com.test.action;

import java.awt.Font;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPosition;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class JFreeChartTest extends ActionSupport {
	private JFreeChart chart;
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String execute() throws Exception {
		creatChart();
		HttpServletRequest request =(HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession session=request.getSession();
		String fileName = ServletUtilities.saveChartAsPNG(getChart(),590,430, session);	
		 url= request.getContextPath()+"/DisplayChart?filename=" + fileName;
		
		return SUCCESS;
	}

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	
	private void creatChart(){
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.setValue(10, "bb", "管理人员");
		dataset.setValue(20, "我是", "kdf");
		dataset.setValue(40, "cc", "g");
		dataset.setValue(15, "dd", "dsf");
		
		
		
		chart=ChartFactory.createBarChart3D("first","人员分布", "人员数量",dataset, PlotOrientation.VERTICAL, true, false, false);
		
		chart.setTitle(new TextTitle("某公司组织结构图", new Font("宋体", Font.BOLD
				+ Font.ITALIC, 20)));
       
		CategoryPlot plot = (CategoryPlot) chart.getPlot();
		LegendTitle legend = chart.getLegend(0); 
		legend.setItemFont(new Font("宋体",Font.ITALIC,18));
		
		CategoryAxis categoryAxis = plot.getDomainAxis(); 
		categoryAxis.setLabelFont(new Font("黑体", Font.ITALIC , 22));
		categoryAxis.setTickLabelFont(new Font("宋体" , Font.BOLD , 18)); 
		
		categoryAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		
		NumberAxis valueAxis=(NumberAxis) plot.getRangeAxis();
		valueAxis.setLabelFont(new Font("宋体", Font.BOLD, 22));

		
		
	}
}
