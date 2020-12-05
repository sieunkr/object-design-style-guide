public class HomepageController {

    private final UserRepository userRepository;
    private final ResponseFactory responseFactory;
    private final TemplateRenderer templateRenderer;

    //필요한 것의 위치가 아니라, 필요한 것 자체를 주입한다.
    public HomepageControlelr(UserRepository userRepository, ResponseFactory responseFactory, TemplateRenderer templateRenderer) {
        this.userRepository = userRepository;
        this.responseFactory = responseFactory;
        this.templateRenderer = templateRenderer;
    }

    public Response execute(Request request) {

        var user = userRepository.getRepository(User.class)
                .getById(request.get('userId'));

        return responseFactory
                .create()
                .whtiContent();
                //...

    }

}