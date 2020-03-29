package com.rhdes.covid.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.sql.Timestamp;

public class TsSerializer extends StdSerializer<Timestamp> {

    public TsSerializer() {
        this(null);
    }

    public TsSerializer(Class<Timestamp> t) {
        super(t);
    }

    @Override
    public void serialize(Timestamp timestamp, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(timestamp.getTime());
    }
}
