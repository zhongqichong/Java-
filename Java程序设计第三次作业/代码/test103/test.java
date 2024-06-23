package test103;

public class test {
    public static void main(String[] args) {
        BlueToothAdapter adapter1 = BlueToothAdapter.getInstance();
        BlueToothAdapter adapter2 = BlueToothAdapter.getInstance();
        adapter1.connect();
        adapter2.connect();
        //BlueToothAdapter adapter3 = new BlueToothAdapter();
    }
}
