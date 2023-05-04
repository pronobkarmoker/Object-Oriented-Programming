public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice(){
        super();
        this.price=-1;
    }

    BoxPrice(double price) {
        this.price = price;
    }

    BoxPrice(BoxPrice other, double price) {
        super(other);
        this.price = price;
    }

    BoxPrice(int h, int l, int w, int weight, double price) {
        super(h, l, w, weight);
        this.price = price;
    }
}
