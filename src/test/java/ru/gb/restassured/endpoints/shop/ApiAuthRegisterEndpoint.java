package ru.gb.restassured.endpoints.shop;

import io.qameta.allure.Step;
import ru.gb.restassured.dto.shop.UserDto;

import static io.restassured.RestAssured.given;

@Endpoint("/auth/register")
public class ApiAuthRegisterEndpoint extends BaseEndpoint {

    @Step("{this.endpoint}: Зарегистрировать юзера")
    public UserDto registerUser(UserDto userDto) {
        return given()
                .body(userDto)
                .post(endpoint)
                .then()
                .statusCode(201)
                .extract()
                .as(UserDto.class);
    }
}
