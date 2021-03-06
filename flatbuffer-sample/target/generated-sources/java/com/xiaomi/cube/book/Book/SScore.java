// automatically generated by the FlatBuffers compiler, do not modify

package com.xiaomi.cube.book.Book;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SScore extends Table {
  public static SScore getRootAsSScore(ByteBuffer _bb) { return getRootAsSScore(_bb, new SScore()); }
  public static SScore getRootAsSScore(ByteBuffer _bb, SScore obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public SScore __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String id() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer idAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public double s() { int o = __offset(6); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public boolean mutateS(double s) { int o = __offset(6); if (o != 0) { bb.putDouble(o + bb_pos, s); return true; } else { return false; } }

  public static int createSScore(FlatBufferBuilder builder,
      int idOffset,
      double s) {
    builder.startObject(2);
    SScore.addS(builder, s);
    SScore.addId(builder, idOffset);
    return SScore.endSScore(builder);
  }

  public static void startSScore(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addS(FlatBufferBuilder builder, double s) { builder.addDouble(1, s, 0.0); }
  public static int endSScore(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

