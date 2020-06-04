enum Signal {   //enum的导出类
    GREEN, YELLOW, RED  
}
class TrafficLight {
    Signal color = Signal.RED;
    
    public void change() {
        switch (color) {
          case RED: 
              color = Signal.GREEN;
              break;
          case YELLOW:
              color = Signal.RED;
              break;
          case GREEN:
              color = Signal.YELLOW;
              break;
        }
    }
}

public class Enum {
    public static void main(String args[]) {
       TrafficLight tLight = new TrafficLight();
       System.out.println(tLight.color);
       tLight.change();
       System.out.println(tLight.color);
       tLight.change();
       System.out.println(tLight.color);
    }
}