class all_string
{
public static void main(String args[])
{
  String a= new String("pooja");

String x=String.format(a);
  System.out.println(x);



   int b=a.indexOf('j');
  System.out.println("Indexof:- "+b);


  String c=a.toLowerCase();
  System.out.println(c);


  

boolean m=a.startsWith("  ");
  System.out.println(m);


  String  e=a.toUpperCase();
  System.out.println(e);

String s1=a.copyValueOf(s1);
  System.out.println(s1);



  int f=a.indexOf('n',1);
  System.out.println( f);



  String g=a.concat("vs");
  System.out.println(g);



  String h=a.replaceAll("  pooja","   sp ");
  System.out.println(h);


  String i=a.valueOf(a);
  System.out.println(i);

  
  int j=a.length();
  System.out.println(j);

  

  boolean l=a.endsWith(" s");
  System.out.println(l);

  

  String n=a.substring(1);
  System.out.println(n);


  int o=a.indexOf('n',0);
  System.out.println(o);


  String p=a.trim();
  System.out.println(p);


  boolean q=a.equals(a);
  System.out.println(q);

  String  r=a.substring(1,3);
  System.out.println(r);

  
  

  char[] t=a.toCharArray();
  System.out.println(t);

String d=a.replace('s','p');
  System.out.println(d);


  boolean u=a.contains("  pooja");
  System.out.println(u);


  boolean v=a.regionMatches(0,a,0,4);
  System.out.println(v);

char[] s=new char[]{'p','s','o'};



  boolean w=a.contentEquals(a);
  System.out.println(w);

String a=new.String("   pooja");
  System.out.println(( a==a));


char k=a.charAt(2);
  System.out.println(k);


  
System.out.println("name:shinde pooja shashikant    roll_no:52     class:syco       bathch:c");
}
}
