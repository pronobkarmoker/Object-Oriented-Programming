//single Inheritance
public class BoxWeight extends Box {
    int weight;

    BoxWeight(){
        this.weight= -1;
    }

    public BoxWeight(int h, int l, int w, int weight) {
        super(h, l, w);
        //System.out.println(super.l);  as this = super
        this.weight = weight;
    }

    public BoxWeight(Box old, int weight) {
        super(old);
        this.weight = weight;
    }

    public BoxWeight(BoxPrice old) {
        super(old);
        this.weight = old.weight;
    }
}
