
package dao;

import java.io.IOException;
import java.util.Collection;


public interface crud <T >  {
  public void create (T t)throws IOException ;
  Collection<T> getAll() throws IOException; 
}
