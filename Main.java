
interface myShow{
  void show();
}

interface mySecShow{
  void showTwo(int i);
}

/*No class needed to implement the interface*/
// class theShow implements myShow{

//   public void show(){
//     System.out.println("hey show");
//   }
// }

class Main {
  public static void main(String[] args) {

    /*old way of create theShow object and call show method*/
    // myShow s = new theShow();
    // s.show();

    /*Lambda way*/
    myShow s = ()-> {System.out.println("hey Lambda show");
    };

    mySecShow s2 = (i) -> {
      System.out.println("hey 2nd Lambda show: " + i);
    };

    s.show();
    s2.showTwo(88);
    
  }
}