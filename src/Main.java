public class Main {

    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
	// write your code here
	    import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    public boolean equals(Rectangle other) {
        return this.length == other.length && this.width == other.width;
    }

    public boolean isSimilar(Rectangle other) {
        return (this.length / this.width == other.length / other.width) &&
               (this.length / this.width == other.width / other.length) &&
               (this.width / this.length == other.width / other.length);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first rectangle: ");
        double length1 = input.nextDouble();

        System.out.print("Enter the width of the first rectangle: ");
        double width1 = input.nextDouble();

        Rectangle rectangle1 = new Rectangle(length1, width1);

        System.out.print("Enter the length of the second rectangle: ");
        double length2 = input.nextDouble();

        System.out.print("Enter the width of the second rectangle: ");
        double width2 = input.nextDouble();

        Rectangle rectangle2 = new Rectangle(length2, width2);

        System.out.println("Perimeter of the first rectangle: " + rectangle1.getPerimeter());
        System.out.println("Area of the first rectangle: " + rectangle1.getArea());
        System.out.println("Perimeter of the second rectangle: " + rectangle2.getPerimeter());
        System.out.println("Area of the second rectangle: " + rectangle2.getArea());

        if (rectangle1.getArea() == rectangle2.getArea()) {
            System.out.println("The rectangles have the same area.");
        } else if (rectangle1.getArea() > rectangle2.getArea()) {
            System.out.println("The first rectangle has a greater area.");
        } else {
            System.out.println("The second rectangle has a greater area.");
        }

        if (rectangle1.getPerimeter() == rectangle2.getPerimeter()) {
            System.out.println("The rectangles have the same perimeter.");
        } else if (rectangle1.getPerimeter() > rectangle2.getPerimeter()) {
            System.out.println("The first rectangle has a greater perimeter.");
        } else {
            System.out.println("The second rectangle has a greater perimeter.");
        }

        if (rectangle1.isSimilar(rectangle2)) {
            System.out.println("The rectangles are similar.");
        } else {
            System.out.println("The rectangles are not similar.");
        }
    }
}

	    
	    //1
	    import java.util.Scanner;

public class Cursor {
    private int x;
    private int y;
    private boolean isHorizontal;
    private int size;

    public Cursor(int x, int y, boolean isHorizontal, int size) {
        this.x = x;
        this.y = y;
        this.isHorizontal = isHorizontal;
        this.size = size;
    }

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void setHorizontal(boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void hide() {
        System.out.println("Курсор сховано");
    }

    public void show() {
        System.out.println("Курсор показано");
    }

    public void printCursor() {
        System.out.println("Координати курсору: (" + x + ", " + y + ")");
        System.out.println("Вигляд курсору: " + (isHorizontal ? "горизонтальний" : "вертикальний"));
        System.out.println("Розмір курсору: " + size);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координату x:");
        int x = scanner.nextInt();
        System.out.println("Введіть координату y:");
        int y = scanner.nextInt();
        System.out.println("Введіть вигляд курсору (1 - горизонтальний, 0 - вертикальний):");
        boolean isHorizontal = scanner.nextInt() == 1;
        
        int size = 0;
        do {
            System.out.println("Введіть розмір курсору (від 1 до 15):");
            size = scanner.nextInt();
        } while (size < 1 || size > 15);

        Cursor cursor = new Cursor(x, y, isHorizontal, size);

        cursor.printCursor();

        System.out.println("Введіть на скільки збільшити/зменшити координату x:");
        int dx = scanner.nextInt();
        cursor.x += dx;
        System.out.println("Введіть на скільки збільшити/зменшити координату y:");
        int dy = scanner.nextInt();
        cursor.y += dy;
        System.out.println("Введіть на скільки збільшити/зменшити розмір курсору:");
        int sizeChange = scanner.nextInt();
        cursor.size += sizeChange;

        System.out.println("Змінити вигляд курсору (1 - горизонтальний, 0 - вертикальний):");
        int isHorizontalInt = scanner.nextInt();
        if (isHorizontalInt == 1) {
            cursor.setHorizontal(true);
        } else if (isHorizontalInt == 0) {
            cursor.setHorizontal(false);
        }

        cursor.printCursor();
    }
}
	    
	    //3
	    import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
   private LinkedList<Integer> queue;

   public Queue() {
      queue = new LinkedList<Integer>();
   }

   public void enqueue(int item) {
      queue.addLast(item);
   }

   public void dequeue(int itemToRemove) {
      if (!queue.isEmpty()) {
         if (queue.getFirst() == itemToRemove) {
            queue.removeFirst();
         } else {
            queue.remove((Integer) itemToRemove);
         }
      }
   }

   public boolean isEmpty() {
      return queue.isEmpty();
   }

   public boolean contains(int item) {
      return queue.contains(item);
   }

   public int size() {
      return queue.size();
   }

   public void print() {
      System.out.print("Черга: ");
      for (int item : queue) {
         System.out.print(item + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Queue queue = new Queue();

      System.out.print("Введіть елементи черги, розділені пробілом: ");
      String line = input.nextLine();
      String[] items = line.split(" ");
      for (String item : items) {
         queue.enqueue(Integer.parseInt(item));
      }

      int size = queue.size();
      System.out.println("Розмір черги: " + size);
    

      System.out.print("Введіть елементи для додавання в чергу: ");
      line = input.nextLine();
      items = line.split(" ");
      for (String item : items) {
         queue.enqueue(Integer.parseInt(item));
      }

      size = queue.size();
      System.out.println("Розмір черги: " + size);
      queue.print();

      System.out.print("Введіть елемент, який потрібно вилучити: ");
      int itemToRemove = input.nextInt();
      if (queue.contains(itemToRemove)) {
         queue.dequeue(itemToRemove);
         System.out.println("Вилучений елемент: " + itemToRemove);
         queue.print();
      } else {
         System.out.println("Черга не містить елемент " + itemToRemove);
      }

      System.out.print("Введіть елемент, який потрібно знайти: ");
      int searchItem = input.nextInt();
      boolean contains = queue.contains(searchItem);
      System.out.println("Черга містить елемент " + searchItem +": " + contains);
   }
}







    }
}
