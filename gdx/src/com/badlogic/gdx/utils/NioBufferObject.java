package com.badlogic.gdx.utils;

import java.nio.ByteBuffer;

public interface NioBufferObject {
    // Writes the contents of this object to a buffer
    // The implementation may choose to add padding so that
    // Repeat objects are aligned
    // It would be good if the implementor specified how many bytes
    // This operation will take (including padding) & the alignment it expects.
    // Size: 64 bytes, Alignment: 16 bytes
    // for example.
    void  writeToBuffer(ByteBuffer buffer);

    // Reads the contents of the buffer to this struct
    // The position of the buffer should take into account the padding of the
    // implementation.
    void readFromBuffer(ByteBuffer buffer);
}
