package com.bedatadriven.jackson.datatype.jts;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Point;

public class D3DPointTest extends BaseJtsModuleTest<Point> {

    @Override
    protected Class<Point> getType() {
        return Point.class;
    }

    @Override
    protected String createGeometryAsGeoJson() {
        return "{\"type\":\"Point\",\"coordinates\":[1.2345678,2.3456789,200.0]}";
    }

    @Override
    protected Point createGeometry() {
        return gf.createPoint(new Coordinate(1.2345678, 2.3456789, 200.0));
    }

}
