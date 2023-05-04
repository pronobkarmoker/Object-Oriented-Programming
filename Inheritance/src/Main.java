public class Main {
    public static void main(String[] args) {
        Box b =new Box();
        Box b2 =new Box(7);
        Box b3 =new Box(2,4,5);
        Box b4 =new Box(b);

        BoxWeight b5 = new BoxWeight(4,5,6,7);

        BoxPrice b6 = new BoxPrice(2,4,5,6,6);
        BoxPrice b7 = new BoxPrice(b6, 7);

        System.out.println(b.h + " " + b.l + " " + b.w);
        System.out.println(b2.h + " " + b2.l + " " + b2.w);
        System.out.println(b3.h + " " + b3.l + " " + b3.w);
        System.out.println(b4.h + " " + b4.l + " " + b4.w);
        System.out.println(b5.h + " " + b5.l + " " + b5.w + " " + b5.weight);
        System.out.println(b6.h + " " + b6.l + " " + b6.w + " " + b6.weight + " " + b6.price);
        System.out.println(b7.h + " " + b7.l + " " + b7.w + " " + b7.weight + " " + b7.price);

    }
}