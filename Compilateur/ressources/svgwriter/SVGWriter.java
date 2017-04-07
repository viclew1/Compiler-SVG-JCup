package svgwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import attributes.Attribute;

public class SVGWriter {

	private static List<String> lines=new ArrayList<>();
	
	private static int tabCount=0;

	public static void init()
	{
		addLine("<?xml version=\"1.0\" standalone=\"no\"?>");
		addLine("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\"");
		addLine("\"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">");
		addLine("<svg xmlns=\"http://www.w3.org/2000/svg\"");
		tabCount++;
		addLine("width=\"800\" height=\"800\" >");
	}
	
	private static String writeAttribute(Attribute a) {
		if (a==null)
			return "";
		return " style=\" "+a.getValue()+"\"";
	}
	
	public static String tab()
	{
		String tab="";
		for (int i=0;i<tabCount;i++)
			tab+="\t";
		return tab;
	}
	
	public static void addLine(String s)
	{
		lines.add(tab()+s);
	}
	
	public static void writeRect(int x, int y, int w, int h, Attribute a)
	{
		addLine("<rect x=\""+x+"\" y=\""+y+"\" width=\""+w+"\" height=\""+h+"\" "+ writeAttribute(a) +" />");
	}

	public static void writeText(int x, int y, String t, Attribute a)
	{
		addLine("<text x=\""+x+"\" y=\""+y+"\" "+ writeAttribute(a) +" >"+t+"</text>");
	}

	public static void writeCircle(int x, int y, int r, Attribute a)
	{
		addLine("<circle cx=\""+x+"\" cy=\""+y+"\" r=\""+r+"\"  "+ writeAttribute(a) +" />");
	}

	public static void writeEllipse(int cx, int cy, int rx, int ry, Attribute a)
	{
		addLine("<ellipse cx=\""+cx+"\" cy=\""+cy+"\" rx=\""+rx+"\" ry=\""+ry+"\"  "+ writeAttribute(a) +" />");
	}

	public static void writeLine(int x1, int y1, int x2, int y2, Attribute a) {
		addLine("<line x1=\""+x1+"\" y1=\""+y1+"\" x2=\""+x2+"\" y2=\""+y2+"\" "+ writeAttribute(a) +" />");
	}
	
	public static void beginGroup(int x, int y, Attribute a) {
		addLine("<g x=\""+x+"\" y=\""+y+"\" "+ writeAttribute(a) +" >");
		tabCount++;
	}
	
	public static void endGroup() {
		tabCount--;
		addLine("</g>");
	}

	public static void write() throws IOException
	{
		PrintWriter writer;
		writer = new PrintWriter("out.svg", "UTF-8");
		writer.println();
		for (String s : lines)
			writer.println(s);
		writer.close();


		String fileContent="";
		for (String s : lines)
			fileContent+=s+"\n";
		fileContent+="</svg>";
		File file = new File("out.svg");

		if (!file.exists()) 
			file.createNewFile();

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(fileContent);
		bw.close();
	}



}
