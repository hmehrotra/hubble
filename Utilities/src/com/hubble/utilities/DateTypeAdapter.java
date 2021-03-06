package com.hubble.utilities;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A default type adapter for a {@link Date} object.
 * @author Joel Leitch
 */
public class DateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {

    private final DateFormat format = new SimpleDateFormat("MMM dd, yyyy");

    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext
            context) {
        String dateFormatAsString = format.format(src);
        return new JsonPrimitive(dateFormatAsString);
    }

    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext
            context)
            throws JsonParseException {
        if (!(json instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }

        try {
            return format.parse(json.getAsString());
        } catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }
}