package com.java;
import java.util.*;
public interface Idao<T> {
boolean update (T o);
boolean create (T o);
boolean delete (T o);
ArrayList<T> findAll();
T findById(int id);

}
