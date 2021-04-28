package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import guru.springframework.springrestclientexamples.services.interfaces.ApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://private-1d044-apifaketory" +
                ".apiary-mock.com/api/user?limit=" + limit, UserData.class);

        return userData.getData();
    }
}
