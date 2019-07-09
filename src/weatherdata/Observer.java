package weatherdata;

public interface Observer {
    void update(float temperture, float humidity, float pressure);
}
