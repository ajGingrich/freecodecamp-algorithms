public class Data {

    public String key;
    public int value;

    Data(String name, int num){
        key = name;
        value = num;
    }

    public String getData() {
        return key + ": " + value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }
}