class Model {

    private int a;

    private int b;

    public Model() {
    }

    public Model(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Model{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
