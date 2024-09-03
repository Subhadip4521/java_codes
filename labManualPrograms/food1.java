class Food {
    public int calories;
    int fat;
    int protein;
    int carb;
    int sugar;
  
    public int getCalories() {
      return calories;
    }
  
    public int getFood() {
      return fat + protein + carb;
    }
  }
  
  class VegFood extends Food {
    int iron;
  
    int getIron() {
      return iron;
    }
  
    void isLeafy() {
      System.out.println("This fruit is a leafy food");
    }
  
    void isWatery() {
      System.out.println("This fruit is a watery food");
    }
  }
  
  class NonVegFood extends Food {
    void istasty() {
      System.out.println("This fish is a tasty");
    }
  
    void isovercooked() {
      System.out.println("This fish is a overcooked.");
    }
    void isoily() {
      System.out.println("This chicken is a oily.");
    }
  
  }
  
  class Fruit extends VegFood {
    String dry;
    String water;
  
    void isDry() {
      System.out.println("This fruit is a dry fruit.");
    }
  
    void isWatery() {
      System.out.println("This fruit is a watery fruit.");
    }
  }
  
  class Vegetable extends VegFood {
    String leaf;
    String water;
  
    void isleafy() {
      System.out.println("This vegetable is a leafy vegetable.");
    }
  
    void isWatery() {
      System.out.println("This vegetable is a watery vegetable.");
    }
  }
  
  class Fish extends NonVegFood {
    String tasty;
    String overcooked;
  
    void istasty() {
      System.out.println("This fish is a tasty");
    }
  
    void isovercooked() {
      System.out.println("This fish is a overcooked.");
    }
  }
  
  class Chicken extends NonVegFood {
    String tasty;
    String oily;
  
    void istasty() {
      System.out.println("This chicken is a tasty");
    }
  
    void isoily() {
      System.out.println("This chicken is a oily.");
    }
  }
  
  class food1 {
    public static void main(String args[]) {
      Fruit apple = new Fruit();
      apple.calories = 50;
      apple.fat = 5;
      apple.protein = 10;
      apple.carb = 20;
      System.out.println(apple.getCalories());
      System.out.println(apple.getFood());
      VegFood v = new VegFood();
      v.isWatery();
      Fish rohuFish = new Fish();
      rohuFish.calories = 240;
      rohuFish.fat = 14;
      rohuFish.protein = 28;
      rohuFish.carb = 00;
      System.out.println(rohuFish.getCalories());
      System.out.println(rohuFish.getFood());
      NonVegFood f = new NonVegFood();
      f.istasty();
      
  
    }
  }