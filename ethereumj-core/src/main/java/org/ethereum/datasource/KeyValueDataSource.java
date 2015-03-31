package org.ethereum.datasource;

import java.util.Map;
import java.util.Set;

/**
 * @author Roman Mandeleil
 * @since 18.01.2015
 */
public interface KeyValueDataSource {

    void init();

    void setName(String name);

    byte[] get(byte[] key);

    byte[] put(byte[] key, byte[] value);

    void delete(byte[] key);

    Set<byte[]> keys();

    void updateBatch(Map<byte[], byte[]> rows);

    void close();
}
