
public @interface TravelRequest {
    int id();
    String synopsis();
    String engineer() default "[unassigned]";
    String date() default "[unimplemented]";
}

class TestTravel {

    @TravelRequest(
        id = 112233,
        synopsis = "Teleport me",
        engineer = "Mr. Jon Carter",
        date = "04/01/3007"
    )
    public static void sendMeToMars() {}
}