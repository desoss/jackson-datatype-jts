package com.desoss.jackson.datatype.jts;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Point;

public class PointTest extends BaseJtsModuleTest<Point> {
    @Override
    protected Class<Point> getType() {
        return Point.class;
    }

    @Override
    protected String createGeometryAsGeoJson() {
        return "{\"type\":\"Point\",\"coordinates\":[1.2345678,2.3456789]}";
    }

    @Override
    protected Point createGeometry() {
        return gf.createPoint(new Coordinate(1.2345678, 2.3456789));
    }

}
