package org.example;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasKey;

public class RandomUserRN {
    RandomUserURL url = new RandomUserURL();
    String urlBase = url.urlProducao();

    @Test
    public void retornarListaVinteUsuarios()
    {
        given().
            param("results", 20).
        when().
            get(urlBase).
        then().
            body("info.results", is(20));
    }

    @Test
    public void retornarUsuarioNacionalidadeBrasileiro() {
        given().
            param("nat", "BR").
        when().
            get(urlBase).
        then().
            body("results[0].nat", is("BR"));
    }

    @Test
    public void retornarUsuarioNacionalidadeDefinida() {
        given().
            param("nat", "br,us,es,ca").
        when().
            get(urlBase).
        then().
            body("results[0].nat", anyOf(equalToIgnoringCase("br"),
                        equalToIgnoringCase("es"), equalToIgnoringCase("ca"),
                        equalToIgnoringCase("us")));
    }

    @Test
    public void retornarUsuarioPaginaDefinida() {
        given().
            param("page", "3").
        when().
            get(urlBase).
        then().
            body("info.page", is(3));
    }

    @Test
    public void retornarApenasDadosNomeEmail() {
        given().
            param("inc", "name, email").
        when().
            get(urlBase).
        then().
            body("results[0]", hasKey("name")).
            body("results[0]", hasKey("email")).
            body("results[0]", not(hasKey("location")));
    }
}
