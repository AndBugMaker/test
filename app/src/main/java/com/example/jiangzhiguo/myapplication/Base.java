package com.example.jiangzhiguo.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangzhiguo on 18/9/5.
 */

public class Base<T extends Number> {

   private T data;
  public T get(){
      return data;
  }
  public void set(T t){
      data = t;
  }
}
class Sub<V,T> extends Base{

    @Override
    public String toString() {
        set(2);
        return super.toString();
    }
}
