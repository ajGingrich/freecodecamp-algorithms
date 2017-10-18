import javax.json.*;

public class HelloWorld {

    public static void main(String[] args) {

        //create JSON object
        JsonObject collection = Json.createObjectBuilder()
                .add("2548", Json.createObjectBuilder()
                        .add("album", "Slippery When Wet")
                        .add("artist", "Bon Jovi")
                        .add("tracks", Json.createArrayBuilder()
                                .add("Let It Rock")
                                .add("You Give Love a Bad Name")))
                .add("2468", Json.createObjectBuilder()
                        .add("album", "1999")
                        .add("artist", "Prince")
                        .add("tracks", Json.createArrayBuilder()
                                .add("1999")
                                .add("Little Red Corvette")))
                .add("1245", Json.createObjectBuilder()
                        .add("artist", "Robert Palmer")
                        .add("tracks", "stuff")
                        .add("tracks", Json.createArrayBuilder()))
                .add("5439", Json.createObjectBuilder()
                        .add("album", "ABBA Gold"))
                .build();

        String res = updateCollection(2468, "artist", "", collection).toString();
        System.out.println(res);
    }

    private static JsonObject updateCollection(int id, String prop, String value, JsonObject data) {
        // javax objects are immutable so can't be edited in Java
        return data;
    }
}