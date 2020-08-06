import processing.core.PApplet;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.AbstractShapeMarker;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * Hello World!
 * 
 * This is the basic stub to start creating interactive maps.
 */
public class HelloUCSDWorld extends PApplet {

	UnfoldingMap map;

	public void setup() {
		size(800, 600, OPENGL);

		map = new UnfoldingMap(this,50, 50, 800, 500, new Microsoft.RoadProvider());
		map.zoomToLevel(1);
		MapUtils.createDefaultEventDispatcher(this, map);
		
		//AbstractShapeMarker ASMarker = new AbstractShapeMarker(new Location(13.1f, 21.3f));
		
	}

	public void draw() {
		background(0);
		map.draw();
	}

}
