package com.desoss.jackson.datatype.jts.parsers;

import com.desoss.jackson.datatype.jts.GeoJson;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;

public class LineStringParser extends BaseParser implements GeometryParser<LineString> {

    public LineStringParser(GeometryFactory geometryFactory) {
        super(geometryFactory);
    }

    public LineString lineStringFromJson(JsonNode root) {
        return geometryFactory.createLineString(
                PointParser.coordinatesFromJson(root.get(GeoJson.COORDINATES)));
    }

    @Override
    public LineString geometryFromJson(JsonNode node) throws JsonMappingException {
        return lineStringFromJson(node);
    }
}
