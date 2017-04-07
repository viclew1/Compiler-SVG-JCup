package svgImpl;

import svg.SVGContext;
import svg.SVGFactory;

public class SVGContextImpl implements SVGContext{

	private SVGFactory svg;
	
	@Override
	public SVGFactory getFactory() {
		if (svg==null)
			svg=new SVGFactoryImpl();
		return svg;
	}

}
