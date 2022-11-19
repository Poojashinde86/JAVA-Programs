import java.util.*;

public class VectorMethodsDemo
{

  public static void main(String args[]){
{
  Vector<Integer> vectorObject = new Vector<Integer>(4);

  vectorObject.add(3);

  vectorObject.add(5);

  vectorObject.add(4);

  vectorObject.add(1);

  System.out.println("current capacity of Vector object is " +vectorObject.capacity());

  }
}