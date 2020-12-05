public class ApiClient {

    private final Credentials credentials;

    //짝 지은 설정값은 함께 둔다.
    public ApiClient(Credentials credentials) {
        this.credentials = credentials;
    }
}