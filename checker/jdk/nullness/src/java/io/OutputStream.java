package java.io;

import org.checkerframework.checker.nullness.qual.Nullable;


public abstract class OutputStream implements Closeable, Flushable {
  public OutputStream() { throw new RuntimeException("skeleton method"); }
  public abstract void write(int a1) throws IOException;
  public void write(byte[] a1) throws IOException { throw new RuntimeException("skeleton method"); }
  public void write(byte[] a1, int a2, int a3) throws IOException { throw new RuntimeException("skeleton method"); }
  public void flush() throws IOException { throw new RuntimeException("skeleton method"); }
  public void close() throws IOException { throw new RuntimeException("skeleton method"); }
}
