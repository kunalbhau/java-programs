class Fruit
 {
 String name;
 double price;
 String taste;
 String origin;
 String color;
 
 public Fruit displayName()
 {
 System.out.println(name);
 System.out.println(this);
 return this;
 }
 public Fruit displayPrice()
 {
 System.out.println(price);
 System.out.println(this);
 return this;
 }
 public Fruit displayTaste()
 {
 System.out.println(taste);
 System.out.println(this);
 return this;
 }
 }
 