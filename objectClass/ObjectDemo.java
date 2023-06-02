package objectClass;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num) {
        super();
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // num representation uniq
        }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj =  new ObjectDemo(10);
        ObjectDemo obj2 =  new ObjectDemo(10);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode()); //  it is not address
    }
}
